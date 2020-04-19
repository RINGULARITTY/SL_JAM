package fr.ringularity.infinitePower.InstancedObjects;

import fr.ringularity.infinitePower.References;
import fr.ringularity.infinitePower.objects.items.BasicItem;
import fr.ringularity.infinitePower.tools.JsonRegister.JsonRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;


public class ItemsInstance {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, References.MOD_ID);

    public static final ArrayList<RegistryObject<Item>> ITEMSREGISTRY = new ArrayList<RegistryObject<Item>>();

    public static void addBasicItem(String nameId, String name, ItemGroup itemGroup) {
        ITEMSREGISTRY.add(ITEMS.register(nameId, () -> new BasicItem(itemGroup)));
        JsonRegister.addItem(nameId, name);
    }

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
