package net.phasico.traindeco.registry;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.phasico.traindeco.TrainDecoMod;
import net.phasico.traindeco.block.door.TrainLineSlidingDoorBlock;
import net.phasico.traindeco.registry.TrainDecoBuilderTransformer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.material.MapColor;


@SuppressWarnings({"unused"})
public class TrainDecoBlocks {
    private static final CreateRegistrate REGISTRATE = TrainDecoMod.REGISTRATE.setCreativeTab(AllCreativeModeTabs.PALETTES_CREATIVE_TAB);

    public static final BlockEntry<CarvedPumpkinBlock>   //The easiest way to make the block directional…
            RED_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("red_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            ORANGE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("orange_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            YELLOW_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("yellow_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            GREEN_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("green_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            LIME_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("lime_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            BLUE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("blue_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            LIGHT_BLUE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("light_blue_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            CYAN_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("cyan_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            PURPLE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("purple_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            MAGENTA_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("magenta_line_station_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            PINK_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("pink_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            BLACK_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("black_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            GRAY_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("gray_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            LIGHT_GRAY_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("light_gray_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            WHITE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("white_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            BROWN_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("brown_line_train_wall");

    public static final BlockEntry<Block>
            RED_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("red_line_station_wall");
    public static final BlockEntry<Block>
            ORANGE_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("orange_line_station_wall");
    public static final BlockEntry<Block>
            YELLOW_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("yellow_line_station_wall");
    public static final BlockEntry<Block>
            GREEN_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("green_line_station_wall");
    public static final BlockEntry<Block>
            LIME_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("lime_line_station_wall");
    public static final BlockEntry<Block>
            BLUE_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("blue_line_station_wall");
    public static final BlockEntry<Block>
            LIGHT_BLUE_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("light_blue_line_station_wall");
    public static final BlockEntry<Block>
            CYAN_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("cyan_line_station_wall");
    public static final BlockEntry<Block>
            PURPLE_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("purple_line_station_wall");
    public static final BlockEntry<Block>
            MAGENTA_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("magenta_line_station_wall");
    public static final BlockEntry<Block>
            PINK_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("pink_line_station_wall");
    public static final BlockEntry<Block>
            BLACK_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("black_line_station_wall");
    public static final BlockEntry<Block>
            GRAY_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("gray_line_station_wall");
    public static final BlockEntry<Block>
            LIGHT_GRAY_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("light_gray_line_station_wall");
    public static final BlockEntry<Block>
            WHITE_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("white_line_station_wall");
    public static final BlockEntry<Block>
            BROWN_LINE_STATION_WALL = TrainDecoBuilderTransformer.linedStationWall("brown_line_station_wall");

    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_RED_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_red_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_ORANGE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_orange_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_YELLOW_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_yellow_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_GREEN_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_green_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_LIME_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_lime_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_BLUE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_blue_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_LIGHT_BLUE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_light_blue_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_CYAN_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_cyan_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_PURPLE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_purple_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_MAGENTA_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_magenta_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_PINK_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_pink_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_BLACK_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_black_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_GRAY_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_gray_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_LIGHT_GRAY_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_light_gray_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_WHITE_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_white_line_train_wall");
    public static final BlockEntry<CarvedPumpkinBlock>
            QUARTZ_BROWN_LINE_TRAIN_WALL = TrainDecoBuilderTransformer.linedTrainWall("quartz_brown_line_train_wall");

    public BlockEntry<TrainLineSlidingDoorBlock> train_door;


    public static final BlockEntry<TrainLineSlidingDoorBlock> RED_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("red_line_train", MapColor.TERRACOTTA_RED);
    public static final BlockEntry<TrainLineSlidingDoorBlock> ORANGE_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("orange_line_train", MapColor.TERRACOTTA_ORANGE);
    public static final BlockEntry<TrainLineSlidingDoorBlock> YELLOW_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("yellow_line_train", MapColor.TERRACOTTA_YELLOW);
    public static final BlockEntry<TrainLineSlidingDoorBlock> GREEN_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("green_line_train", MapColor.TERRACOTTA_GREEN);
    public static final BlockEntry<TrainLineSlidingDoorBlock> LIME_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("lime_line_train", MapColor.TERRACOTTA_LIGHT_GREEN);
    public static final BlockEntry<TrainLineSlidingDoorBlock> BLUE_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("blue_line_train", MapColor.TERRACOTTA_BLUE);
    public static final BlockEntry<TrainLineSlidingDoorBlock> LIGHT_BLUE_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("light_blue_line_train", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final BlockEntry<TrainLineSlidingDoorBlock> CYAN_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("cyan_line_train", MapColor.TERRACOTTA_CYAN);
    public static final BlockEntry<TrainLineSlidingDoorBlock> PURPLE_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("purple_line_train", MapColor.TERRACOTTA_PURPLE);
    public static final BlockEntry<TrainLineSlidingDoorBlock> MAGENTA_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("magenta_line_train", MapColor.TERRACOTTA_MAGENTA);
    public static final BlockEntry<TrainLineSlidingDoorBlock> PINK_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("pink_line_train", MapColor.TERRACOTTA_PINK);
    public static final BlockEntry<TrainLineSlidingDoorBlock> BLACK_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("black_line_train", MapColor.TERRACOTTA_BLACK);
    public static final BlockEntry<TrainLineSlidingDoorBlock> GRAY_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("gray_line_train", MapColor.TERRACOTTA_GRAY);
    public static final BlockEntry<TrainLineSlidingDoorBlock> LIGHT_GRAY_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("light_gray_line_train", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final BlockEntry<TrainLineSlidingDoorBlock> WHITE_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("white_line_train", MapColor.TERRACOTTA_WHITE);
    public static final BlockEntry<TrainLineSlidingDoorBlock> BROWN_LINE_TRAIN_DOOR =
            TrainDecoBuilderTransformer.trainLineSlidingDoor("brown_line_train", MapColor.TERRACOTTA_BROWN);


    public static void register() {}

}

