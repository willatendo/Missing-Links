package missinglinks.server.block;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.compress.utils.Lists;

import com.tterrag.registrate.util.entry.BlockEntry;

import missinglinks.MissingLinksMod;
import missinglinks.server.util.MissingLinksRegistrate;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockGroup<T extends Block> {
	private static final MissingLinksRegistrate REGISTRATE = MissingLinksMod.getRegistrate().creativeModeTab(() -> CreativeModeTab.TAB_BUILDING_BLOCKS);
	public final BlockEntry<T>[] blocks;

	public BlockGroup(BlockEntry<T>[] blocks) {
		this.blocks = blocks;
	}

	public static ResourceLocation getRegistryName(Block block) {
		return ForgeRegistries.BLOCKS.getKey(block);
	}

	public BlockEntry<T>[] blocks() {
		return this.blocks;
	}

	public static BlockGroup makeBlockStairsSlabWall(String name, BlockBehaviour.Properties properties, Block rawBlock) {
		BlockEntry<Block> base = REGISTRATE.block(name, Block::new).properties(p -> properties).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 4).pattern("##").pattern("##").define('#', rawBlock).unlockedBy("has_block", provider.has(rawBlock)).save(provider);
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), block.get()).unlockedBy("has_block", provider.has(rawBlock)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stone_stonecutting"));
		}).simpleItem().tag(BlockTags.MINEABLE_WITH_PICKAXE).register();
		BlockEntry<StairBlock> stairs = REGISTRATE.block(name.replace("_block", "").replace("bricks", "brick") + "_stairs", p -> new StairBlock(() -> base.getDefaultState(), p)).properties(p -> properties).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', rawBlock).unlockedBy("has_block", provider.has(rawBlock)).save(provider);
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(base.get()), block.get()).unlockedBy("has_block", provider.has(base.get())).save(provider, MissingLinksMod.rL(block.getName() + "_from_stone_stonecutting"));
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), block.get()).unlockedBy("has_block", provider.has(rawBlock)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
		}).blockstate((block, provider) -> provider.stairsBlock(block.get(), new ResourceLocation(getRegistryName(base.get()).getNamespace(), "block/" + name))).tag(BlockTags.STAIRS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register();
		BlockEntry<SlabBlock> slab = REGISTRATE.block(name.replace("_block", "").replace("bricks", "brick") + "_slab", SlabBlock::new).properties(p -> properties).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").define('#', rawBlock).unlockedBy("has_block", provider.has(rawBlock)).save(provider);
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(base.get()), block.get(), 2).unlockedBy("has_block", provider.has(base.get())).save(provider, MissingLinksMod.rL(block.getName() + "_from_stone_stonecutting"));
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), block.get(), 2).unlockedBy("has_block", provider.has(rawBlock)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
		}).blockstate((block, provider) -> provider.slabBlock(block.get(), new ResourceLocation(getRegistryName(base.get()).getNamespace(), "block/" + name), new ResourceLocation(getRegistryName(base.get()).getNamespace(), "block/" + name))).tag(BlockTags.SLABS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register();
		BlockEntry<WallBlock> wall = REGISTRATE.block(name.replace("_block", "").replace("bricks", "brick") + "_wall", WallBlock::new).properties(p -> properties).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', rawBlock).unlockedBy("has_block", provider.has(rawBlock)).save(provider);
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(base.get()), block.get()).unlockedBy("has_block", provider.has(base.get())).save(provider, MissingLinksMod.rL(block.getName() + "_from_stone_stonecutting"));
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(rawBlock), block.get()).unlockedBy("has_block", provider.has(rawBlock)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
		}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(getRegistryName(base.get()).getNamespace(), "block/" + name))).tag(BlockTags.WALLS, BlockTags.MINEABLE_WITH_PICKAXE).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", MissingLinksMod.rL("block/" + name))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register();

		return new BlockGroup(new BlockEntry[] { base, stairs, slab, wall });
	}

	public static <T extends StringRepresentable> List<BlockGroup> makeStairsSlabWallForEnumValues(String name, T[] enumValues) {
		ArrayList<BlockGroup> items = Lists.newArrayList();
		for (int i = 0; i < enumValues.length; i++) {
			Block base = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(enumValues[i].getSerializedName() + "_concrete"));
			items.add(new BlockGroup(new BlockEntry[] { REGISTRATE.block(enumValues[i].getSerializedName() + "_" + name + "_stairs", p -> new StairBlock(() -> base.defaultBlockState(), p)).properties(p -> p.copy(base)).recipe((block, provider) -> {
				ShapedRecipeBuilder.shaped(block.get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', base).unlockedBy("has_block", provider.has(base)).save(provider);
				SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), block.get()).unlockedBy("has_block", provider.has(base)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
			}).blockstate((block, provider) -> provider.stairsBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.STAIRS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register(), REGISTRATE.block(enumValues[i].getSerializedName() + "_" + name + "_slab", SlabBlock::new).properties(p -> p.copy(base)).recipe((block, provider) -> {
				ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").define('#', base).unlockedBy("has_block", provider.has(base)).save(provider);
				SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), block.get(), 2).unlockedBy("has_block", provider.has(base)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
			}).blockstate((block, provider) -> provider.slabBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.SLABS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register(), REGISTRATE.block(enumValues[i].getSerializedName() + "_" + name + "_wall", WallBlock::new).properties(p -> p.copy(base)).recipe((block, provider) -> {
				ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', base).unlockedBy("has_block", provider.has(base)).save(provider);
				SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), block.get()).unlockedBy("has_block", provider.has(base)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
			}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.WALLS, BlockTags.MINEABLE_WITH_PICKAXE).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register() }));
		}
		return items;
	}

	public static BlockGroup makeStairsSlabWall(Block base) {
		return new BlockGroup(new BlockEntry[] { REGISTRATE.block(getRegistryName(base).getPath().replace("_block", "").replace("bricks", "brick") + "_stairs", p -> new StairBlock(() -> base.defaultBlockState(), p)).properties(p -> p.copy(base)).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', base).unlockedBy("has_block", provider.has(base)).save(provider);
			if (base != Blocks.SCULK) {
				SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), block.get()).unlockedBy("has_block", provider.has(base)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
			}
		}).blockstate((block, provider) -> provider.stairsBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.STAIRS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register(), REGISTRATE.block(getRegistryName(base).getPath().replace("_block", "").replace("bricks", "brick") + "_slab", SlabBlock::new).properties(p -> p.copy(base)).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").define('#', base).unlockedBy("has_block", provider.has(base)).save(provider);
			if (base != Blocks.SCULK) {
				SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), block.get(), 2).unlockedBy("has_block", provider.has(base)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
			}
		}).blockstate((block, provider) -> provider.slabBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.SLABS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register(), REGISTRATE.block(getRegistryName(base).getPath().replace("_block", "").replace("bricks", "brick") + "_wall", WallBlock::new).properties(p -> p.copy(base)).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', base).unlockedBy("has_block", provider.has(base)).save(provider);
			if (base != Blocks.SCULK) {
				SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), block.get()).unlockedBy("has_block", provider.has(base)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
			}
		}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.WALLS, BlockTags.MINEABLE_WITH_PICKAXE).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register() });
	}

	public static BlockGroup makeFencesFenceGates(Block base) {
		return new BlockGroup(new BlockEntry[] { REGISTRATE.block(getRegistryName(base).getPath().replace("_block", "").replace("bricks", "brick") + "_fence", FenceBlock::new).properties(p -> p.copy(base)).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 6).pattern("#@#").pattern("#@#").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(provider);
		}).blockstate((block, provider) -> provider.fenceBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.FENCES, BlockTags.MINEABLE_WITH_PICKAXE).item().model((item, provider) -> provider.fenceInventory(item.getName(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).build().register(), REGISTRATE.block(getRegistryName(base).getPath().replace("_block", "").replace("bricks", "brick") + "_fence_gate", FenceGateBlock::new).properties(p -> p.copy(base)).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get(), 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(provider);
		}).blockstate((block, provider) -> provider.fenceGateBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.FENCE_GATES, BlockTags.MINEABLE_WITH_PICKAXE).item().tab(() -> CreativeModeTab.TAB_REDSTONE).build().register() });
	}

	public static BlockGroup makeButtonPressurePlate(Block base) {
		return new BlockGroup(new BlockEntry[] { REGISTRATE.block(getRegistryName(base).getPath().replace("_block", "").replace("bricks", "brick") + "_pressure_plate", properties -> new PressurePlateBlock(Sensitivity.MOBS, properties)).properties(p -> p.copy(base).noCollission().noOcclusion()).recipe((block, provider) -> {
			ShapedRecipeBuilder.shaped(block.get()).pattern("##").define('#', base).unlockedBy("has_block", RecipeProvider.has(base)).save(provider);
		}).blockstate((block, provider) -> provider.pressurePlateBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.PRESSURE_PLATES, BlockTags.MINEABLE_WITH_PICKAXE).item().tab(() -> CreativeModeTab.TAB_REDSTONE).build().register(), REGISTRATE.block(getRegistryName(base).getPath().replace("_block", "").replace("bricks", "brick") + "_button", StoneButtonBlock::new).properties(p -> p.copy(base)).recipe((block, provider) -> {
			ShapelessRecipeBuilder.shapeless(block.get()).requires(Ingredient.of(base)).unlockedBy("has_block", RecipeProvider.has(base)).save(provider);
		}).blockstate((block, provider) -> provider.buttonBlock(block.get(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tag(BlockTags.BUTTONS, BlockTags.MINEABLE_WITH_PICKAXE).item().model((item, provider) -> provider.buttonInventory(item.getName(), new ResourceLocation(getRegistryName(base).getNamespace(), "block/" + getRegistryName(base).getPath()))).tab(() -> CreativeModeTab.TAB_REDSTONE).build().register() });
	}
}
