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
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(MissingLinksBlocks.POLISHED_CALCITE.blocks()[0].get()).add(MissingLinksBlocks.POLISHED_CALCITE.blocks()[1].get()).add(MissingLinksBlocks.POLISHED_CALCITE.blocks()[2].get()).add(MissingLinksBlocks.POLISHED_CALCITE.blocks()[3].get()).add(MissingLinksBlocks.POLISHED_TUFF.blocks()[0].get()).add(MissingLinksBlocks.POLISHED_TUFF.blocks()[1].get()).add(MissingLinksBlocks.POLISHED_TUFF.blocks()[2].get()).add(MissingLinksBlocks.POLISHED_TUFF.blocks()[3].get()).add(MissingLinksBlocks.CALCITE.blocks()[0].get()).add(MissingLinksBlocks.CALCITE.blocks()[1].get()).add(MissingLinksBlocks.CALCITE.blocks()[2].get()).add(MissingLinksBlocks.TUFF.blocks()[0].get()).add(MissingLinksBlocks.TUFF.blocks()[1].get()).add(MissingLinksBlocks.TUFF.blocks()[2].get()).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[0].get()).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[1].get()).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2].get()).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[1].get()).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2].get()).add(MissingLinksBlocks.END_STONE.blocks()[0].get()).add(MissingLinksBlocks.END_STONE.blocks()[1].get()).add(MissingLinksBlocks.END_STONE.blocks()[2].get()).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0].get()).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[1].get()).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2].get()).add(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_STONE.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_STONE.blocks()[1].get()).add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0].get()).add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[1].get()).add(MissingLinksBlocks.NETHER_BRICKS.blocks()[0].get());
		this.tag(BlockTags.FENCES).add(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0].get());
		this.tag(BlockTags.WALLS).add(MissingLinksBlocks.POLISHED_CALCITE.blocks()[3].get()).add(MissingLinksBlocks.POLISHED_TUFF.blocks()[3].get()).add(MissingLinksBlocks.CALCITE.blocks()[2].get()).add(MissingLinksBlocks.TUFF.blocks()[2].get()).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2].get()).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2].get()).add(MissingLinksBlocks.END_STONE.blocks()[2].get()).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2].get()).add(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_STONE.blocks()[1].get());
		this.tag(BlockTags.STAIRS).add(MissingLinksBlocks.POLISHED_CALCITE.blocks()[1].get()).add(MissingLinksBlocks.POLISHED_TUFF.blocks()[1].get()).add(MissingLinksBlocks.CALCITE.blocks()[0].get()).add(MissingLinksBlocks.TUFF.blocks()[0].get()).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[0].get()).add(MissingLinksBlocks.END_STONE.blocks()[0].get()).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0].get()).add(MissingLinksBlocks.SMOOTH_STONE.blocks()[0].get());
		this.tag(BlockTags.SLABS).add(MissingLinksBlocks.POLISHED_CALCITE.blocks()[2].get()).add(MissingLinksBlocks.POLISHED_TUFF.blocks()[1].get()).add(MissingLinksBlocks.CALCITE.blocks()[1].get()).add(MissingLinksBlocks.TUFF.blocks()[1].get()).add(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[1].get()).add(MissingLinksBlocks.SMOOTH_BASALT.blocks()[1].get()).add(MissingLinksBlocks.END_STONE.blocks()[1].get()).add(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0].get());
	}
}
