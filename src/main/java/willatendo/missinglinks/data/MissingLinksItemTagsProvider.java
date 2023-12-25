package willatendo.missinglinks.data;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.level.block.Block;
import willatendo.simplelibrary.data.SimpleItemTagsProvider;
import willatendo.simplelibrary.data.util.ExistingFileHelper;

public class MissingLinksItemTagsProvider extends SimpleItemTagsProvider {
	public MissingLinksItemTagsProvider(FabricDataOutput fabricDataOutput, CompletableFuture<Provider> procider, CompletableFuture<TagLookup<Block>> blockTags, String modid, ExistingFileHelper existingFileHelper) {
		super(fabricDataOutput, procider, blockTags, modid, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
	}
}
