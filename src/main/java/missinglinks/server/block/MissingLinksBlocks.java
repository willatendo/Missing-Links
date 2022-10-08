package missinglinks.server.block;

import java.util.List;

import com.tterrag.registrate.util.entry.BlockEntry;

import missinglinks.MissingLinksMod;
import missinglinks.server.util.MissingLinksRegistrate;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

public class MissingLinksBlocks {
	private static final MissingLinksRegistrate REGISTRATE = MissingLinksMod.getRegistrate().creativeModeTab(() -> CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final BlockGroup ANDESITE = BlockGroup.makeButtonPressurePlate(Blocks.ANDESITE);
	public static final BlockGroup DIORITE = BlockGroup.makeButtonPressurePlate(Blocks.DIORITE);
	public static final BlockGroup GRANITE = BlockGroup.makeButtonPressurePlate(Blocks.GRANITE);
	public static final BlockGroup CALCITE_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.CALCITE);
	public static final BlockGroup TUFF_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.TUFF);
	public static final BlockGroup DRIPSTONE_BLOCK_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.DRIPSTONE_BLOCK);
	public static final BlockGroup SMOOTH_BASALT_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.SMOOTH_BASALT);
	public static final BlockGroup END_STONE_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.END_STONE);

	public static final List<BlockGroup> CONCRETE = BlockGroup.makeStairsSlabWallForEnumValues("concrete", DyeColor.values());

	public static final BlockGroup CALCITE = BlockGroup.makeStairsSlabWall(Blocks.CALCITE);
	public static final BlockGroup TUFF = BlockGroup.makeStairsSlabWall(Blocks.TUFF);
	public static final BlockGroup DRIPSTONE_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.DRIPSTONE_BLOCK);
	public static final BlockGroup SMOOTH_BASALT = BlockGroup.makeStairsSlabWall(Blocks.SMOOTH_BASALT);
	public static final BlockGroup END_STONE = BlockGroup.makeStairsSlabWall(Blocks.END_STONE);
	public static final BlockGroup QUARTZ_BRICKS = BlockGroup.makeStairsSlabWall(Blocks.QUARTZ_BRICKS);
	public static final BlockGroup QUARTZ_BLOCK = new BlockGroup(new BlockEntry[] { REGISTRATE.block("quartz_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.QUARTZ_BLOCK)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', Blocks.QUARTZ_BLOCK).unlockedBy("has_block", provider.has(Blocks.QUARTZ_BLOCK)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), block.get()).unlockedBy("has_block", provider.has(Blocks.QUARTZ_BLOCK)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_side"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_side"))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register() });
	public static final BlockGroup SMOOTH_QUARTZ = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_quartz_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_QUARTZ)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_QUARTZ).unlockedBy("has_block", provider.has(Blocks.SMOOTH_QUARTZ)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_QUARTZ)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_QUARTZ).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_bottom"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_QUARTZ).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_bottom"))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register() });
	public static final BlockGroup SMOOTH_RED_SANDSTONE = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_red_sandstone_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_RED_SANDSTONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_RED_SANDSTONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_RED_SANDSTONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_RED_SANDSTONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_RED_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.RED_SANDSTONE).getPath() + "_top"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_RED_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.RED_SANDSTONE).getPath() + "_top"))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register() });
	public static final BlockGroup SMOOTH_SANDSTONE = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_sandstone_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_SANDSTONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_SANDSTONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_SANDSTONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_SANDSTONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SANDSTONE).getPath() + "_top"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SANDSTONE).getPath() + "_top"))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register() });
	public static final BlockGroup SMOOTH_STONE = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_stone_stairs", properties -> new StairBlock(() -> Blocks.SMOOTH_STONE.defaultBlockState(), properties)).properties(properties -> properties.copy(Blocks.SMOOTH_STONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(block.get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', Blocks.SMOOTH_STONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.stairsBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getPath()))).simpleItem().register(), REGISTRATE.block("smooth_stone_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_STONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_STONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getPath()))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getPath()))).tab(() -> CreativeModeTab.TAB_DECORATIONS).build().register() });
	public static final BlockGroup RED_NETHER_BRICKS = BlockGroup.makeFencesFenceGates(Blocks.RED_NETHER_BRICKS);
	public static final BlockGroup NETHER_BRICKS = new BlockGroup(new BlockEntry[] { REGISTRATE.block("nether_brick_fence_gate", FenceGateBlock::new).properties(properties -> properties.copy(Blocks.NETHER_BRICKS)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(block.get(), 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', Blocks.NETHER_BRICKS).unlockedBy("has_block", RecipeProvider.has(Blocks.NETHER_BRICKS)).save(provider);
	}).blockstate((block, provider) -> provider.fenceGateBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.NETHER_BRICKS).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.NETHER_BRICKS).getPath()))).item().tab(() -> CreativeModeTab.TAB_REDSTONE).build().register() });
//	public static final BlockGroup PACKED_MUDS = BlockGroup.makeStairsSlabWall(Blocks.PACKED_MUD);
//	public static final BlockGroup SCULKS = BlockGroup.makeStairsSlabWall(Blocks.SCULK);

	public static void init() {
	}
}
