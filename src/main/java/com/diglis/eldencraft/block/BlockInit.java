package com.diglis.eldencraft.block;

import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.item.ItemInit;
import com.diglis.eldencraft.item.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EldenCraft.MOD_ID);

    public static final RegistryObject<Block> CARBON_BLOCK = registerBlock("carbon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(0.2f)),
            ModCreativeModeTab.ELDEN_CRAFT_BLOCKS);

    public static final RegistryObject<Block> STEEL_DEPOSIT = registerBlock("steel_deposit",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f)), ModCreativeModeTab.ELDEN_CRAFT_BLOCKS);

    public static final RegistryObject<Block> CARBON_RUNOFF = registerBlock("carbon_runoff",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.5f)), ModCreativeModeTab.ELDEN_CRAFT_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ItemInit.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
