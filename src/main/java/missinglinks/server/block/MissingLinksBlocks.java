package missinglinks.server.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import tyrannotitanlib.tyranniregister.TyrannoRegister;

public class MissingLinksBlocks {
	public static void init() {
		StairsSlabsWalls.register(Blocks.CALCITE);
		StairsSlabsWalls.register(Blocks.TUFF);
		StairsSlabsWalls.register(Blocks.DRIPSTONE_BLOCK);
		StairsSlabsWalls.register(Blocks.SMOOTH_BASALT);
		StairsSlabsWalls.register(Blocks.END_STONE);
		StairsSlabsWalls.register(Blocks.QUARTZ_BRICKS);
		StairsSlabsWalls.fill(Blocks.QUARTZ_BLOCK, false, false, true);
		StairsSlabsWalls.fill(Blocks.SMOOTH_QUARTZ, false, false, true);
		StairsSlabsWalls.fill(Blocks.SMOOTH_RED_SANDSTONE, false, false, true);
		StairsSlabsWalls.fill(Blocks.SMOOTH_SANDSTONE, false, false, true);
		StairsSlabsWalls.fill(Blocks.SMOOTH_STONE, true, false, true);
		var rnbFence = TyrannoRegister.registerBlock("red_nether_brick_fence", new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)));
		TyrannoRegister.registerItem("red_nether_brick_fence", new BlockItem(rnbFence, new Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	}
}
