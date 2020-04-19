package fr.ringularity.infinitePower.InstancedObjects;

import fr.ringularity.infinitePower.References;
import fr.ringularity.infinitePower.objects.blocks.BasicBlock;
import fr.ringularity.infinitePower.tools.JsonRegister.JsonRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

public class BlocksInstance {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, References.MOD_ID);

    public static final ArrayList<RegistryObject<Block>> BLOCKSREGISTRY = new ArrayList<RegistryObject<Block>>();

    public static void addBasicBlock(String nameId, String name, Material material, ItemGroup itemGroup) {
        BLOCKSREGISTRY.add(BLOCKS.register(nameId, () -> new BasicBlock(material)));
        ItemsInstance.ITEMSREGISTRY.add(ItemsInstance.ITEMS.register(nameId, () -> new BlockItem(BLOCKSREGISTRY.get(BLOCKSREGISTRY.size() - 1).get(), new Item.Properties().group(itemGroup))));
        JsonRegister.addBlock(nameId, name);
    }

    public static void addCompressedSerie(String nameId, String name, Material material, ItemGroup itemGroup) {
        BLOCKSREGISTRY.add(BLOCKS.register(nameId, () -> new BasicBlock(material)));
        ItemsInstance.ITEMSREGISTRY.add(ItemsInstance.ITEMS.register(nameId, () -> new BlockItem(BLOCKSREGISTRY.get(BLOCKSREGISTRY.size() - 1).get(), new Item.Properties().group(itemGroup))));
        JsonRegister.addBlock(nameId, name);
    }

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
