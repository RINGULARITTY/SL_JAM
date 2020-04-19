package fr.ringularity.infinitePower;

import fr.ringularity.infinitePower.InstancedObjects.BlocksInstance;
import fr.ringularity.infinitePower.InstancedObjects.ItemsInstance;
import fr.ringularity.infinitePower.registers.BlocksRegistry;
import fr.ringularity.infinitePower.registers.ItemsRegistry;
import fr.ringularity.infinitePower.tools.JsonRegister.JsonRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("electricallife")
public class ElectricalLife {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "electricallife";


    public ElectricalLife() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ItemsRegistry.init(); ItemsInstance.init();
        BlocksRegistry.init(); BlocksInstance.init();
        JsonRegister.createJsonFiles();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
}
