package missinglinks.server.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import tyrannotitanlib.tyranniregister.TyrannoRegister;

public class StairsSlabsWalls {
	public static void register(Block base) {
		var stairs = TyrannoRegister.registerBlock(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_stairs", new StairBlock(() -> base.defaultBlockState(), BlockBehaviour.Properties.copy(base)));
		TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_stairs", new BlockItem(stairs, new Properties().tab(base.asItem().getItemCategory())));
		var slab = TyrannoRegister.registerBlock(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_slab", new SlabBlock(BlockBehaviour.Properties.copy(base)));
		TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_slab", new BlockItem(slab, new Properties().tab(base.asItem().getItemCategory())));
		var wall = TyrannoRegister.registerBlock(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_wall", new WallBlock(BlockBehaviour.Properties.copy(base)));
		TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_wall", new BlockItem(wall, new Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	}

	public static void fill(Block base, boolean makeStairs, boolean makeSlabs, boolean makeWalls) {
		if (makeStairs) {
			var stairs = TyrannoRegister.registerBlock(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_stairs", new StairBlock(() -> base.defaultBlockState(), BlockBehaviour.Properties.copy(base)));
			TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_stairs", new BlockItem(stairs, new Properties().tab(base.asItem().getItemCategory())));
		}
		if (makeSlabs) {
			var slab = TyrannoRegister.registerBlock(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_slab", new SlabBlock(BlockBehaviour.Properties.copy(base)));
			TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_slab", new BlockItem(slab, new Properties().tab(base.asItem().getItemCategory())));
		}
		if (makeWalls) {
			var wall = TyrannoRegister.registerBlock(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_wall", new WallBlock(BlockBehaviour.Properties.copy(base)));
			TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_wall", new BlockItem(wall, new Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
		}
	}
}
