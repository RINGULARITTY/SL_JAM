package fr.ringularity.infinitePower.registers;


import fr.ringularity.infinitePower.objects.blocks.FurnaceSeriesBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static fr.ringularity.infinitePower.References.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public final class BlocksRegistry {

    @ObjectHolder(MOD_ID + ":furnace_series")
    public static final Block FURNACE_SERIES = null;

    @SubscribeEvent
    public static final void register(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new FurnaceSeriesBlock(Material.ANVIL).setRegistryName(new ResourceLocation(MOD_ID, "furnace_series")));
    }

    @SubscribeEvent
    public static final void registerItemFromBlock(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(FURNACE_SERIES, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(FURNACE_SERIES.getRegistryName()));
    }

}
