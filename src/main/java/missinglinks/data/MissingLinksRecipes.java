package missinglinks.data;

import java.util.function.Consumer;

import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class MissingLinksRecipes extends RecipeProvider {
	public MissingLinksRecipes(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> recipes) {
		MissingLinksBlocks.POLISHED_CALCITE.makeBlockStairsSlabWallRecipes(recipes, Blocks.CALCITE);
		MissingLinksBlocks.POLISHED_TUFF.makeBlockStairsSlabWallRecipes(recipes, Blocks.TUFF);
		MissingLinksBlocks.CALCITE.makeStairsSlabWallRecipes(recipes);
		MissingLinksBlocks.TUFF.makeStairsSlabWallRecipes(recipes);
		MissingLinksBlocks.DRIPSTONE_BLOCK.makeStairsSlabWallRecipes(recipes);
		MissingLinksBlocks.SMOOTH_BASALT.makeStairsSlabWallRecipes(recipes);
		MissingLinksBlocks.END_STONE.makeStairsSlabWallRecipes(recipes);
		MissingLinksBlocks.QUARTZ_BRICKS.makeStairsSlabWallRecipes(recipes);
		ShapedRecipeBuilder.shaped(MissingLinksBlocks.QUARTZ_BLOCK.blocks()[0].get(), 6).pattern("###").pattern("###").define('#', Blocks.QUARTZ_BLOCK).unlockedBy("has_block", RecipeProvider.has(Blocks.QUARTZ_BLOCK)).save(recipes);
		ShapedRecipeBuilder.shaped(MissingLinksBlocks.SMOOTH_QUARTZ.blocks()[0].get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_QUARTZ).unlockedBy("has_block", RecipeProvider.has(Blocks.SMOOTH_QUARTZ)).save(recipes);
		ShapedRecipeBuilder.shaped(MissingLinksBlocks.SMOOTH_RED_SANDSTONE.blocks()[0].get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_RED_SANDSTONE).unlockedBy("has_block", RecipeProvider.has(Blocks.SMOOTH_RED_SANDSTONE)).save(recipes);
		ShapedRecipeBuilder.shaped(MissingLinksBlocks.SMOOTH_SANDSTONE.blocks()[0].get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_SANDSTONE).unlockedBy("has_block", RecipeProvider.has(Blocks.SMOOTH_SANDSTONE)).save(recipes);
		ShapedRecipeBuilder.shaped(MissingLinksBlocks.SMOOTH_STONE.blocks()[0].get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', Blocks.SMOOTH_STONE).unlockedBy("has_block", RecipeProvider.has(Blocks.SMOOTH_STONE)).save(recipes);
		ShapedRecipeBuilder.shaped(MissingLinksBlocks.SMOOTH_STONE.blocks()[1].get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_STONE).unlockedBy("has_block", RecipeProvider.has(Blocks.SMOOTH_STONE)).save(recipes);
		MissingLinksBlocks.RED_NETHER_BRICKS.makeFencesFenceGatesRecipes(recipes);
		ShapedRecipeBuilder.shaped(MissingLinksBlocks.NETHER_BRICKS.blocks()[0].get(), 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', Blocks.NETHER_BRICKS).unlockedBy("has_block", RecipeProvider.has(Blocks.NETHER_BRICKS)).save(recipes);
	}
}
