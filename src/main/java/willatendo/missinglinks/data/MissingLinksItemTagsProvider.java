package willatendo.missinglinks.data;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksItemTagsProvider extends ItemTagsProvider {
	public MissingLinksItemTagsProvider(PackOutput packOutput, CompletableFuture<Provider> procider, CompletableFuture<TagLookup<Block>> blockTags, String modid, ExistingFileHelper existingFileHelper) {
		super(packOutput, procider, blockTags, modid, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
	}
}
