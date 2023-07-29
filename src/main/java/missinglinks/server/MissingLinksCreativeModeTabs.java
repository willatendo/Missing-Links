package missinglinks.server;

import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.item.MissingLinksItems;
import missinglinks.server.util.MissingLinksUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import willatendo.simplelibrary.server.util.SimpleUtils;

public class MissingLinksCreativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MissingLinksUtils.ID);

	public static final RegistryObject<CreativeModeTab> MISSING_LINKS_BLOCKS = CREATIVE_MODE_TABS.register("missing_links_blocks", () -> CreativeModeTab.builder().title(MissingLinksUtils.translation("itemGroup", MissingLinksUtils.ID)).icon(() -> MissingLinksBlocks.CALCITE_STAIRS.get().asItem().getDefaultInstance()).displayItems((itemDisplayParameters, output) -> {
		SimpleUtils.fillCreativeTab(MissingLinksItems.ITEMS, itemDisplayParameters, output);
	}).build());
	public static final RegistryObject<CreativeModeTab> MISSING_LINKS_PALETTES = CREATIVE_MODE_TABS.register("missing_links_palettes", () -> CreativeModeTab.builder().withTabsBefore(MissingLinksCreativeModeTabs.MISSING_LINKS_BLOCKS.getKey()).title(MissingLinksUtils.translation("itemGroup", MissingLinksUtils.ID + "_palettes")).icon(() -> MissingLinksItems.ICON.get().getDefaultInstance()).displayItems((itemDisplayParameters, output) -> {
		output.accept(Blocks.ANDESITE);
		output.accept(Blocks.ANDESITE_STAIRS);
		output.accept(Blocks.ANDESITE_SLAB);
		output.accept(Blocks.ANDESITE_WALL);
		output.accept(MissingLinksBlocks.ANDESITE_BUTTON.get());
		output.accept(MissingLinksBlocks.ANDESITE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.ANDESITE_LEVER.get());
		output.accept(Blocks.DIORITE);
		output.accept(Blocks.DIORITE_STAIRS);
		output.accept(Blocks.DIORITE_SLAB);
		output.accept(Blocks.DIORITE_WALL);
		output.accept(MissingLinksBlocks.DIORITE_BUTTON.get());
		output.accept(MissingLinksBlocks.DIORITE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.DIORITE_LEVER.get());
		output.accept(Blocks.GRANITE);
		output.accept(Blocks.GRANITE_STAIRS);
		output.accept(Blocks.GRANITE_SLAB);
		output.accept(Blocks.GRANITE_WALL);
		output.accept(MissingLinksBlocks.GRANITE_BUTTON.get());
		output.accept(MissingLinksBlocks.GRANITE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.GRANITE_LEVER.get());
		output.accept(Blocks.CALCITE);
		output.accept(MissingLinksBlocks.CALCITE_STAIRS.get());
		output.accept(MissingLinksBlocks.CALCITE_SLAB.get());
		output.accept(MissingLinksBlocks.CALCITE_WALL.get());
		output.accept(MissingLinksBlocks.CALCITE_BUTTON.get());
		output.accept(MissingLinksBlocks.CALCITE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.CALCITE_LEVER.get());
		output.accept(Blocks.TUFF);
		output.accept(MissingLinksBlocks.TUFF_STAIRS.get());
		output.accept(MissingLinksBlocks.TUFF_SLAB.get());
		output.accept(MissingLinksBlocks.TUFF_WALL.get());
		output.accept(MissingLinksBlocks.TUFF_BUTTON.get());
		output.accept(MissingLinksBlocks.TUFF_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.TUFF_LEVER.get());
		output.accept(Blocks.DRIPSTONE_BLOCK);
		output.accept(MissingLinksBlocks.DRIPSTONE_STAIRS.get());
		output.accept(MissingLinksBlocks.DRIPSTONE_SLAB.get());
		output.accept(MissingLinksBlocks.DRIPSTONE_WALL.get());
		output.accept(MissingLinksBlocks.DRIPSTONE_BUTTON.get());
		output.accept(MissingLinksBlocks.DRIPSTONE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.DRIPSTONE_LEVER.get());
		output.accept(Blocks.SMOOTH_BASALT);
		output.accept(MissingLinksBlocks.SMOOTH_BASALT_STAIRS.get());
		output.accept(MissingLinksBlocks.SMOOTH_BASALT_SLAB.get());
		output.accept(MissingLinksBlocks.SMOOTH_BASALT_WALL.get());
		output.accept(MissingLinksBlocks.SMOOTH_BASALT_BUTTON.get());
		output.accept(MissingLinksBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.SMOOTH_BASALT_LEVER.get());
		output.accept(Blocks.END_STONE);
		output.accept(MissingLinksBlocks.END_STONE_STAIRS.get());
		output.accept(MissingLinksBlocks.END_STONE_SLAB.get());
		output.accept(MissingLinksBlocks.END_STONE_WALL.get());
		output.accept(MissingLinksBlocks.END_STONE_BUTTON.get());
		output.accept(MissingLinksBlocks.END_STONE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.END_STONE_LEVER.get());
		output.accept(Blocks.OBSIDIAN);
		output.accept(MissingLinksBlocks.OBSIDIAN_STAIRS.get());
		output.accept(MissingLinksBlocks.OBSIDIAN_SLAB.get());
		output.accept(MissingLinksBlocks.OBSIDIAN_WALL.get());
		output.accept(MissingLinksBlocks.OBSIDIAN_BUTTON.get());
		output.accept(MissingLinksBlocks.OBSIDIAN_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.OBSIDIAN_LEVER.get());
		output.accept(Blocks.CRYING_OBSIDIAN);
		output.accept(MissingLinksBlocks.CRYING_OBSIDIAN_STAIRS.get());
		output.accept(MissingLinksBlocks.CRYING_OBSIDIAN_SLAB.get());
		output.accept(MissingLinksBlocks.CRYING_OBSIDIAN_WALL.get());
		output.accept(MissingLinksBlocks.CRYING_OBSIDIAN_BUTTON.get());
		output.accept(MissingLinksBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.CRYING_OBSIDIAN_LEVER.get());
		output.accept(Blocks.QUARTZ_BRICKS);
		output.accept(MissingLinksBlocks.QUARTZ_BRICK_STAIRS.get());
		output.accept(MissingLinksBlocks.QUARTZ_BRICK_SLAB.get());
		output.accept(MissingLinksBlocks.QUARTZ_BRICK_WALL.get());
		output.accept(MissingLinksBlocks.QUARTZ_BRICK_BUTTON.get());
		output.accept(MissingLinksBlocks.QUARTZ_BRICK_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.QUARTZ_BRICK_LEVER.get());
		output.accept(Blocks.QUARTZ_BLOCK);
		output.accept(Blocks.QUARTZ_STAIRS);
		output.accept(Blocks.QUARTZ_SLAB);
		output.accept(MissingLinksBlocks.QUARTZ_WALL.get());
		output.accept(MissingLinksBlocks.QUARTZ_BUTTON.get());
		output.accept(MissingLinksBlocks.QUARTZ_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.QUARTZ_LEVER.get());
		output.accept(Blocks.SMOOTH_QUARTZ);
		output.accept(Blocks.SMOOTH_QUARTZ_STAIRS);
		output.accept(Blocks.SMOOTH_QUARTZ_SLAB);
		output.accept(MissingLinksBlocks.SMOOTH_QUARTZ_WALL.get());
		output.accept(MissingLinksBlocks.SMOOTH_QUARTZ_BUTTON.get());
		output.accept(MissingLinksBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.SMOOTH_QUARTZ_LEVER.get());
		output.accept(Blocks.SMOOTH_SANDSTONE);
		output.accept(Blocks.SMOOTH_SANDSTONE_STAIRS);
		output.accept(Blocks.SMOOTH_SANDSTONE_SLAB);
		output.accept(MissingLinksBlocks.SMOOTH_SANDSTONE_WALL.get());
		output.accept(Blocks.SMOOTH_RED_SANDSTONE);
		output.accept(Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
		output.accept(Blocks.SMOOTH_RED_SANDSTONE_SLAB);
		output.accept(MissingLinksBlocks.SMOOTH_RED_SANDSTONE_WALL.get());
		output.accept(Blocks.SMOOTH_STONE);
		output.accept(MissingLinksBlocks.SMOOTH_STONE_STAIRS.get());
		output.accept(Blocks.SMOOTH_STONE_SLAB);
		output.accept(MissingLinksBlocks.SMOOTH_STONE_WALL.get());
		output.accept(Blocks.NETHER_BRICKS);
		output.accept(Blocks.NETHER_BRICK_STAIRS);
		output.accept(Blocks.NETHER_BRICK_SLAB);
		output.accept(Blocks.NETHER_BRICK_WALL);
		output.accept(Blocks.NETHER_BRICK_FENCE);
		output.accept(MissingLinksBlocks.NETHER_BRICK_FENCE_GATE.get());
		output.accept(Blocks.RED_NETHER_BRICKS);
		output.accept(Blocks.RED_NETHER_BRICK_SLAB);
		output.accept(Blocks.RED_NETHER_BRICK_STAIRS);
		output.accept(Blocks.RED_NETHER_BRICK_WALL);
		output.accept(MissingLinksBlocks.RED_NETHER_BRICK_FENCE.get());
		output.accept(MissingLinksBlocks.RED_NETHER_BRICK_FENCE_GATE.get());
		output.accept(Blocks.PACKED_MUD);
		output.accept(MissingLinksBlocks.PACKED_MUD_STAIRS.get());
		output.accept(MissingLinksBlocks.PACKED_MUD_SLAB.get());
		output.accept(MissingLinksBlocks.PACKED_MUD_WALL.get());
		output.accept(Blocks.SCULK);
		output.accept(MissingLinksBlocks.SCULK_STAIRS.get());
		output.accept(MissingLinksBlocks.SCULK_SLAB.get());
		output.accept(MissingLinksBlocks.SCULK_WALL.get());
		output.accept(Blocks.CLAY);
		output.accept(MissingLinksBlocks.CLAY_STAIRS.get());
		output.accept(MissingLinksBlocks.CLAY_SLAB.get());
		output.accept(MissingLinksBlocks.CLAY_WALL.get());
		output.accept(Blocks.COAL_BLOCK);
		output.accept(MissingLinksBlocks.COAL_STAIRS.get());
		output.accept(MissingLinksBlocks.COAL_SLAB.get());
		output.accept(MissingLinksBlocks.COAL_WALL.get());
		output.accept(Blocks.IRON_BLOCK);
		output.accept(MissingLinksBlocks.IRON_STAIRS.get());
		output.accept(MissingLinksBlocks.IRON_SLAB.get());
		output.accept(MissingLinksBlocks.IRON_WALL.get());
		output.accept(Blocks.GOLD_BLOCK);
		output.accept(MissingLinksBlocks.GOLD_STAIRS.get());
		output.accept(MissingLinksBlocks.GOLD_SLAB.get());
		output.accept(MissingLinksBlocks.GOLD_WALL.get());
		output.accept(Blocks.REDSTONE_BLOCK);
		output.accept(MissingLinksBlocks.REDSTONE_STAIRS.get());
		output.accept(MissingLinksBlocks.REDSTONE_SLAB.get());
		output.accept(MissingLinksBlocks.REDSTONE_WALL.get());
		output.accept(Blocks.EMERALD_BLOCK);
		output.accept(MissingLinksBlocks.EMERALD_STAIRS.get());
		output.accept(MissingLinksBlocks.EMERALD_SLAB.get());
		output.accept(MissingLinksBlocks.EMERALD_WALL.get());
		output.accept(Blocks.LAPIS_BLOCK);
		output.accept(MissingLinksBlocks.LAPIS_STAIRS.get());
		output.accept(MissingLinksBlocks.LAPIS_SLAB.get());
		output.accept(MissingLinksBlocks.LAPIS_WALL.get());
		output.accept(Blocks.DIAMOND_BLOCK);
		output.accept(MissingLinksBlocks.DIAMOND_STAIRS.get());
		output.accept(MissingLinksBlocks.DIAMOND_SLAB.get());
		output.accept(MissingLinksBlocks.DIAMOND_WALL.get());
		output.accept(Blocks.NETHERITE_BLOCK);
		output.accept(MissingLinksBlocks.NETHERITE_STAIRS.get());
		output.accept(MissingLinksBlocks.NETHERITE_SLAB.get());
		output.accept(MissingLinksBlocks.NETHERITE_WALL.get());
		output.accept(Blocks.WHITE_CONCRETE);
		output.accept(MissingLinksBlocks.WHITE_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.WHITE_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.WHITE_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.WHITE_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.WHITE_CONCRETE_LEVER.get());
		output.accept(Blocks.ORANGE_CONCRETE);
		output.accept(MissingLinksBlocks.ORANGE_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.ORANGE_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.ORANGE_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.ORANGE_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.ORANGE_CONCRETE_LEVER.get());
		output.accept(Blocks.MAGENTA_CONCRETE);
		output.accept(MissingLinksBlocks.MAGENTA_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.MAGENTA_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.MAGENTA_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.MAGENTA_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.MAGENTA_CONCRETE_LEVER.get());
		output.accept(Blocks.LIGHT_BLUE_CONCRETE);
		output.accept(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
		output.accept(Blocks.YELLOW_CONCRETE);
		output.accept(MissingLinksBlocks.YELLOW_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.YELLOW_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.YELLOW_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.YELLOW_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.YELLOW_CONCRETE_LEVER.get());
		output.accept(Blocks.LIME_CONCRETE);
		output.accept(MissingLinksBlocks.LIME_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.LIME_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.LIME_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.LIME_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIME_CONCRETE_LEVER.get());
		output.accept(Blocks.PINK_CONCRETE);
		output.accept(MissingLinksBlocks.PINK_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.PINK_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.PINK_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.PINK_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.PINK_CONCRETE_LEVER.get());
		output.accept(Blocks.GRAY_CONCRETE);
		output.accept(MissingLinksBlocks.GRAY_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.GRAY_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.GRAY_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.GRAY_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.GRAY_CONCRETE_LEVER.get());
		output.accept(Blocks.LIGHT_GRAY_CONCRETE);
		output.accept(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
		output.accept(Blocks.CYAN_CONCRETE);
		output.accept(MissingLinksBlocks.CYAN_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.CYAN_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.CYAN_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.CYAN_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.CYAN_CONCRETE_LEVER.get());
		output.accept(Blocks.PURPLE_CONCRETE);
		output.accept(MissingLinksBlocks.PURPLE_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.PURPLE_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.PURPLE_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.PURPLE_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.PURPLE_CONCRETE_LEVER.get());
		output.accept(Blocks.BLUE_CONCRETE);
		output.accept(MissingLinksBlocks.BLUE_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.BLUE_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.BLUE_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.BLUE_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BLUE_CONCRETE_LEVER.get());
		output.accept(Blocks.BROWN_CONCRETE);
		output.accept(MissingLinksBlocks.BROWN_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.BROWN_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.BROWN_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.BROWN_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BROWN_CONCRETE_LEVER.get());
		output.accept(Blocks.GREEN_CONCRETE);
		output.accept(MissingLinksBlocks.GREEN_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.GREEN_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.GREEN_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.GREEN_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.GREEN_CONCRETE_LEVER.get());
		output.accept(Blocks.RED_CONCRETE);
		output.accept(MissingLinksBlocks.RED_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.RED_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.RED_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.RED_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.RED_CONCRETE_LEVER.get());
		output.accept(Blocks.BLACK_CONCRETE);
		output.accept(MissingLinksBlocks.BLACK_CONCRETE_STAIRS.get());
		output.accept(MissingLinksBlocks.BLACK_CONCRETE_SLAB.get());
		output.accept(MissingLinksBlocks.BLACK_CONCRETE_WALL.get());
		output.accept(MissingLinksBlocks.BLACK_CONCRETE_BUTTON.get());
		output.accept(MissingLinksBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BLACK_CONCRETE_LEVER.get());
		output.accept(Blocks.TERRACOTTA);
		output.accept(MissingLinksBlocks.TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_LEVER.get());
		output.accept(Blocks.WHITE_TERRACOTTA);
		output.accept(MissingLinksBlocks.WHITE_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.WHITE_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.WHITE_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.WHITE_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.WHITE_TERRACOTTA_LEVER.get());
		output.accept(Blocks.ORANGE_TERRACOTTA);
		output.accept(MissingLinksBlocks.ORANGE_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.ORANGE_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.ORANGE_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.ORANGE_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.ORANGE_TERRACOTTA_LEVER.get());
		output.accept(Blocks.MAGENTA_TERRACOTTA);
		output.accept(MissingLinksBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.MAGENTA_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.MAGENTA_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.MAGENTA_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.MAGENTA_TERRACOTTA_LEVER.get());
		output.accept(Blocks.LIGHT_BLUE_TERRACOTTA);
		output.accept(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_LEVER.get());
		output.accept(Blocks.YELLOW_TERRACOTTA);
		output.accept(MissingLinksBlocks.YELLOW_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.YELLOW_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.YELLOW_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.YELLOW_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.YELLOW_TERRACOTTA_LEVER.get());
		output.accept(Blocks.LIME_TERRACOTTA);
		output.accept(MissingLinksBlocks.LIME_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.LIME_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.LIME_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.LIME_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.LIME_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIME_TERRACOTTA_LEVER.get());
		output.accept(Blocks.PINK_TERRACOTTA);
		output.accept(MissingLinksBlocks.PINK_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.PINK_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.PINK_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.PINK_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.PINK_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.PINK_TERRACOTTA_LEVER.get());
		output.accept(Blocks.GRAY_TERRACOTTA);
		output.accept(MissingLinksBlocks.GRAY_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.GRAY_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.GRAY_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.GRAY_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.GRAY_TERRACOTTA_LEVER.get());
		output.accept(Blocks.LIGHT_GRAY_TERRACOTTA);
		output.accept(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_LEVER.get());
		output.accept(Blocks.CYAN_TERRACOTTA);
		output.accept(MissingLinksBlocks.CYAN_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.CYAN_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.CYAN_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.CYAN_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.CYAN_TERRACOTTA_LEVER.get());
		output.accept(Blocks.PURPLE_TERRACOTTA);
		output.accept(MissingLinksBlocks.PURPLE_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.PURPLE_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.PURPLE_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.PURPLE_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.PURPLE_TERRACOTTA_LEVER.get());
		output.accept(Blocks.BLUE_TERRACOTTA);
		output.accept(MissingLinksBlocks.BLUE_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.BLUE_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.BLUE_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.BLUE_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BLUE_TERRACOTTA_LEVER.get());
		output.accept(Blocks.BROWN_TERRACOTTA);
		output.accept(MissingLinksBlocks.BROWN_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.BROWN_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.BROWN_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.BROWN_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BROWN_TERRACOTTA_LEVER.get());
		output.accept(Blocks.GREEN_TERRACOTTA);
		output.accept(MissingLinksBlocks.GREEN_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.GREEN_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.GREEN_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.GREEN_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.GREEN_TERRACOTTA_LEVER.get());
		output.accept(Blocks.RED_TERRACOTTA);
		output.accept(MissingLinksBlocks.RED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.RED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.RED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.RED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.RED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.RED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.BLACK_TERRACOTTA);
		output.accept(MissingLinksBlocks.TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.TERRACOTTA_LEVER.get());
		output.accept(Blocks.WHITE_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.ORANGE_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.MAGENTA_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.YELLOW_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.LIME_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.PINK_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.GRAY_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.CYAN_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.PURPLE_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.BLUE_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.BROWN_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.GREEN_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.RED_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.BLACK_GLAZED_TERRACOTTA);
		output.accept(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get());
		output.accept(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get());
		output.accept(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get());
		output.accept(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON.get());
		output.accept(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
		output.accept(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_LEVER.get());
		output.accept(Blocks.WHITE_WOOL);
		output.accept(MissingLinksBlocks.WHITE_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.WHITE_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.WHITE_WOOL_WALL.get());
		output.accept(Blocks.ORANGE_WOOL);
		output.accept(MissingLinksBlocks.ORANGE_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.ORANGE_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.ORANGE_WOOL_WALL.get());
		output.accept(Blocks.MAGENTA_WOOL);
		output.accept(MissingLinksBlocks.MAGENTA_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.MAGENTA_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.MAGENTA_WOOL_WALL.get());
		output.accept(Blocks.LIGHT_BLUE_WOOL);
		output.accept(MissingLinksBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_BLUE_WOOL_WALL.get());
		output.accept(Blocks.YELLOW_WOOL);
		output.accept(MissingLinksBlocks.YELLOW_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.YELLOW_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.YELLOW_WOOL_WALL.get());
		output.accept(Blocks.LIME_WOOL);
		output.accept(MissingLinksBlocks.LIME_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.LIME_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.LIME_WOOL_WALL.get());
		output.accept(Blocks.PINK_WOOL);
		output.accept(MissingLinksBlocks.PINK_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.PINK_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.PINK_WOOL_WALL.get());
		output.accept(Blocks.GRAY_WOOL);
		output.accept(MissingLinksBlocks.GRAY_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.GRAY_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.GRAY_WOOL_WALL.get());
		output.accept(Blocks.LIGHT_GRAY_WOOL);
		output.accept(MissingLinksBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.LIGHT_GRAY_WOOL_WALL.get());
		output.accept(Blocks.CYAN_WOOL);
		output.accept(MissingLinksBlocks.CYAN_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.CYAN_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.CYAN_WOOL_WALL.get());
		output.accept(Blocks.PURPLE_WOOL);
		output.accept(MissingLinksBlocks.PURPLE_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.PURPLE_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.PURPLE_WOOL_WALL.get());
		output.accept(Blocks.BLUE_WOOL);
		output.accept(MissingLinksBlocks.BLUE_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.BLUE_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.BLUE_WOOL_WALL.get());
		output.accept(Blocks.BROWN_WOOL);
		output.accept(MissingLinksBlocks.BROWN_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.BROWN_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.BROWN_WOOL_WALL.get());
		output.accept(Blocks.GREEN_WOOL);
		output.accept(MissingLinksBlocks.GREEN_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.GREEN_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.GREEN_WOOL_WALL.get());
		output.accept(Blocks.RED_WOOL);
		output.accept(MissingLinksBlocks.RED_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.RED_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.RED_WOOL_WALL.get());
		output.accept(Blocks.BLACK_WOOL);
		output.accept(MissingLinksBlocks.BLACK_WOOL_STAIRS.get());
		output.accept(MissingLinksBlocks.BLACK_WOOL_SLAB.get());
		output.accept(MissingLinksBlocks.BLACK_WOOL_WALL.get());
	}).build());
}
