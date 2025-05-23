package net.phasico.traindeco.block.door;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlockEntity;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorRenderer;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.createmod.catnip.data.Couple;
import net.createmod.catnip.data.Iterate;
import net.createmod.catnip.math.AngleHelper;
import net.createmod.catnip.render.CachedBuffers;
import net.createmod.catnip.render.SuperByteBuffer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class TrainLineSlidingDoorBlockRenderer extends SlidingDoorRenderer {
    public TrainLineSlidingDoorBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected void renderSafe(SlidingDoorBlockEntity be, float partialTicks, PoseStack ms, MultiBufferSource buffer,
                              int light, int overlay) {
        TrainLineSlidingDoorBlockEntity be2 = (TrainLineSlidingDoorBlockEntity) be;

        BlockState blockState = be.getBlockState();
        if (!be2.shouldRenderSpecial(blockState))
            return;

        Direction facing = blockState.getValue(DoorBlock.FACING);
        Direction movementDirection = facing.getClockWise();

        if (blockState.getValue(DoorBlock.HINGE) == DoorHingeSide.LEFT)
            movementDirection = movementDirection.getOpposite();

        float value = be2.animation.getValue(partialTicks);
        float value2 = Mth.clamp(value * 10, 0, 1);

        VertexConsumer vb = buffer.getBuffer(RenderType.cutout());
        Vec3 offset = Vec3.atLowerCornerOf(movementDirection.getNormal())
                .scale(value * value * 13 / 16f)
                .add(Vec3.atLowerCornerOf(facing.getNormal())
                        .scale(value2 * 1 / 32f));

        if (((SlidingDoorBlock) blockState.getBlock()).isFoldingDoor()) {
            Couple<PartialModel> partials =
                    AllPartialModels.FOLDING_DOORS.get(ForgeRegistries.BLOCKS.getKey(blockState.getBlock()));

            boolean flip = blockState.getValue(DoorBlock.HINGE) == DoorHingeSide.RIGHT;
            for (boolean left : Iterate.trueAndFalse) {
                SuperByteBuffer partial = CachedBuffers.partial(partials.get(left ^ flip), blockState);
                float f = flip ? -1 : 1;

                partial.translate(0, -1 / 512f, 0)
                        .translate(Vec3.atLowerCornerOf(facing.getNormal())
                                .scale(value2 * 1 / 32f));
                partial.rotateCentered(
                        Mth.DEG_TO_RAD * AngleHelper.horizontalAngle(facing.getClockWise()), Direction.UP);

                if (flip)
                    partial.translate(0, 0, 1);
                partial.rotateY(91 * f * value * value);

                if (!left)
                    partial.translate(0, 0, f / 2f)
                            .rotateY(-181 * f * value * value);

                if (flip)
                    partial.translate(0, 0, -1 / 2f);

                partial.light(light)
                        .renderInto(ms, vb);
            }

            return;
        }

        for (DoubleBlockHalf half : DoubleBlockHalf.values()) {
            CachedBuffers.block(blockState.setValue(DoorBlock.OPEN, false)
                            .setValue(DoorBlock.HALF, half))
                    .translate(0, half == DoubleBlockHalf.UPPER ? 1 - 1 / 512f : 0, 0)
                    .translate(offset)
                    .light(light)
                    .renderInto(ms, vb);
        }

    }
}