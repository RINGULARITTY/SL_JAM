package fr.ringularity.infinitePower.registers;

import fr.ringularity.infinitePower.InstancedObjects.ItemsInstance;
import net.minecraft.item.ItemGroup;

public class ItemsRegistry {
    public static void init() {
        ItemsInstance.addBasicItem("test", "Test", ItemGroup.FOOD);
    }
}
