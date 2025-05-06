package net.phasico.traindeco.registry;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.phasico.traindeco.block.door.TrainLineSlidingDoorBlockEntity;
import net.phasico.traindeco.block.door.TrainLineSlidingDoorBlockRenderer;

import static net.phasico.traindeco.TrainDecoMod.REGISTRATE;

public class TrainDecoEntityTypes {

    public static final BlockEntityEntry<TrainLineSlidingDoorBlockEntity> SLIDING_DOOR =
            REGISTRATE.blockEntity("sliding_door", TrainLineSlidingDoorBlockEntity::new)
                    .renderer(() -> TrainLineSlidingDoorBlockRenderer::new)
                    .validBlocks(TrainDecoBlocks.RED_LINE_TRAIN_DOOR, TrainDecoBlocks.ORANGE_LINE_TRAIN_DOOR, TrainDecoBlocks.YELLOW_LINE_TRAIN_DOOR,
                            TrainDecoBlocks.GREEN_LINE_TRAIN_DOOR, TrainDecoBlocks.LIME_LINE_TRAIN_DOOR, TrainDecoBlocks.BLUE_LINE_TRAIN_DOOR,
                            TrainDecoBlocks.LIGHT_BLUE_LINE_TRAIN_DOOR, TrainDecoBlocks.CYAN_LINE_TRAIN_DOOR, TrainDecoBlocks.PURPLE_LINE_TRAIN_DOOR,
                            TrainDecoBlocks.MAGENTA_LINE_TRAIN_DOOR, TrainDecoBlocks.PINK_LINE_TRAIN_DOOR, TrainDecoBlocks.BLACK_LINE_TRAIN_DOOR,
                            TrainDecoBlocks.GRAY_LINE_TRAIN_DOOR, TrainDecoBlocks.LIGHT_GRAY_LINE_TRAIN_DOOR, TrainDecoBlocks.WHITE_LINE_TRAIN_DOOR,
                            TrainDecoBlocks.BROWN_LINE_TRAIN_DOOR)
                    .register();

    public static void register() {}
}

