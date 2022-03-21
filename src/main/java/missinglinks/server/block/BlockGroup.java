package missinglinks.server.block;

import static missinglinks.MissingLinksMod.UTILS;

import java.util.function.Consumer;
import java.util.function.Supplier;

import missinglinks.MissingLinksMod;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.registries.RegistryObject;

public class BlockGroup {
	public final RegistryObject<Block>[] blocks;
	private Supplier<Block> baseBlock;

	public BlockGroup(Supplier<Block> base, RegistryObject<Block>[] blocks) {
		this.baseBlock = base;
		this.blocks = blocks;
	}

	public RegistryObject<Block>[] blocks() {
		return this.blocks;
	}

	public static BlockGroup makeBlockStairsSlabWall(String name, BlockBehaviour.Properties properties) {
		RegistryObject<Block> base = MissingLinksMod.BLOCKS.register(name, () -> new Block(properties));
		RegistryObject<Block> stairs = MissingLinksMod.BLOCKS.register(name + "_stairs", () -> new StairBlock(() -> base.get().defaultBlockState(), properties));
		RegistryObject<Block> slab = MissingLinksMod.BLOCKS.register(name + "_slab", () -> new SlabBlock(properties));
		RegistryObject<Block> wall = MissingLinksMod.BLOCKS.register(name + "_wall", () -> new WallBlock(properties));

		return new BlockGroup(() -> base.get(), new RegistryObject[] { base, stairs, slab, wall });
	}

	public void makeBlockStairsSlabWallRecipes(Consumer<FinishedRecipe> recipes, Block rawBlock) {
		ShapedRecipeBuilder.shaped(blocks[0].get(), 4).pattern("##").pattern("##").define('#', rawBlock).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1].get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[2].get(), 6).pattern("###").define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[3].get(), 6).pattern("###").pattern("###").define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), blocks[0].get()).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes, UTILS.resource(blocks[0].get().getRegistryName().getPath() + "_from_raw_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), blocks[1].get()).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes, UTILS.resource(blocks[1].get().getRegistryName().getPath() + "_from_raw_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), blocks[2].get()).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes, UTILS.resource(blocks[2].get().getRegistryName().getPath() + "_from_raw_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), blocks[3].get()).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes, UTILS.resource(blocks[3].get().getRegistryName().getPath() + "_from_raw_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(blocks[0].get()), blocks[1].get()).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes, UTILS.resource(blocks[1].get().getRegistryName().getPath() + "_from_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(blocks[0].get()), blocks[2].get()).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes, UTILS.resource(blocks[2].get().getRegistryName().getPath() + "_from_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(blocks[0].get()), blocks[3].get()).unlockedBy("has_block", RecipeProvider.has(rawBlock)).save(recipes, UTILS.resource(blocks[3].get().getRegistryName().getPath() + "_from_stonecutting"));
	}

	public void makeBlockStairsSlabWallBlockStatesAndModels(BlockStateProvider provider) {
		provider.simpleBlock(blocks[0].get());
		provider.stairsBlock((StairBlock) blocks[1].get(), this.mod(baseBlock.get().getRegistryName().getPath()));
		provider.slabBlock((SlabBlock) blocks[2].get(), this.mod(baseBlock.get().getRegistryName().getPath()), this.mod(baseBlock.get().getRegistryName().getPath()));
		provider.wallBlock((WallBlock) blocks[3].get(), this.mod(baseBlock.get().getRegistryName().getPath()));
	}

	public void makeBlockStairsSlabWallItemModels(ItemModelProvider provider) {
		provider.withExistingParent(blocks[0].get().getRegistryName().getPath(), this.mod(blocks[0].get().getRegistryName().getPath()));
		provider.withExistingParent(blocks[1].get().getRegistryName().getPath(), this.mod(blocks[1].get().getRegistryName().getPath()));
		provider.withExistingParent(blocks[2].get().getRegistryName().getPath(), this.mod(blocks[2].get().getRegistryName().getPath()));
		provider.wallInventory(blocks[3].get().getRegistryName().getPath(), this.mod(blocks[0].get().getRegistryName().getPath()));
	}

	public ResourceLocation mc(String path) {
		return new ResourceLocation(ModelProvider.BLOCK_FOLDER + "/" + path);
	}

	public ResourceLocation mod(String path) {
		return new ResourceLocation(MissingLinksMod.ID, ModelProvider.BLOCK_FOLDER + "/" + path);
	}

	public static BlockGroup makeStairsSlabWall(Block base) {
		return new BlockGroup(() -> base, new RegistryObject[] { MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_stairs", () -> new StairBlock(() -> base.defaultBlockState(), BlockBehaviour.Properties.copy(base))), MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(base))), MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(base))) });
	}

	public void makeStairsSlabWallRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0].get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1].get(), 6).pattern("###").define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[2].get(), 6).pattern("###").pattern("###").define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(baseBlock.get()), blocks[0].get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes, UTILS.resource(blocks[0].get().getRegistryName().getPath() + "_from_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(baseBlock.get()), blocks[1].get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes, UTILS.resource(blocks[1].get().getRegistryName().getPath() + "_from_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(baseBlock.get()), blocks[2].get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes, UTILS.resource(blocks[2].get().getRegistryName().getPath() + "_from_stonecutting"));
	}

	public void makeStairsSlabWallBlockStatesAndModels(BlockStateProvider provider) {
		provider.stairsBlock((StairBlock) blocks[0].get(), this.mc(baseBlock.get().getRegistryName().getPath()));
		provider.slabBlock((SlabBlock) blocks[1].get(), this.mc(baseBlock.get().getRegistryName().getPath()), this.mc(baseBlock.get().getRegistryName().getPath()));
		provider.wallBlock((WallBlock) blocks[2].get(), this.mc(baseBlock.get().getRegistryName().getPath()));
	}

	public void makeStairsSlabWallItemModels(ItemModelProvider provider) {
		provider.withExistingParent(blocks[0].get().getRegistryName().getPath(), this.mod(blocks[0].get().getRegistryName().getPath()));
		provider.withExistingParent(blocks[1].get().getRegistryName().getPath(), this.mod(blocks[1].get().getRegistryName().getPath()));
		provider.wallInventory(blocks[2].get().getRegistryName().getPath(), this.mc(baseBlock.get().getRegistryName().getPath()));
	}

	public static BlockGroup makeFencesFenceGates(Block base) {
		return new BlockGroup(() -> base, new RegistryObject[] { MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(base))), MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(base))) });
	}

	public void makeFencesFenceGatesRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0].get(), 6).pattern("#@#").pattern("#@#").define('@', Items.NETHER_BRICK).define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1].get(), 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', baseBlock.get()).unlockedBy("has_block", RecipeProvider.has(baseBlock.get())).save(recipes);
	}

	public void makeFencesFenceGatesBlockStatesAndModels(BlockStateProvider provider) {
		provider.fenceBlock((FenceBlock) blocks[0].get(), this.mc(baseBlock.get().getRegistryName().getPath()));
		provider.fenceGateBlock((FenceGateBlock) blocks[1].get(), this.mc(baseBlock.get().getRegistryName().getPath()));
	}

	public void makeFencesFenceGatesItemModels(ItemModelProvider provider) {
		provider.fenceInventory(blocks[0].get().getRegistryName().getPath(), this.mc(baseBlock.get().getRegistryName().getPath()));
		provider.withExistingParent(blocks[1].get().getRegistryName().getPath(), this.mod(blocks[1].get().getRegistryName().getPath()));
	}
}
