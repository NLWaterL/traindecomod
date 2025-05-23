package net.phasico.traindeco.block.behaviour;

import com.simibubi.create.content.contraptions.Contraption;
import com.simibubi.create.content.contraptions.behaviour.SimpleBlockMovingInteraction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.phasico.traindeco.block.behaviour.TrainLineSlidingDoorMovementBehaviour;
import net.phasico.traindeco.block.door.TrainLineSlidingDoorBlock;
import net.phasico.traindeco.registry.TrainDecoSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class TrainLineDoorMovingInteraction extends SimpleBlockMovingInteraction {

    @Override
    protected BlockState handle(Player player, Contraption contraption, BlockPos pos, BlockState currentState) {
        if (!(currentState.getBlock() instanceof DoorBlock))
            return currentState;

        boolean trainDoor = currentState.getBlock() instanceof TrainLineSlidingDoorBlock;
        SoundEvent sound = currentState.getValue(DoorBlock.OPEN)  //This IRON_DOOR_CLOSE Will be played when the door is clicked, not when the door shut. So not good.
                ? null  //The soundeffect will be played in movement behaviour!
                : SoundEvents.IRON_DOOR_OPEN;
        /*SoundEvent alarm = currentState.getValue(DoorBlock.OPEN)
                ? TrainDecoSoundEvents.DOOR_CLOSING_ALARM.get()
                : null;*/

        BlockPos otherPos = currentState.getValue(DoorBlock.HALF) == DoubleBlockHalf.LOWER ? pos.above() : pos.below();
        StructureTemplate.StructureBlockInfo info = contraption.getBlocks()
                .get(otherPos);
        if (info.state().hasProperty(DoorBlock.OPEN)) {
            BlockState newState = info.state().cycle(DoorBlock.OPEN);
            setContraptionBlockData(contraption.entity, otherPos, new StructureTemplate.StructureBlockInfo(info.pos(), newState, info.nbt()));
        }

        currentState = currentState.cycle(DoorBlock.OPEN);

        if (player != null) {

            if (trainDoor) {
                DoorHingeSide hinge = currentState.getValue(TrainLineSlidingDoorBlock.HINGE);
                Direction facing = currentState.getValue(TrainLineSlidingDoorBlock.FACING);
                BlockPos doublePos =
                        pos.relative(hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise());
                StructureTemplate.StructureBlockInfo doubleInfo = contraption.getBlocks()
                        .get(doublePos);
                if (doubleInfo != null && TrainLineSlidingDoorBlock.isDoubleDoor(currentState, hinge, facing, doubleInfo.state()))
                    handlePlayerInteraction(null, InteractionHand.MAIN_HAND, doublePos, contraption.entity);
            }

            float pitch = player.level().random.nextFloat() * 0.1F + 0.9F;
            if (sound != null)
                playSound(player, sound, pitch);
        /*if (alarm != null) {
            playSound(player, alarm, 1);
        }*/

        }

        return currentState;
    }

    @Override
    protected boolean updateColliders() {
        return true;
    }

}