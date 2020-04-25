package fr.ringularity.infinitePower.objects.tilesEntities;

import fr.ringularity.infinitePower.References;
import fr.ringularity.infinitePower.registers.BlocksRegistry;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = References.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomTileEntityTypes {


    @ObjectHolder(References.MOD_ID + ":furnace_series")
    public static final TileEntityType<FurnaceSeriesTileEntity> FURNACE_SERIES = null;

    @SubscribeEvent
    public static final void onRegisterTileEntity(final RegistryEvent.Register<TileEntityType<?>> event) {
        event.getRegistry().register((TileEntityType.Builder.create(
                FurnaceSeriesTileEntity::new,
                BlocksRegistry.FURNACE_SERIES
        ).build(null).setRegistryName(new ResourceLocation(References.MOD_ID, "furnace_series"))));
    }
}
