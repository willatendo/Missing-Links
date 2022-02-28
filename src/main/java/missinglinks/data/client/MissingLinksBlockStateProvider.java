package missinglinks.data.client;

import missinglinks.MissingLinksMod;
import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksBlockStateProvider extends BlockStateProvider {
	public MissingLinksBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, MissingLinksMod.ID, exFileHelper);
	}

	public ResourceLocation mcTexture(String path) {
		return mcLoc(ModelProvider.BLOCK_FOLDER + "/" + path);
	}

	@Override
	protected void registerStatesAndModels() {
		this.stairsBlock(MissingLinksBlocks.CACLITE.blocks()[0], "calcite");
		this.slabBlock(MissingLinksBlocks.CACLITE.blocks()[1], "calcite");
		this.wallBlock(MissingLinksBlocks.CACLITE.blocks()[2], "calcite");
		this.stairsBlock(MissingLinksBlocks.TUFF.blocks()[0], "tuff");
		this.slabBlock(MissingLinksBlocks.TUFF.blocks()[1], "tuff");
		this.wallBlock(MissingLinksBlocks.TUFF.blocks()[2], "tuff");
		this.stairsBlock(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[0], "dripstone_block");
		this.slabBlock(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[1], "dripstone_block");
		this.wallBlock(MissingLinksBlocks.DRIPSTONE_BLOCK.blocks()[2], "dripstone_block");
		this.stairsBlock(MissingLinksBlocks.SMOOTH_BASALT.blocks()[0], "smooth_basalt");
		this.slabBlock(MissingLinksBlocks.SMOOTH_BASALT.blocks()[1], "smooth_basalt");
		this.wallBlock(MissingLinksBlocks.SMOOTH_BASALT.blocks()[2], "smooth_basalt");
		this.stairsBlock(MissingLinksBlocks.END_STONE.blocks()[0], "end_stone");
		this.slabBlock(MissingLinksBlocks.END_STONE.blocks()[1], "end_stone");
		this.wallBlock(MissingLinksBlocks.END_STONE.blocks()[2], "end_stone");
		this.stairsBlock(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[0], "quartz_bricks");
		this.slabBlock(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[1], "quartz_bricks");
		this.wallBlock(MissingLinksBlocks.QUARTZ_BRICKS.blocks()[2], "quartz_bricks");
		this.wallBlock(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0], "quartz_block_side");
		this.wallBlock(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0], "quartz_block_bottom");
		this.wallBlock(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0], "red_sandstone_top");
		this.wallBlock(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0], "sandstone_top");
		this.stairsBlock(MissingLinksBlocks.SMOOTH_STONE.blocks()[0], "smooth_stone");
		this.wallBlock(MissingLinksBlocks.SMOOTH_STONE.blocks()[1], "smooth_stone");
		this.fenceBlock(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[0], "red_nether_bricks");
		this.fenceGateBlock(MissingLinksBlocks.RED_NETHER_BRICKS.blocks()[1], "red_nether_bricks");
		this.fenceGateBlock(MissingLinksBlocks.NETHER_BRICKS.blocks()[0], "nether_bricks");
	}

	public void stairsBlock(Block block, String texture) {
		this.stairsBlock((StairBlock) block, mcTexture(texture));
	}

	public void slabBlock(Block block, String texture) {
		this.slabBlock((SlabBlock) block, mcTexture(texture), mcTexture(texture));
	}

	public void wallBlock(Block block, String texture) {
		this.wallBlock((WallBlock) block, mcTexture(texture));
	}

	public void fenceBlock(Block block, String texture) {
		this.fenceBlock((FenceBlock) block, mcTexture(texture));
	}

	public void fenceGateBlock(Block block, String texture) {
		this.fenceGateBlock((FenceGateBlock) block, mcTexture(texture));
	}
}
