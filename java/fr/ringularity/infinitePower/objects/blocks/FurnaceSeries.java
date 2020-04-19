package fr.ringularity.infinitePower.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ContainerBlock;
import net.minecraft.block.material.Material;

public class FurnaceSeries extends ContainerBlock {

    private int level = 0;
    private int activityLevel = 0;

    protected FurnaceSeries(Material material, int level) {
        super(Block.Properties.create(material));
    }


}
