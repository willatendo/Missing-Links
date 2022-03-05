package missinglinks.server.block;

import java.util.function.Consumer;

import missinglinks.MissingLinksMod;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
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

public record BlockGroup(Block base, RegistryObject<Block>[] blocks) {

	public ResourceLocation mc(String path) {
		return new ResourceLocation(ModelProvider.BLOCK_FOLDER + "/" + path);
	}

	public ResourceLocation mod(String path) {
		return new ResourceLocation(MissingLinksMod.ID, ModelProvider.BLOCK_FOLDER + "/" + path);
	}

	public static BlockGroup makeStairsSlabWall(Block base) {
		return new BlockGroup(base, new RegistryObject[] { MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_stairs", () -> new StairBlock(() -> base.defaultBlockState(), BlockBehaviour.Properties.copy(base))), MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(base))), MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(base))) });
	}

	public void makeStairsSlabWallRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0].get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1].get(), 6).pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[2].get(), 6).pattern("###").pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
	}

	public void makeStairsSlabWallBlockStatesAndModels(BlockStateProvider provider) {
		provider.stairsBlock((StairBlock) blocks[0].get(), this.mc(base.getRegistryName().getPath()));
		provider.slabBlock((SlabBlock) blocks[1].get(), this.mc(base.getRegistryName().getPath()), this.mc(base.getRegistryName().getPath()));
		provider.wallBlock((WallBlock) blocks[2].get(), this.mc(base.getRegistryName().getPath()));
	}

	public void makeStairsSlabWallItemModels(ItemModelProvider provider) {
		provider.withExistingParent(blocks[0].get().getRegistryName().getPath(), this.mod(blocks[0].get().getRegistryName().getPath()));
		provider.withExistingParent(blocks[1].get().getRegistryName().getPath(), this.mod(blocks[1].get().getRegistryName().getPath()));
		provider.wallInventory(blocks[2].get().getRegistryName().getPath(), this.mc(base.getRegistryName().getPath()));
	}

	public static BlockGroup makeFencesFenceGates(Block base) {
		return new BlockGroup(base, new RegistryObject[] { MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(base))), MissingLinksMod.BLOCKS.register(base.getRegistryName().getPath().replace("_block", "").replace("bricks", "brick") + "_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(base))) });
	}

	public void makeFencesFenceGatesRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0].get(), 6).pattern("#@#").pattern("#@#").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1].get(), 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
	}

	public void makeFencesFenceGatesBlockStatesAndModels(BlockStateProvider provider) {
		provider.fenceBlock((FenceBlock) blocks[0].get(), this.mc(base.getRegistryName().getPath()));
		provider.fenceGateBlock((FenceGateBlock) blocks[1].get(), this.mc(base.getRegistryName().getPath()));
	}

	public void makeFencesFenceGatesItemModels(ItemModelProvider provider) {
		provider.fenceInventory(blocks[0].get().getRegistryName().getPath(), this.mc(base.getRegistryName().getPath()));
		provider.withExistingParent(blocks[1].get().getRegistryName().getPath(), this.mod(blocks[1].get().getRegistryName().getPath()));
	}
}
