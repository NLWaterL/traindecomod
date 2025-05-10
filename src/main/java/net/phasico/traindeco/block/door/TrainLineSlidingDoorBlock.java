package net.phasico.traindeco.block.door;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.phasico.traindeco.registry.TrainDecoEntityTypes;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.phasico.traindeco.registry.TrainDecoSoundEvent;
import javax.annotation.Nullable;

public class TrainLineSlidingDoorBlock extends SlidingDoorBlock {
    public TrainLineSlidingDoorBlock(Properties properties) {
        super(properties, TRAIN_SET_TYPE.get(), false);
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