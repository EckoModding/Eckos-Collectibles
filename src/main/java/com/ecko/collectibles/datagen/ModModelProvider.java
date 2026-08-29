package com.ecko.collectibles.datagen;

import com.ecko.collectibles.EckosCollectibles;
import com.ecko.collectibles.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, EckosCollectibles.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        super.registerModels(blockModels, itemModels);
        itemModels.generateFlatItem(ModItems.PUMPKIN_SKULL.get(), ModelTemplates.FLAT_ITEM);




    }
}
