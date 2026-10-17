package com.example.semp;

import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SempMod.MOD_ID);

    public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
        () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe",
        () -> new PickaxeItem(ModTiers.TUNGSTEN, new Item.Properties().fireResistant())
    );
}
