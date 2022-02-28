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
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.CALCITE.blocks()).add(MissingLinksBlocks.TUFF.blocks()).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()).add(MissingLinksBlocks.END_STONE.blocks()).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()).add(MissingLinksBlocks.QUARTZ_BLOCK.blocks()).add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()).add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()).add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()).add(MissingLinksBlocks.SMOOTH_STONE.blocks()).add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks());
		this.tag(BlockTags.FENCES).add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0]);
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.CALCITE.blocks()[2]).add(MissingLinksBlocks.TUFF.blocks()[2]).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2]).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2]).add(MissingLinksBlocks.END_STONE.blocks()[2]).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2]).add(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0]).add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0]).add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0]).add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0]).add(MissingLinksBlocks.SMOOTH_STONE.blocks()[1]);
		this.tag(BlockTags.STAIRS).add(MissingLinksBlocks.CALCITE.blocks()[0]).add(MissingLinksBlocks.TUFF.blocks()[0]).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[0]).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[0]).add(MissingLinksBlocks.END_STONE.blocks()[0]).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0]).add(MissingLinksBlocks.SMOOTH_STONE.blocks()[0]);
		this.tag(BlockTags.SLABS).add(MissingLinksBlocks.CALCITE.blocks()[1]).add(MissingLinksBlocks.TUFF.blocks()[1]).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[1]).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[1]).add(MissingLinksBlocks.END_STONE.blocks()[1]).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0]);
	}
}
