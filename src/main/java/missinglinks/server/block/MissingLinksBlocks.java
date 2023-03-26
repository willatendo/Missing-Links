package missinglinks.server.block;

import java.util.List;

import com.tterrag.registrate.util.entry.BlockEntry;

import missinglinks.MissingLinksMod;
import missinglinks.server.util.MissingLinksRegistrate;
import net.minecraft.core.Direction;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraftforge.client.model.generators.ConfiguredModel;

public class MissingLinksBlocks {
	public static final MissingLinksRegistrate REGISTRATE = MissingLinksMod.getRegistrate();

	public static final BlockEntry<LeverBlock> ANDESITE_LEVER = REGISTRATE.block("andesite_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.ANDESITE).unlockedBy("has_item", provider.has(Blocks.ANDESITE)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/andesite")).texture("base", provider.mcLoc("block/andesite")).texture("lever", provider.modLoc("block/andesite_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/andesite")).texture("base", provider.mcLoc("block/andesite")).texture("lever", provider.modLoc("block/andesite_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/andesite_lever"))).build().register();
	public static final BlockEntry<LeverBlock> DIORITE_LEVER = REGISTRATE.block("diorite_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.DIORITE).unlockedBy("has_item", provider.has(Blocks.DIORITE)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/diorite")).texture("base", provider.mcLoc("block/diorite")).texture("lever", provider.modLoc("block/diorite_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/diorite")).texture("base", provider.mcLoc("block/diorite")).texture("lever", provider.modLoc("block/diorite_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/diorite_lever"))).build().register();
	public static final BlockEntry<LeverBlock> GRANITE_LEVER = REGISTRATE.block("granite_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.GRANITE).unlockedBy("has_item", provider.has(Blocks.GRANITE)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/granite")).texture("base", provider.mcLoc("block/granite")).texture("lever", provider.modLoc("block/granite_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/granite")).texture("base", provider.mcLoc("block/granite")).texture("lever", provider.modLoc("block/granite_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/granite_lever"))).build().register();
	public static final BlockEntry<LeverBlock> COBBLED_DEEPSLATE_LEVER = REGISTRATE.block("cobbled_deepslate_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.COBBLED_DEEPSLATE).unlockedBy("has_item", provider.has(Blocks.COBBLED_DEEPSLATE)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/cobbled_deepslate")).texture("base", provider.mcLoc("block/cobbled_deepslate")).texture("lever", provider.modLoc("block/cobbled_deepslate_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/cobbled_deepslate")).texture("base", provider.mcLoc("block/cobbled_deepslate")).texture("lever", provider.modLoc("block/cobbled_deepslate_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/cobbled_deepslate_lever"))).build().register();
	public static final BlockEntry<LeverBlock> CALCITE_LEVER = REGISTRATE.block("calcite_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.CALCITE).unlockedBy("has_item", provider.has(Blocks.CALCITE)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/calcite")).texture("base", provider.mcLoc("block/calcite")).texture("lever", provider.modLoc("block/calcite_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/calcite")).texture("base", provider.mcLoc("block/calcite")).texture("lever", provider.modLoc("block/calcite_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/calcite_lever"))).build().register();
	public static final BlockEntry<LeverBlock> TUFF_LEVER = REGISTRATE.block("tuff_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.TUFF).unlockedBy("has_item", provider.has(Blocks.TUFF)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/tuff")).texture("base", provider.mcLoc("block/tuff")).texture("lever", provider.modLoc("block/tuff_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/tuff")).texture("base", provider.mcLoc("block/tuff")).texture("lever", provider.modLoc("block/tuff_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/tuff_lever"))).build().register();
	public static final BlockEntry<LeverBlock> DRIPSTONE_LEVER = REGISTRATE.block("dripstone_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.DRIPSTONE_BLOCK).unlockedBy("has_item", provider.has(Blocks.DRIPSTONE_BLOCK)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/dripstone_block")).texture("base", provider.mcLoc("block/dripstone_block")).texture("lever", provider.modLoc("block/dripstone_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/dripstone_block")).texture("base", provider.mcLoc("block/dripstone_block")).texture("lever", provider.modLoc("block/dripstone_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/dripstone_lever"))).build().register();
	public static final BlockEntry<LeverBlock> SMOOTH_BASALT_LEVER = REGISTRATE.block("smooth_basalt_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.SMOOTH_BASALT).unlockedBy("has_item", provider.has(Blocks.SMOOTH_BASALT)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/smooth_basalt")).texture("base", provider.mcLoc("block/smooth_basalt")).texture("lever", provider.modLoc("block/smooth_basalt_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/smooth_basalt")).texture("base", provider.mcLoc("block/smooth_basalt")).texture("lever", provider.modLoc("block/smooth_basalt_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/smooth_basalt_lever"))).build().register();
	public static final BlockEntry<LeverBlock> END_STONE_LEVER = REGISTRATE.block("end_stone_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.END_STONE).unlockedBy("has_item", provider.has(Blocks.END_STONE)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/end_stone")).texture("base", provider.mcLoc("block/end_stone")).texture("lever", provider.modLoc("block/end_stone_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/end_stone")).texture("base", provider.mcLoc("block/end_stone")).texture("lever", provider.modLoc("block/end_stone_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/end_stone_lever"))).build().register();
	public static final BlockEntry<LeverBlock> TERRACOTTA_LEVER = REGISTRATE.block("terracotta_lever", properties -> new LeverBlock(properties)).properties(properties -> properties.copy(Blocks.LEVER)).recipe((block, provider) -> ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get()).pattern("#").pattern("%").define('#', Items.STICK).define('%', Blocks.TERRACOTTA).unlockedBy("has_item", provider.has(Blocks.TERRACOTTA)).save(provider)).blockstate((block, provider) -> provider.getVariantBuilder(block.get()).forAllStates(state -> {
		Direction facing = state.getValue(LeverBlock.FACING);
		AttachFace face = state.getValue(LeverBlock.FACE);
		boolean powered = state.getValue(LeverBlock.POWERED);
		return ConfiguredModel.builder().modelFile(powered ? provider.models().withExistingParent(block.getName(), provider.mcLoc("block/lever")).texture("particle", provider.mcLoc("block/terracotta")).texture("base", provider.mcLoc("block/terracotta")).texture("lever", provider.modLoc("block/terracotta_lever")) : provider.models().withExistingParent(block.getName() + "_on", provider.mcLoc("block/lever_on")).texture("particle", provider.mcLoc("block/terracotta")).texture("base", provider.mcLoc("block/terracotta")).texture("lever", provider.modLoc("block/terracotta_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
	})).item().model((item, provider) -> provider.generated(item, provider.modLoc("block/terracotta_lever"))).build().register();

	public static final BlockGroup ANDESITE = BlockGroup.makeButtonPressurePlate(Blocks.ANDESITE);
	public static final BlockGroup DIORITE = BlockGroup.makeButtonPressurePlate(Blocks.DIORITE);
	public static final BlockGroup GRANITE = BlockGroup.makeButtonPressurePlate(Blocks.GRANITE);
	public static final BlockGroup CALCITE_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.CALCITE);
	public static final BlockGroup TUFF_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.TUFF);
	public static final BlockGroup DRIPSTONE_BLOCK_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.DRIPSTONE_BLOCK);
	public static final BlockGroup SMOOTH_BASALT_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.SMOOTH_BASALT);
	public static final BlockGroup END_STONE_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.END_STONE);
	public static final BlockGroup BASE_TERRACOTTA = BlockGroup.makeStairsSlabWall(Blocks.TERRACOTTA);
	public static final BlockGroup BASE_TERRACOTTA_REDSTONE = BlockGroup.makeButtonPressurePlate(Blocks.TERRACOTTA);
	public static final BlockGroup CLAY = BlockGroup.makeStairsSlabWall(Blocks.CLAY);
	public static final BlockGroup COAL_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.COAL_BLOCK);
	public static final BlockGroup IRON_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.IRON_BLOCK);
	public static final BlockGroup GOLD_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.GOLD_BLOCK);
	public static final BlockGroup REDSTONE_BLOCK = new BlockGroup(new BlockEntry[] { REGISTRATE.block("redstone_stairs", p -> new PoweredStairBlock(() -> Blocks.REDSTONE_BLOCK.defaultBlockState(), p)).properties(p -> p.copy(Blocks.REDSTONE_BLOCK)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', Blocks.REDSTONE_BLOCK).unlockedBy("has_block", provider.has(Blocks.REDSTONE_BLOCK)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.REDSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, block.get()).unlockedBy("has_block", provider.has(Blocks.REDSTONE_BLOCK)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.stairsBlock(block.get(), new ResourceLocation("block/redstone_block"))).tag(BlockTags.STAIRS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register(), REGISTRATE.block("redstone_slab", PoweredSlabBlock::new).properties(p -> p.copy(Blocks.REDSTONE_BLOCK)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 6).pattern("###").define('#', Blocks.REDSTONE_BLOCK).unlockedBy("has_block", provider.has(Blocks.REDSTONE_BLOCK)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.REDSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, block.get(), 2).unlockedBy("has_block", provider.has(Blocks.REDSTONE_BLOCK)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.slabBlock(block.get(), new ResourceLocation("block/redstone_block"), new ResourceLocation("block/redstone_block"))).tag(BlockTags.SLABS, BlockTags.MINEABLE_WITH_PICKAXE).simpleItem().register(), REGISTRATE.block("redstone_wall", PoweredWallBlock::new).properties(p -> p.copy(Blocks.REDSTONE_BLOCK)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 6).pattern("###").pattern("###").define('#', Blocks.REDSTONE_BLOCK).unlockedBy("has_block", provider.has(Blocks.REDSTONE_BLOCK)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.REDSTONE_BLOCK), RecipeCategory.DECORATIONS, block.get()).unlockedBy("has_block", provider.has(Blocks.REDSTONE_BLOCK)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));

	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation("block/redstone_block"))).tag(BlockTags.WALLS, BlockTags.MINEABLE_WITH_PICKAXE).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation("block/redstone_block"))).build().register() });
	public static final BlockGroup EMERALD_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.EMERALD_BLOCK);
	public static final BlockGroup LAPIS_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.LAPIS_BLOCK);
	public static final BlockGroup DIAMOND_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.DIAMOND_BLOCK);
	public static final BlockGroup NETHERITE_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.NETHERITE_BLOCK);

	public static final List<BlockGroup> CONCRETE = BlockGroup.makeStairsSlabWallForEnumValues("concrete", DyeColor.values());
	public static final List<BlockGroup> TERRACOTTA = BlockGroup.makeStairsSlabWallForEnumValues("terracotta", DyeColor.values());
	public static final List<BlockGroup> GLAZED_TERRACOTTA = BlockGroup.makeStairsSlabWallForEnumValues("glazed_terracotta", DyeColor.values());
	public static final List<BlockGroup> WOOL = BlockGroup.makeStairsSlabWallForEnumValues("wool", DyeColor.values());
	public static final List<BlockGroup> CONCRETE_REDSTONE = BlockGroup.makeRedstoneForEnumValues("concrete", DyeColor.values());
	public static final List<BlockGroup> TERRACOTTA_REDSTONE = BlockGroup.makeRedstoneForEnumValues("terracotta", DyeColor.values());
	public static final List<BlockGroup> GLAZED_TERRACOTTA_REDSTONE = BlockGroup.makeRedstoneForEnumValues("glazed_terracotta", DyeColor.values());

	public static final BlockGroup CALCITE = BlockGroup.makeStairsSlabWall(Blocks.CALCITE);
	public static final BlockGroup TUFF = BlockGroup.makeStairsSlabWall(Blocks.TUFF);
	public static final BlockGroup DRIPSTONE_BLOCK = BlockGroup.makeStairsSlabWall(Blocks.DRIPSTONE_BLOCK);
	public static final BlockGroup SMOOTH_BASALT = BlockGroup.makeStairsSlabWall(Blocks.SMOOTH_BASALT);
	public static final BlockGroup END_STONE = BlockGroup.makeStairsSlabWall(Blocks.END_STONE);
	public static final BlockGroup OBSIDIAN = BlockGroup.makeStairsSlabWall(Blocks.OBSIDIAN);
	public static final BlockGroup CRYING_OBSIDIAN = BlockGroup.makeStairsSlabWall(Blocks.CRYING_OBSIDIAN);
	public static final BlockGroup QUARTZ_BRICKS = BlockGroup.makeStairsSlabWall(Blocks.QUARTZ_BRICKS);
	public static final BlockGroup QUARTZ_BLOCK = new BlockGroup(new BlockEntry[] { REGISTRATE.block("quartz_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.QUARTZ_BLOCK)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 6).pattern("###").pattern("###").define('#', Blocks.QUARTZ_BLOCK).unlockedBy("has_block", provider.has(Blocks.QUARTZ_BLOCK)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.DECORATIONS, block.get()).unlockedBy("has_block", provider.has(Blocks.QUARTZ_BLOCK)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_side"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_side"))).build().register() });
	public static final BlockGroup SMOOTH_QUARTZ = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_quartz_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_QUARTZ)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_QUARTZ).unlockedBy("has_block", provider.has(Blocks.SMOOTH_QUARTZ)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_QUARTZ), RecipeCategory.DECORATIONS, block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_QUARTZ)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_QUARTZ).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_bottom"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_QUARTZ).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.QUARTZ_BLOCK).getPath() + "_bottom"))).build().register() });
	public static final BlockGroup SMOOTH_RED_SANDSTONE = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_red_sandstone_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_RED_SANDSTONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_RED_SANDSTONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_RED_SANDSTONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE), RecipeCategory.DECORATIONS, block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_RED_SANDSTONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_RED_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.RED_SANDSTONE).getPath() + "_top"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_RED_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.RED_SANDSTONE).getPath() + "_top"))).build().register() });
	public static final BlockGroup SMOOTH_SANDSTONE = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_sandstone_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_SANDSTONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_SANDSTONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_SANDSTONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_SANDSTONE), RecipeCategory.DECORATIONS, block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_SANDSTONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SANDSTONE).getPath() + "_top"))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_SANDSTONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SANDSTONE).getPath() + "_top"))).build().register() });
	public static final BlockGroup SMOOTH_STONE = new BlockGroup(new BlockEntry[] { REGISTRATE.block("smooth_stone_stairs", properties -> new StairBlock(() -> Blocks.SMOOTH_STONE.defaultBlockState(), properties)).properties(properties -> properties.copy(Blocks.SMOOTH_STONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 4).pattern("#  ").pattern("## ").pattern("###").define('#', Blocks.SMOOTH_STONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), RecipeCategory.DECORATIONS, block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.stairsBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getPath()))).simpleItem().register(), REGISTRATE.block("smooth_stone_wall", WallBlock::new).properties(properties -> properties.copy(Blocks.SMOOTH_STONE)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 6).pattern("###").pattern("###").define('#', Blocks.SMOOTH_STONE).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider);
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), RecipeCategory.DECORATIONS, block.get()).unlockedBy("has_block", provider.has(Blocks.SMOOTH_STONE)).save(provider, MissingLinksMod.rL(block.getName() + "_from_stonecutting"));
	}).blockstate((block, provider) -> provider.wallBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getPath()))).tag(BlockTags.WALLS).item().model((item, provider) -> provider.withExistingParent(item.getName(), new ResourceLocation("block/wall_inventory")).texture("wall", new ResourceLocation(BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.SMOOTH_STONE).getPath()))).build().register() });
	public static final BlockGroup RED_NETHER_BRICKS = BlockGroup.makeFencesFenceGates(Blocks.RED_NETHER_BRICKS);
	public static final BlockGroup NETHER_BRICKS = new BlockGroup(new BlockEntry[] { REGISTRATE.block("nether_brick_fence_gate", p -> new FenceGateBlock(p, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN)).properties(properties -> properties.copy(Blocks.NETHER_BRICKS)).recipe((block, provider) -> {
		ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, block.get(), 6).pattern("@#@").pattern("@#@").define('@', Items.NETHER_BRICK).define('#', Blocks.NETHER_BRICKS).unlockedBy("has_block", RecipeProvider.has(Blocks.NETHER_BRICKS)).save(provider);
	}).blockstate((block, provider) -> provider.fenceGateBlock(block.get(), new ResourceLocation(BlockGroup.getRegistryName(Blocks.NETHER_BRICKS).getNamespace(), "block/" + BlockGroup.getRegistryName(Blocks.NETHER_BRICKS).getPath()))).item().build().register() });
	public static final BlockGroup PACKED_MUDS = BlockGroup.makeStairsSlabWall(Blocks.PACKED_MUD);
	public static final BlockGroup SCULKS = BlockGroup.makeStairsSlabWall(Blocks.SCULK);

	public static void init() {
	}
}
