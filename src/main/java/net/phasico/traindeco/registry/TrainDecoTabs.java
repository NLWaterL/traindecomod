package net.phasico.traindeco.registry;

import net.phasico.traindeco.TrainDecoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("unused")
public class TrainDecoTabs {
    private static final DeferredRegister<CreativeModeTab> REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrainDecoMod.ID);

    public static final RegistryObject<CreativeModeTab> TRAIN_DECO = REGISTER.register("train_deco",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.traindeco.train_deco"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(TrainDecoBlocks.CYAN_LINE_TRAIN_DOOR::asStack)
                    .displayItems(new ItemsGenerator())
                    .build());

    public static class ItemsGenerator implements CreativeModeTab.DisplayItemsGenerator {
        @Override
        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters p, CreativeModeTab.Output o) {
            //TODO Draw the texture for the quartz version train wall!
            //QUARTZ station wall is just an experimental block. Will be removed and replaced with the quartz version of train wall.

            o.accept(TrainDecoBlocks.RED_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.RED_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.RED_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_RED_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.ORANGE_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.ORANGE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.ORANGE_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_ORANGE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.YELLOW_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.YELLOW_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.YELLOW_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_YELLOW_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.GREEN_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.GREEN_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.GREEN_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_GREEN_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.LIME_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.LIME_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.LIME_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_LIME_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.BLUE_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.BLUE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.BLUE_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_BLUE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.LIGHT_BLUE_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.LIGHT_BLUE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.LIGHT_BLUE_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_LIGHT_BLUE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.CYAN_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.CYAN_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.CYAN_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_CYAN_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.PURPLE_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.PURPLE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.PURPLE_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_PURPLE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.MAGENTA_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.MAGENTA_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.MAGENTA_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_MAGENTA_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.PINK_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.PINK_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.PINK_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_PINK_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.BLACK_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.BLACK_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.BLACK_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_BLACK_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.GRAY_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.GRAY_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.GRAY_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_GRAY_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.LIGHT_GRAY_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.LIGHT_GRAY_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.LIGHT_GRAY_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_LIGHT_GRAY_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.WHITE_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.WHITE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.WHITE_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_WHITE_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.BROWN_LINE_TRAIN_DOOR);
            o.accept(TrainDecoBlocks.BROWN_LINE_TRAIN_WALL);
            o.accept(TrainDecoBlocks.BROWN_LINE_STATION_WALL);
            o.accept(TrainDecoBlocks.QUARTZ_BROWN_LINE_TRAIN_WALL);
            }
    }

    public static void register(IEventBus bus) {
        REGISTER.register(bus);
    }
}


