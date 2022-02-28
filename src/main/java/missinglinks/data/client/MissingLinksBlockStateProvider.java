package missinglinks.data.client;

import missinglinks.MissingLinksMod;
import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksBlockStateProvider extends BlockStateProvider {
	public MissingLinksBlockStateProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
		super(gen, MissingLinksMod.ID, existingFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		MissingLinksBlocks.CALCITE.makeStairsSlabWallBlockStatesAndModels(this);
		MissingLinksBlocks.TUFF.makeStairsSlabWallBlockStatesAndModels(this);
		MissingLinksBlocks.DRIPSTONE_BLOCK.makeStairsSlabWallBlockStatesAndModels(this);
		MissingLinksBlocks.SMOOTH_BASALT.makeStairsSlabWallBlockStatesAndModels(this);
		MissingLinksBlocks.END_STONE.makeStairsSlabWallBlockStatesAndModels(this);
		MissingLinksBlocks.QUARTZ_BRICKS.makeStairsSlabWallBlockStatesAndModels(this);
		this.wallBlock((WallBlock) MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0], this.mcLoc("block/quartz_block_side"));
		this.wallBlock((WallBlock) MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0], this.mcLoc("block/quartz_block_bottom"));
		this.wallBlock((WallBlock) MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0], this.mcLoc("block/red_sandstone_top"));
		this.wallBlock((WallBlock) MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0], this.mcLoc("block/sandstone_top"));
		this.wallBlock((WallBlock) MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0], this.mcLoc("block/sandstone_top"));
		this.stairsBlock((StairBlock) MissingLinksBlocks.SMOOTH_STONE.blocks()[0], this.mcLoc("block/smooth_stone"));
		this.wallBlock((WallBlock) MissingLinksBlocks.SMOOTH_STONE.blocks()[1], this.mcLoc("block/smooth_stone"));
		MissingLinksBlocks.RED_NETHER_BRICKS.makeFencesFenceGatesBlockStatesAndModels(this);
		this.fenceGateBlock((FenceGateBlock) MissingLinksBlocks.NETHER_BRICKS.blocks()[0], this.mcLoc("block/nether_bricks"));
	}
}
