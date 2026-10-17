package com.example.semp;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SempMod.MOD_ID);

    public static final DeferredBlock<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.STONE)
            .strength(50.0F, 1200.0F)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
        )
    );
}
