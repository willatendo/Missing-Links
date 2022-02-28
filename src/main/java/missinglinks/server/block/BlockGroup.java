package missinglinks.server.block;

import java.util.function.Consumer;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import tyrannotitanlib.tyranniregister.TyrannoRegister;

public record BlockGroup(Block base, Block[] blocks, String[] blockType) {

	public static BlockGroup makeStairsSlabWall(Block base) {
		return new BlockGroup(base, new Block[] { new StairBlock(() -> base.defaultBlockState(), BlockBehaviour.Properties.copy(base)), new SlabBlock(BlockBehaviour.Properties.copy(base)), new WallBlock(BlockBehaviour.Properties.copy(base)) }, new String[] { "stairs", "slab", "wall" });
	}

	public void makeStairsSlabWallRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0], 4).pattern("#  ").pattern("## ").pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1], 6).pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[2], 6).pattern("###").pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
	}

	public static BlockGroup makeFencesFenceGates(Block base) {
		return new BlockGroup(base, new Block[] { new FenceBlock(BlockBehaviour.Properties.copy(base)), new FenceGateBlock(BlockBehaviour.Properties.copy(base)) }, new String[] { "fence", "fence_gate" });
	}

	public void makeFencesFenceGatesRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0], 6).pattern("#@#").pattern("#@#").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1], 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
	}

	public BlockGroup init() {
		for (int i = 0; i < blocks.length; i++) {
			TyrannoRegister.registerBlock(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_" + blockType[i], blocks[i]);
			if (blocks[i] instanceof WallBlock || blocks[i] instanceof FenceBlock) {
				TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_" + blockType[i], new BlockItem(blocks[i], new Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
			} else if (blocks[i] instanceof FenceGateBlock) {
				TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_" + blockType[i], new BlockItem(blocks[i], new Properties().tab(CreativeModeTab.TAB_REDSTONE)));
			} else {
				TyrannoRegister.registerItem(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_" + blockType[i], new BlockItem(blocks[i], new Properties().tab(base.asItem().getItemCategory())));
			}
		}
		return this;
	}
}
