package missinglinks.data;

import missinglinks.MissingLinksMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksItemTags extends ItemTagsProvider {
	public MissingLinksItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
		super(generator, blockTags, MissingLinksMod.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {
		this.copy(BlockTags.FENCES, ItemTags.FENCES);
		this.copy(BlockTags.WALLS, ItemTags.WALLS);
		this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
		this.copy(BlockTags.SLABS, ItemTags.SLABS);
	}
}
