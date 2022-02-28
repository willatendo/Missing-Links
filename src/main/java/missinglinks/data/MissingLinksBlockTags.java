package missinglinks.data;

import missinglinks.MissingLinksMod;
import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksBlockTags extends BlockTagsProvider {
	public MissingLinksBlockTags(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, MissingLinksMod.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.CACLITE.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.TUFF.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.SMOOTH_BASALT.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.END_STONE.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.QUARTZ_BLOCK.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.SMOOTH_STONE.blocks());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks());
		this.tag(BlockTags.FENCES).add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.CACLITE.blocks()[2]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.TUFF.blocks()[2]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.END_STONE.blocks()[2]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.SMOOTH_STONE.blocks()[1]);
	}
}
