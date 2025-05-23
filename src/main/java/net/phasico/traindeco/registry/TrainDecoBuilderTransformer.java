package net.phasico.traindeco.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.phasico.traindeco.TrainDecoMod;
import net.phasico.traindeco.block.behaviour.TrainLineDoorMovingInteraction;
import net.phasico.traindeco.block.behaviour.TrainLineSlidingDoorMovementBehaviour;
import net.phasico.traindeco.block.door.TrainLineSlidingDoorBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;


import static com.simibubi.create.api.behaviour.interaction.MovingInteractionBehaviour.interactionBehaviour;
import static com.simibubi.create.api.behaviour.movement.MovementBehaviour.movementBehaviour;

@SuppressWarnings({"unused","removal"})
public class TrainDecoBuilderTransformer {
    private static final CreateRegistrate REGISTRATE = TrainDecoMod.REGISTRATE.setCreativeTab(TrainDecoTabs.TRAIN_DECO);
    
    //The easiest way to make the block directional…… PUMPKINS!
    public static BlockEntry<CarvedPumpkinBlock> linedTrainWall(String name) {
        return REGISTRATE.block(name, CarvedPumpkinBlock::new)
                .addLayer(() -> RenderType::solid)
                .item()
                .build()
                .register();
    }

    public static BlockEntry<Block> linedStationWall(String name){
        return REGISTRATE.block(name, Block::new)
                .addLayer(() -> RenderType::solid)
                .item()
                .build()
                .register();
    }

    public static <B extends TrainLineSlidingDoorBlock, P> NonNullUnaryOperator<BlockBuilder<B, P>> slidingDoor(String type) {
        return b -> b.properties(p -> p.strength(3.0F, 6.0F))
                .addLayer(() -> RenderType::cutout)
                .onRegister(interactionBehaviour(new TrainLineDoorMovingInteraction()))
                .onRegister(movementBehaviour(new TrainLineSlidingDoorMovementBehaviour()))
                .item()
                .build();
    }

    public static BlockEntry<TrainLineSlidingDoorBlock> trainLineSlidingDoor(String type, MapColor colour) {
        return REGISTRATE.block(type + "_door", TrainLineSlidingDoorBlock::new)
                .properties(p -> p.sound(SoundType.GLASS).mapColor(colour).noOcclusion())
                .transform(TrainDecoBuilderTransformer.slidingDoor(type))
                .register();
    }

}
