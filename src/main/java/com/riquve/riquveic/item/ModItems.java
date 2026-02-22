package com.riquve.riquveic.item;

import com.riquve.riquveic.RiquveIC;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RiquveIC.MODID);

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RIQUVE_GEAR = ITEMS.register("riquve_gear",
            () -> new Item(new Item.Properties()));

    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
