package fr.ringularity.infinitePower.registers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static fr.ringularity.infinitePower.References.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public final class ItemsRegistry {

    @ObjectHolder(MOD_ID + ":issou")
    public static final Item ISSOU = null;

    @SubscribeEvent
    public static final void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(MOD_ID, "issou")));
    }

}
