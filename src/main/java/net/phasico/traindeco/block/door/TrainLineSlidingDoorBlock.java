package net.phasico.traindeco.block.door;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.BlockHitResult;
import net.phasico.traindeco.registry.TrainDecoEntityTypes;


import net.minecraft.world.level.block.entity.BlockEntityType;
import net.phasico.traindeco.registry.TrainDecoSoundEvent;

import javax.annotation.Nullable;

public class TrainLineSlidingDoorBlock extends SlidingDoorBlock {
    public TrainLineSlidingDoorBlock(Properties properties) {
        super(properties, TRAIN_SET_TYPE.get(), false);
    }


    protected void playAlarmSound(@Nullable Entity source, Level level, BlockPos pos, boolean isOpen){
        if (!isOpen) {
            SoundEvent alarm = TrainDecoSoundEvent.DOOR_CLOSING_ALARM.get();
            level.playSound(source, pos, alarm, SoundSource.BLOCKS, 1.0f, 1.0f);
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
    }


    //will be deleted very soon
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit){
        boolean isOpen = state.getValue(DoorBlock.OPEN);
        InteractionResult result = super.use(state, level, pos, player, hand, hit);

        if (isOpen) {
            this.playAlarmSound(player, level, pos, isOpen);
            }

        return result;
    }

    /*@Override
    public void setOpen(@Nullable Entity entity, Level level, BlockState state, BlockPos pos, boolean open) {
        super.setOpen(entity, level, state, pos, open);
        if (!state.is(this))
            return;
        if (state.getValue(OPEN) == open)
            return;

        this.playAlarmSound(entity, level, pos, open);
        }*/

    @Override
    public BlockEntityType<? extends TrainLineSlidingDoorBlockEntity> getBlockEntityType() {
        return TrainDecoEntityTypes.SLIDING_DOOR.get();
    }
}