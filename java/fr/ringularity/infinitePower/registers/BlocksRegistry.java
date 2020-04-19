package fr.ringularity.infinitePower.registers;

import fr.ringularity.infinitePower.InstancedObjects.BlocksInstance;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;

public class BlocksRegistry {
    public static void init() {
        BlocksInstance.addBasicBlock("issou", "Issou", Material.ANVIL, ItemGroup.MATERIALS);
    }
}
