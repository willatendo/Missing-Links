package missinglinks.data;

import missinglinks.MissingLinksMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksItemTags extends ItemTagsProvider {
	public MissingLinksItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
		super(generator, blockTags, MissingLinksMod.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {
	}
}
