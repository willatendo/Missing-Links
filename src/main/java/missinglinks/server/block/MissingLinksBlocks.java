package missinglinks.server.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MissingLinksBlocks {
	public static final BlockGroup CACLITE = BlockGroup.makeStairsSlabWall(Blocks.CALCITE);
	public static final BlockGroup TUFF = BlockGroup.makeStairsSlabWall(Blocks.TUFF);
	public static final BlockGroup DRIPSTONE_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.DRIPSTONE_BLOCK);
	public static final BlockGroup SMOOTH_BASALT = BlockGroup.makeStairsSlabWall(Blocks.SMOOTH_BASALT);
	public static final BlockGroup END_STONE = BlockGroup.makeStairsSlabWall(Blocks.END_STONE);
	public static final BlockGroup QUARTZ_BRICKS = BlockGroup.makeStairsSlabWall(Blocks.QUARTZ_BRICKS);
	public static final BlockGroup QUARTZ_BLOCK = new BlockGroup(Blocks.QUARTZ_BLOCK, new Block[] { new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)) }, new String[] { "wall" });
	public static final BlockGroup SMOOTH_QUARTZ = new BlockGroup(Blocks.SMOOTH_QUARTZ, new Block[] { new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)) }, new String[] { "wall" });
	public static final BlockGroup SMOOTH_RED_SANDSTONE = new BlockGroup(Blocks.SMOOTH_RED_SANDSTONE, new Block[] { new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)) }, new String[] { "wall" });
	public static final BlockGroup SMOOTH_SANDSTONE = new BlockGroup(Blocks.SMOOTH_SANDSTONE, new Block[] { new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)) }, new String[] { "wall" });
	public static final BlockGroup SMOOTH_STONE = new BlockGroup(Blocks.SMOOTH_STONE, new Block[] { new StairBlock(() -> Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)) }, new String[] { "stairs", "wall" });
	public static final BlockGroup RED_NETHER_BRICKS = BlockGroup.makeFencesFenceGates(Blocks.RED_NETHER_BRICKS);
	public static final BlockGroup NETHER_BRICKS = new BlockGroup(Blocks.NETHER_BRICKS, new Block[] { new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)) }, new String[] { "fence_gate" });

	public static void init() {
		CACLITE.init();
		TUFF.init();
		DRIPSTONE_BLOCK.init();
		SMOOTH_BASALT.init();
		END_STONE.init();
		QUARTZ_BRICKS.init();
		QUARTZ_BLOCK.init();
		SMOOTH_QUARTZ.init();
		SMOOTH_RED_SANDSTONE.init();
		SMOOTH_SANDSTONE.init();
		SMOOTH_STONE.init();
		RED_NETHER_BRICKS.init();
		NETHER_BRICKS.init();
	}
}
