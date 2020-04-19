package fr.ringularity.infinitePower.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BasicItem extends Item {
    public BasicItem(ItemGroup itemGroup) {
        super(new Item.Properties().group(itemGroup));
    }
}
