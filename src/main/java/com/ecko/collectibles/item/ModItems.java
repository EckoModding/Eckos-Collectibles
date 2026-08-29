package com.ecko.collectibles.item;

import com.ecko.collectibles.EckosCollectibles;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EckosCollectibles.MOD_ID);

    public static final DeferredItem<Item> PUMPKIN_SKULL = ITEMS.registerSimpleItem("pumpkin_skull");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}



