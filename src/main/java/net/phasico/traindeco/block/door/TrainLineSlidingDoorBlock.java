package net.phasico.traindeco.block.door;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.phasico.traindeco.registry.TrainDecoEntityTypes;

public class TrainLineSlidingDoorBlock extends SlidingDoorBlock {

    public enum Style implements StringRepresentable {
        BOTH("both"),
        FRONT("front"),
        BACK("back");

        private final String name;

        Style(String name) {
            this.name = name;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }

    }

    public static final BooleanProperty PLAYALARM = BooleanProperty.create("playalarm");

    public static final EnumProperty<Style> STYLE = EnumProperty.create("style", Style.class);

    public TrainLineSlidingDoorBlock(Properties properties) {
        super(properties, TRAIN_SET_TYPE.get(), false);
        this.registerDefaultState(this.stateDefinition.any().setValue(STYLE, Style.BOTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(STYLE);
        builder.add(PLAYALARM);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide() && player.getItemInHand(hand).is(Items.STICK)) {
            BlockPos basePos = state.getValue(HALF) == DoubleBlockHalf.UPPER ? pos.below() : pos;
            BlockPos upperPos = basePos.above();

            BlockState lowerState = level.getBlockState(basePos);
            BlockState upperState = level.getBlockState(upperPos);

            if (!(lowerState.getBlock() instanceof TrainLineSlidingDoorBlock)) return InteractionResult.PASS;
            if (!(upperState.getBlock() instanceof TrainLineSlidingDoorBlock)) return InteractionResult.PASS;

            Style current = lowerState.getValue(STYLE);
            Style[] styles = Style.values();
            int nextIndex = (current.ordinal() + 1) % styles.length;
            Style next = styles[nextIndex];

            level.setBlock(basePos, lowerState.setValue(STYLE, next), 3);
            level.setBlock(upperPos, upperState.setValue(STYLE, next), 3);

            player.displayClientMessage(Component.literal("Set style to: " + next.getSerializedName()), true);
            return InteractionResult.CONSUME;
        }
        if (!level.isClientSide() && player.getItemInHand(hand).is(Items.IRON_INGOT)) {
            BlockPos basePos = state.getValue(HALF) == DoubleBlockHalf.UPPER ? pos.below() : pos;
            BlockPos upperPos = basePos.above();

            BlockState lowerState = level.getBlockState(basePos);
            BlockState upperState = level.getBlockState(upperPos);

            if (!(lowerState.getBlock() instanceof TrainLineSlidingDoorBlock)) return InteractionResult.PASS;
            if (!(upperState.getBlock() instanceof TrainLineSlidingDoorBlock)) return InteractionResult.PASS;

            boolean newPlayAlarmValue = !lowerState.getValue(PLAYALARM); // Toggle alarm value
            BlockState newLowerState = lowerState.setValue(PLAYALARM, newPlayAlarmValue);
            BlockState newUpperState = upperState.setValue(PLAYALARM, newPlayAlarmValue);

            level.setBlock(basePos, newLowerState, 3);
            level.setBlock(upperPos, newUpperState, 3);

            if (newPlayAlarmValue) {
                player.displayClientMessage(Component.literal("Can play sound now!"), true);
            } else {
                player.displayClientMessage(Component.literal("Cannot play sound now!"), true);
            }
            return InteractionResult.CONSUME;
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    // I thought making the block door also with the sound is a good idea, but there are so many bugs about it and I couldn't fix all of them.
    // Mainly because the animation problem. If I set BlockEntity's speed to 0.5f, the door will shut before the animation stop.
    // This feature may come back in later version.

    /*protected void playAlarmSound(@Nullable Entity source, Level level, BlockPos pos, boolean isOpen){

        if (!isOpen) {
            SoundEvent alarm = TrainDecoSoundEvent.DOOR_CLOSING_ALARM.get();
            level.playSound(source, pos, alarm, SoundSource.BLOCKS, 0.25f, 1.0f);
        }
        }


    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving){
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
        boolean isPowered = isDoorPowered(level, pos, state);

        boolean lower = state.getValue(HALF) == DoubleBlockHalf.LOWER;

        TrainLineSlidingDoorBlockEntity be = (TrainLineSlidingDoorBlockEntity) getBlockEntity(level, lower ? pos : pos.below());
        if (be != null && be.deferUpdate)
            return;

        if (defaultBlockState().is(block))
            return;
        if (state.getValue(POWERED) == isPowered)
            return;

        if (isPowered != state.getValue(OPEN)) {
            this.playAlarmSound(null, level, pos, isPowered);
        }
    }*/

    @Override
    public BlockEntityType<? extends TrainLineSlidingDoorBlockEntity> getBlockEntityType() {
        return TrainDecoEntityTypes.SLIDING_DOOR.get();
    }
}