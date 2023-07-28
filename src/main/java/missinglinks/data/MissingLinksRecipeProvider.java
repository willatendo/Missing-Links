package missinglinks.data;

import java.util.function.Consumer;

import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class MissingLinksRecipeProvider extends RecipeProvider {
	public MissingLinksRecipeProvider(PackOutput packOutput) {
		super(packOutput);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> finishedRecipe) {
		this.lever(MissingLinksBlocks.ANDESITE_LEVER.get(), Blocks.ANDESITE, finishedRecipe);
		this.lever(MissingLinksBlocks.DIORITE_LEVER.get(), Blocks.DIORITE, finishedRecipe);
		this.lever(MissingLinksBlocks.GRANITE_LEVER.get(), Blocks.GRANITE, finishedRecipe);
		this.lever(MissingLinksBlocks.COBBLED_DEEPSLATE_LEVER.get(), Blocks.COBBLED_DEEPSLATE, finishedRecipe);
		this.lever(MissingLinksBlocks.CALCITE_LEVER.get(), Blocks.CALCITE, finishedRecipe);
		this.lever(MissingLinksBlocks.TUFF_LEVER.get(), Blocks.TUFF, finishedRecipe);
		this.lever(MissingLinksBlocks.DRIPSTONE_LEVER.get(), Blocks.DRIPSTONE_BLOCK, finishedRecipe);
		this.lever(MissingLinksBlocks.SMOOTH_BASALT_LEVER.get(), Blocks.SMOOTH_BASALT, finishedRecipe);
		this.lever(MissingLinksBlocks.END_STONE_LEVER.get(), Blocks.END_STONE, finishedRecipe);
		this.lever(MissingLinksBlocks.TERRACOTTA_LEVER.get(), Blocks.TERRACOTTA, finishedRecipe);
	}

	public void lever(Block block, Block stone, Consumer<FinishedRecipe> finishedRecipe) {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block).pattern("#").pattern("%").define('#', Items.STICK).define('%', stone).unlockedBy("has_item", has(stone)).save(finishedRecipe);
	}
}
