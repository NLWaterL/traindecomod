package net.phasico.traindeco.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "traindeco", bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrainDecoItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "traindeco");

    public static final RegistryObject<Item> BRUSH = ITEMS.register("brush",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUTE = ITEMS.register("mute",
            () -> new Item(new Item.Properties()));

    /*
    We will need this very soon! For carriage number system
    public static final RegistryObject<Item> PLUS_ONE = ITEMS.register("plus_one",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUS_TEN = ITEMS.register("plus_ten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINUS_ONE = ITEMS.register("minus_one",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINUS_TEN = ITEMS.register("minus_ten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZERO = ITEMS.register("zero",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUSTOM_NUMBER = ITEMS.register("CUSTOM_NUMBER",
            () -> new Item(new Item.Properties()));
    */


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
