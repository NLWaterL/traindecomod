package net.phasico.traindeco.block.door;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlockEntity;
import net.createmod.catnip.animation.LerpedFloat;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TrainLineSlidingDoorBlockEntity extends SlidingDoorBlockEntity {

    boolean deferUpdate;

    public LerpedFloat animation;
    public TrainLineSlidingDoorBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
        animation = LerpedFloat.linear()
                .startWithValue(isOpen(state) ? 1 : 0);
    }

    @Override
    public void tick() {
        if (deferUpdate && !level.isClientSide()) {
            deferUpdate = false;
            BlockState blockState = getBlockState();
            blockState.neighborChanged(level, worldPosition, Blocks.AIR, worldPosition, false);
        }
        boolean open = isOpen(getBlockState());
        boolean wasSettled = animation.settled();
        animation.chase(open ? 1 : 0, .15f, LerpedFloat.Chaser.LINEAR);
        animation.tickChaser();

        if (!open && !wasSettled && animation.settled() && !isVisible(getBlockState()))
            showBlockModel();

        super.tick();
    }

    @Override
    protected boolean shouldRenderSpecial(BlockState state) {
        return super.shouldRenderSpecial(state);
    }
}