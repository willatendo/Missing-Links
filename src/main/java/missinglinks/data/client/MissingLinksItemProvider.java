package missinglinks.data.client;

import missinglinks.MissingLinksMod;
import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MissingLinksItemProvider extends ItemModelProvider {
	public MissingLinksItemProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
		super(gen, MissingLinksMod.ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		MissingLinksBlocks.POLISHED_CALCITE.makeBlockStairsSlabWallItemModels(this);
		MissingLinksBlocks.POLISHED_CALCITE_BRICKS.makeBlockStairsSlabWallItemModels(this);
		MissingLinksBlocks.POLISHED_TUFF.makeBlockStairsSlabWallItemModels(this);
		MissingLinksBlocks.POLISHED_TUFF_BRICKS.makeBlockStairsSlabWallItemModels(this);
		MissingLinksBlocks.CALCITE.makeStairsSlabWallItemModels(this);
		MissingLinksBlocks.TUFF.makeStairsSlabWallItemModels(this);
		MissingLinksBlocks.DRIPSTONE_BLOCK.makeStairsSlabWallItemModels(this);
		MissingLinksBlocks.SMOOTH_BASALT.makeStairsSlabWallItemModels(this);
		MissingLinksBlocks.END_STONE.makeStairsSlabWallItemModels(this);
		MissingLinksBlocks.QUARTZ_BRICKS.makeStairsSlabWallItemModels(this);
		this.wallInventory("quartz_wall", this.mcLoc("block/quartz_block_side"));
		this.wallInventory("smooth_quartz_wall", this.mcLoc("block/quartz_block_bottom"));
		this.wallInventory("smooth_red_sandstone_wall", this.mcLoc("block/red_sandstone_top"));
		this.wallInventory("smooth_sandstone_wall", this.mcLoc("block/sandstone_top"));
		this.withExistingParent("smooth_stone_stairs", this.modLoc("block/smooth_stone_stairs"));
		this.wallInventory("smooth_stone_wall", this.mcLoc("block/smooth_stone"));
		MissingLinksBlocks.RED_NETHER_BRICKS.makeFencesFenceGatesItemModels(this);
		this.withExistingParent("nether_brick_fence_gate", this.modLoc("block/nether_brick_fence_gate"));
	}
}
