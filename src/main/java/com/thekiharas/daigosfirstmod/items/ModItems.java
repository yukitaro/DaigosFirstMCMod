package com.thekiharas.daigosfirstmod.items;

import com.thekiharas.daigosfirstmod.DaigosFirstMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DaigosFirstMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DOUGHNUT = ITEMS.register("doughnut", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHOCO_DOUGHNUT = ITEMS.register("choco_doughnut", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
