package missinglinks.server.block;

import java.util.function.Consumer;

import missinglinks.MissingLinksMod;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
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
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import tyrannotitanlib.tyranniregister.TyrannoRegister;

public record BlockGroup(Block base, Block[] blocks, String[] blockType) {

	public ResourceLocation mc(String path) {
		return new ResourceLocation(ModelProvider.BLOCK_FOLDER + "/" + path);
	}

	public ResourceLocation mod(String path) {
		return new ResourceLocation(MissingLinksMod.ID, ModelProvider.BLOCK_FOLDER + "/" + path);
	}

	public static BlockGroup makeStairsSlabWall(Block base) {
		return new BlockGroup(base, new Block[] { new StairBlock(() -> base.defaultBlockState(), BlockBehaviour.Properties.copy(base)), new SlabBlock(BlockBehaviour.Properties.copy(base)), new WallBlock(BlockBehaviour.Properties.copy(base)) }, new String[] { "stairs", "slab", "wall" });
	}

	public void makeStairsSlabWallRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0], 4).pattern("#  ").pattern("## ").pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1], 6).pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[2], 6).pattern("###").pattern("###").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
	}

	public void makeStairsSlabWallBlockStatesAndModels(BlockStateProvider provider) {
		provider.stairsBlock((StairBlock) blocks[0], this.mc(base.getRegistryName().getPath()));
		provider.slabBlock((SlabBlock) blocks[1], this.mc(base.getRegistryName().getPath()), this.mc(base.getRegistryName().getPath()));
		provider.wallBlock((WallBlock) blocks[2], this.mc(base.getRegistryName().getPath()));
	}

	public void makeStairsSlabWallItemModels(ItemModelProvider provider) {
		provider.withExistingParent(blocks[0].getRegistryName().getPath(), this.mod(blocks[0].getRegistryName().getPath()));
		provider.withExistingParent(blocks[1].getRegistryName().getPath(), this.mod(blocks[1].getRegistryName().getPath()));
		provider.wallInventory(blocks[2].getRegistryName().getPath(), this.mc(base.getRegistryName().getPath()));
	}

	public static BlockGroup makeFencesFenceGates(Block base) {
		return new BlockGroup(base, new Block[] { new FenceBlock(BlockBehaviour.Properties.copy(base)), new FenceGateBlock(BlockBehaviour.Properties.copy(base)) }, new String[] { "fence", "fence_gate" });
	}

	public void makeFencesFenceGatesRecipes(Consumer<FinishedRecipe> recipes) {
		ShapedRecipeBuilder.shaped(blocks[0], 6).pattern("#@#").pattern("#@#").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
		ShapedRecipeBuilder.shaped(blocks[1], 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(recipes);
	}

	public void makeFencesFenceGatesBlockStatesAndModels(BlockStateProvider provider) {
		provider.fenceBlock((FenceBlock) blocks[0], this.mc(base.getRegistryName().getPath()));
		provider.fenceGateBlock((FenceGateBlock) blocks[1], this.mc(base.getRegistryName().getPath()));
	}

	public void makeFencesFenceGatesItemModels(ItemModelProvider provider) {
		provider.fenceInventory(blocks[0].getRegistryName().getPath(), this.mc(base.getRegistryName().getPath()));
		provider.withExistingParent(blocks[1].getRegistryName().getPath(), this.mod(blocks[1].getRegistryName().getPath()));
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
