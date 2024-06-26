package willatendo.missinglinks.data;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import willatendo.missinglinks.server.block.MissingLinksBlocks;

public class MissingLinksBlockStateProvider extends BlockStateProvider {
    public MissingLinksBlockStateProvider(PackOutput packOutput, String modId, ExistingFileHelper existingFileHelper) {
        super(packOutput, modId, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.button(MissingLinksBlocks.ANDESITE_BUTTON.get(), Blocks.ANDESITE);
        this.pressurePlate(MissingLinksBlocks.ANDESITE_PRESSURE_PLATE.get(), Blocks.ANDESITE);
        this.lever(MissingLinksBlocks.ANDESITE_LEVER.get(), Blocks.ANDESITE);
        this.button(MissingLinksBlocks.DIORITE_BUTTON.get(), Blocks.DIORITE);
        this.pressurePlate(MissingLinksBlocks.DIORITE_PRESSURE_PLATE.get(), Blocks.DIORITE);
        this.lever(MissingLinksBlocks.DIORITE_LEVER.get(), Blocks.DIORITE);
        this.button(MissingLinksBlocks.GRANITE_BUTTON.get(), Blocks.GRANITE);
        this.pressurePlate(MissingLinksBlocks.GRANITE_PRESSURE_PLATE.get(), Blocks.GRANITE);
        this.lever(MissingLinksBlocks.GRANITE_LEVER.get(), Blocks.GRANITE);
        this.button(MissingLinksBlocks.COBBLED_DEEPSLATE_BUTTON.get(), Blocks.COBBLED_DEEPSLATE);
        this.pressurePlate(MissingLinksBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE.get(), Blocks.COBBLED_DEEPSLATE);
        this.lever(MissingLinksBlocks.COBBLED_DEEPSLATE_LEVER.get(), Blocks.COBBLED_DEEPSLATE);
        this.stair(MissingLinksBlocks.CALCITE_STAIRS.get(), Blocks.CALCITE);
        this.slab(MissingLinksBlocks.CALCITE_SLAB.get(), Blocks.CALCITE);
        this.wall(MissingLinksBlocks.CALCITE_WALL.get(), Blocks.CALCITE);
        this.button(MissingLinksBlocks.CALCITE_BUTTON.get(), Blocks.CALCITE);
        this.pressurePlate(MissingLinksBlocks.CALCITE_PRESSURE_PLATE.get(), Blocks.CALCITE);
        this.lever(MissingLinksBlocks.CALCITE_LEVER.get(), Blocks.CALCITE);
        this.stair(MissingLinksBlocks.TUFF_STAIRS.get(), Blocks.TUFF);
        this.slab(MissingLinksBlocks.TUFF_SLAB.get(), Blocks.TUFF);
        this.wall(MissingLinksBlocks.TUFF_WALL.get(), Blocks.TUFF);
        this.button(MissingLinksBlocks.TUFF_BUTTON.get(), Blocks.TUFF);
        this.pressurePlate(MissingLinksBlocks.TUFF_PRESSURE_PLATE.get(), Blocks.TUFF);
        this.lever(MissingLinksBlocks.TUFF_LEVER.get(), Blocks.TUFF);
        this.stair(MissingLinksBlocks.DRIPSTONE_STAIRS.get(), Blocks.DRIPSTONE_BLOCK);
        this.slab(MissingLinksBlocks.DRIPSTONE_SLAB.get(), Blocks.DRIPSTONE_BLOCK);
        this.wall(MissingLinksBlocks.DRIPSTONE_WALL.get(), Blocks.DRIPSTONE_BLOCK);
        this.button(MissingLinksBlocks.DRIPSTONE_BUTTON.get(), Blocks.DRIPSTONE_BLOCK);
        this.pressurePlate(MissingLinksBlocks.DRIPSTONE_PRESSURE_PLATE.get(), Blocks.DRIPSTONE_BLOCK);
        this.lever(MissingLinksBlocks.DRIPSTONE_LEVER.get(), Blocks.DRIPSTONE_BLOCK, "dripstone_lever");
        this.stair(MissingLinksBlocks.SMOOTH_BASALT_STAIRS.get(), Blocks.SMOOTH_BASALT);
        this.slab(MissingLinksBlocks.SMOOTH_BASALT_SLAB.get(), Blocks.SMOOTH_BASALT);
        this.wall(MissingLinksBlocks.SMOOTH_BASALT_WALL.get(), Blocks.SMOOTH_BASALT);
        this.button(MissingLinksBlocks.SMOOTH_BASALT_BUTTON.get(), Blocks.SMOOTH_BASALT);
        this.pressurePlate(MissingLinksBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get(), Blocks.SMOOTH_BASALT);
        this.lever(MissingLinksBlocks.SMOOTH_BASALT_LEVER.get(), Blocks.SMOOTH_BASALT);
        this.stair(MissingLinksBlocks.END_STONE_STAIRS.get(), Blocks.END_STONE);
        this.slab(MissingLinksBlocks.END_STONE_SLAB.get(), Blocks.END_STONE);
        this.wall(MissingLinksBlocks.END_STONE_WALL.get(), Blocks.END_STONE);
        this.button(MissingLinksBlocks.END_STONE_BUTTON.get(), Blocks.END_STONE);
        this.pressurePlate(MissingLinksBlocks.END_STONE_PRESSURE_PLATE.get(), Blocks.END_STONE);
        this.lever(MissingLinksBlocks.END_STONE_LEVER.get(), Blocks.END_STONE);
        this.stair(MissingLinksBlocks.OBSIDIAN_STAIRS.get(), Blocks.OBSIDIAN);
        this.slab(MissingLinksBlocks.OBSIDIAN_SLAB.get(), Blocks.OBSIDIAN);
        this.wall(MissingLinksBlocks.OBSIDIAN_WALL.get(), Blocks.OBSIDIAN);
        this.button(MissingLinksBlocks.OBSIDIAN_BUTTON.get(), Blocks.OBSIDIAN);
        this.pressurePlate(MissingLinksBlocks.OBSIDIAN_PRESSURE_PLATE.get(), Blocks.OBSIDIAN);
        this.lever(MissingLinksBlocks.OBSIDIAN_LEVER.get(), Blocks.OBSIDIAN);
        this.stair(MissingLinksBlocks.CRYING_OBSIDIAN_STAIRS.get(), Blocks.CRYING_OBSIDIAN);
        this.slab(MissingLinksBlocks.CRYING_OBSIDIAN_SLAB.get(), Blocks.CRYING_OBSIDIAN);
        this.wall(MissingLinksBlocks.CRYING_OBSIDIAN_WALL.get(), Blocks.CRYING_OBSIDIAN);
        this.button(MissingLinksBlocks.CRYING_OBSIDIAN_BUTTON.get(), Blocks.CRYING_OBSIDIAN);
        this.pressurePlate(MissingLinksBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get(), Blocks.CRYING_OBSIDIAN);
        this.lever(MissingLinksBlocks.CRYING_OBSIDIAN_LEVER.get(), Blocks.CRYING_OBSIDIAN);
        this.stair(MissingLinksBlocks.QUARTZ_BRICK_STAIRS.get(), Blocks.QUARTZ_BRICKS);
        this.slab(MissingLinksBlocks.QUARTZ_BRICK_SLAB.get(), Blocks.QUARTZ_BRICKS);
        this.wall(MissingLinksBlocks.QUARTZ_BRICK_WALL.get(), Blocks.QUARTZ_BRICKS);
        this.button(MissingLinksBlocks.QUARTZ_BRICK_BUTTON.get(), Blocks.QUARTZ_BRICKS);
        this.pressurePlate(MissingLinksBlocks.QUARTZ_BRICK_PRESSURE_PLATE.get(), Blocks.QUARTZ_BRICKS);
        this.lever(MissingLinksBlocks.QUARTZ_BRICK_LEVER.get(), Blocks.QUARTZ_BRICKS, "quartz_brick_lever");
        this.stair(MissingLinksBlocks.TERRACOTTA_STAIRS.get(), Blocks.TERRACOTTA);
        this.slab(MissingLinksBlocks.TERRACOTTA_SLAB.get(), Blocks.TERRACOTTA);
        this.wall(MissingLinksBlocks.TERRACOTTA_WALL.get(), Blocks.TERRACOTTA);
        this.button(MissingLinksBlocks.TERRACOTTA_BUTTON.get(), Blocks.TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.TERRACOTTA_PRESSURE_PLATE.get(), Blocks.TERRACOTTA);
        this.lever(MissingLinksBlocks.TERRACOTTA_LEVER.get(), Blocks.TERRACOTTA);
        this.stair(MissingLinksBlocks.WHITE_TERRACOTTA_STAIRS.get(), Blocks.WHITE_TERRACOTTA);
        this.slab(MissingLinksBlocks.WHITE_TERRACOTTA_SLAB.get(), Blocks.WHITE_TERRACOTTA);
        this.wall(MissingLinksBlocks.WHITE_TERRACOTTA_WALL.get(), Blocks.WHITE_TERRACOTTA);
        this.button(MissingLinksBlocks.WHITE_TERRACOTTA_BUTTON.get(), Blocks.WHITE_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.WHITE_TERRACOTTA);
        this.lever(MissingLinksBlocks.WHITE_TERRACOTTA_LEVER.get(), Blocks.WHITE_TERRACOTTA);
        this.stair(MissingLinksBlocks.ORANGE_TERRACOTTA_STAIRS.get(), Blocks.ORANGE_TERRACOTTA);
        this.slab(MissingLinksBlocks.ORANGE_TERRACOTTA_SLAB.get(), Blocks.ORANGE_TERRACOTTA);
        this.wall(MissingLinksBlocks.ORANGE_TERRACOTTA_WALL.get(), Blocks.ORANGE_TERRACOTTA);
        this.button(MissingLinksBlocks.ORANGE_TERRACOTTA_BUTTON.get(), Blocks.ORANGE_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.ORANGE_TERRACOTTA);
        this.lever(MissingLinksBlocks.ORANGE_TERRACOTTA_LEVER.get(), Blocks.ORANGE_TERRACOTTA);
        this.stair(MissingLinksBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), Blocks.MAGENTA_TERRACOTTA);
        this.slab(MissingLinksBlocks.MAGENTA_TERRACOTTA_SLAB.get(), Blocks.MAGENTA_TERRACOTTA);
        this.wall(MissingLinksBlocks.MAGENTA_TERRACOTTA_WALL.get(), Blocks.MAGENTA_TERRACOTTA);
        this.button(MissingLinksBlocks.MAGENTA_TERRACOTTA_BUTTON.get(), Blocks.MAGENTA_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.MAGENTA_TERRACOTTA);
        this.lever(MissingLinksBlocks.MAGENTA_TERRACOTTA_LEVER.get(), Blocks.MAGENTA_TERRACOTTA);
        this.stair(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        this.slab(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        this.wall(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        this.button(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        this.lever(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_LEVER.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        this.stair(MissingLinksBlocks.YELLOW_TERRACOTTA_STAIRS.get(), Blocks.YELLOW_TERRACOTTA);
        this.slab(MissingLinksBlocks.YELLOW_TERRACOTTA_SLAB.get(), Blocks.YELLOW_TERRACOTTA);
        this.wall(MissingLinksBlocks.YELLOW_TERRACOTTA_WALL.get(), Blocks.YELLOW_TERRACOTTA);
        this.button(MissingLinksBlocks.YELLOW_TERRACOTTA_BUTTON.get(), Blocks.YELLOW_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.YELLOW_TERRACOTTA);
        this.lever(MissingLinksBlocks.YELLOW_TERRACOTTA_LEVER.get(), Blocks.YELLOW_TERRACOTTA);
        this.stair(MissingLinksBlocks.LIME_TERRACOTTA_STAIRS.get(), Blocks.LIME_TERRACOTTA);
        this.slab(MissingLinksBlocks.LIME_TERRACOTTA_SLAB.get(), Blocks.LIME_TERRACOTTA);
        this.wall(MissingLinksBlocks.LIME_TERRACOTTA_WALL.get(), Blocks.LIME_TERRACOTTA);
        this.button(MissingLinksBlocks.LIME_TERRACOTTA_BUTTON.get(), Blocks.LIME_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.LIME_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIME_TERRACOTTA);
        this.lever(MissingLinksBlocks.LIME_TERRACOTTA_LEVER.get(), Blocks.LIME_TERRACOTTA);
        this.stair(MissingLinksBlocks.PINK_TERRACOTTA_STAIRS.get(), Blocks.PINK_TERRACOTTA);
        this.slab(MissingLinksBlocks.PINK_TERRACOTTA_SLAB.get(), Blocks.PINK_TERRACOTTA);
        this.wall(MissingLinksBlocks.PINK_TERRACOTTA_WALL.get(), Blocks.PINK_TERRACOTTA);
        this.button(MissingLinksBlocks.PINK_TERRACOTTA_BUTTON.get(), Blocks.PINK_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.PINK_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.PINK_TERRACOTTA);
        this.lever(MissingLinksBlocks.PINK_TERRACOTTA_LEVER.get(), Blocks.PINK_TERRACOTTA);
        this.stair(MissingLinksBlocks.GRAY_TERRACOTTA_STAIRS.get(), Blocks.GRAY_TERRACOTTA);
        this.slab(MissingLinksBlocks.GRAY_TERRACOTTA_SLAB.get(), Blocks.GRAY_TERRACOTTA);
        this.wall(MissingLinksBlocks.GRAY_TERRACOTTA_WALL.get(), Blocks.GRAY_TERRACOTTA);
        this.button(MissingLinksBlocks.GRAY_TERRACOTTA_BUTTON.get(), Blocks.GRAY_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.GRAY_TERRACOTTA);
        this.lever(MissingLinksBlocks.GRAY_TERRACOTTA_LEVER.get(), Blocks.GRAY_TERRACOTTA);
        this.stair(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        this.slab(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        this.wall(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        this.button(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        this.lever(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_LEVER.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        this.stair(MissingLinksBlocks.CYAN_TERRACOTTA_STAIRS.get(), Blocks.CYAN_TERRACOTTA);
        this.slab(MissingLinksBlocks.CYAN_TERRACOTTA_SLAB.get(), Blocks.CYAN_TERRACOTTA);
        this.wall(MissingLinksBlocks.CYAN_TERRACOTTA_WALL.get(), Blocks.CYAN_TERRACOTTA);
        this.button(MissingLinksBlocks.CYAN_TERRACOTTA_BUTTON.get(), Blocks.CYAN_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.CYAN_TERRACOTTA);
        this.lever(MissingLinksBlocks.CYAN_TERRACOTTA_LEVER.get(), Blocks.CYAN_TERRACOTTA);
        this.stair(MissingLinksBlocks.PURPLE_TERRACOTTA_STAIRS.get(), Blocks.PURPLE_TERRACOTTA);
        this.slab(MissingLinksBlocks.PURPLE_TERRACOTTA_SLAB.get(), Blocks.PURPLE_TERRACOTTA);
        this.wall(MissingLinksBlocks.PURPLE_TERRACOTTA_WALL.get(), Blocks.PURPLE_TERRACOTTA);
        this.button(MissingLinksBlocks.PURPLE_TERRACOTTA_BUTTON.get(), Blocks.PURPLE_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.PURPLE_TERRACOTTA);
        this.lever(MissingLinksBlocks.PURPLE_TERRACOTTA_LEVER.get(), Blocks.PURPLE_TERRACOTTA);
        this.stair(MissingLinksBlocks.BLUE_TERRACOTTA_STAIRS.get(), Blocks.BLUE_TERRACOTTA);
        this.slab(MissingLinksBlocks.BLUE_TERRACOTTA_SLAB.get(), Blocks.BLUE_TERRACOTTA);
        this.wall(MissingLinksBlocks.BLUE_TERRACOTTA_WALL.get(), Blocks.BLUE_TERRACOTTA);
        this.button(MissingLinksBlocks.BLUE_TERRACOTTA_BUTTON.get(), Blocks.BLUE_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BLUE_TERRACOTTA);
        this.lever(MissingLinksBlocks.BLUE_TERRACOTTA_LEVER.get(), Blocks.BLUE_TERRACOTTA);
        this.stair(MissingLinksBlocks.BROWN_TERRACOTTA_STAIRS.get(), Blocks.BROWN_TERRACOTTA);
        this.slab(MissingLinksBlocks.BROWN_TERRACOTTA_SLAB.get(), Blocks.BROWN_TERRACOTTA);
        this.wall(MissingLinksBlocks.BROWN_TERRACOTTA_WALL.get(), Blocks.BROWN_TERRACOTTA);
        this.button(MissingLinksBlocks.BROWN_TERRACOTTA_BUTTON.get(), Blocks.BROWN_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BROWN_TERRACOTTA);
        this.lever(MissingLinksBlocks.BROWN_TERRACOTTA_LEVER.get(), Blocks.BROWN_TERRACOTTA);
        this.stair(MissingLinksBlocks.GREEN_TERRACOTTA_STAIRS.get(), Blocks.GREEN_TERRACOTTA);
        this.slab(MissingLinksBlocks.GREEN_TERRACOTTA_SLAB.get(), Blocks.GREEN_TERRACOTTA);
        this.wall(MissingLinksBlocks.GREEN_TERRACOTTA_WALL.get(), Blocks.GREEN_TERRACOTTA);
        this.button(MissingLinksBlocks.GREEN_TERRACOTTA_BUTTON.get(), Blocks.GREEN_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.GREEN_TERRACOTTA);
        this.lever(MissingLinksBlocks.GREEN_TERRACOTTA_LEVER.get(), Blocks.GREEN_TERRACOTTA);
        this.stair(MissingLinksBlocks.RED_TERRACOTTA_STAIRS.get(), Blocks.RED_TERRACOTTA);
        this.slab(MissingLinksBlocks.RED_TERRACOTTA_SLAB.get(), Blocks.RED_TERRACOTTA);
        this.wall(MissingLinksBlocks.RED_TERRACOTTA_WALL.get(), Blocks.RED_TERRACOTTA);
        this.button(MissingLinksBlocks.RED_TERRACOTTA_BUTTON.get(), Blocks.RED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.RED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.RED_TERRACOTTA);
        this.lever(MissingLinksBlocks.RED_TERRACOTTA_LEVER.get(), Blocks.RED_TERRACOTTA);
        this.stair(MissingLinksBlocks.BLACK_TERRACOTTA_STAIRS.get(), Blocks.BLACK_TERRACOTTA);
        this.slab(MissingLinksBlocks.BLACK_TERRACOTTA_SLAB.get(), Blocks.BLACK_TERRACOTTA);
        this.wall(MissingLinksBlocks.BLACK_TERRACOTTA_WALL.get(), Blocks.BLACK_TERRACOTTA);
        this.button(MissingLinksBlocks.BLACK_TERRACOTTA_BUTTON.get(), Blocks.BLACK_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BLACK_TERRACOTTA);
        this.lever(MissingLinksBlocks.BLACK_TERRACOTTA_LEVER.get(), Blocks.BLACK_TERRACOTTA);
        this.stair(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.WHITE_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.WHITE_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), Blocks.WHITE_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.WHITE_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.WHITE_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_LEVER.get(), Blocks.WHITE_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.ORANGE_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.ORANGE_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), Blocks.ORANGE_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.ORANGE_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.ORANGE_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_LEVER.get(), Blocks.ORANGE_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_LEVER.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_LEVER.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.YELLOW_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), Blocks.YELLOW_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), Blocks.YELLOW_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.YELLOW_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.YELLOW_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_LEVER.get(), Blocks.YELLOW_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.LIME_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), Blocks.LIME_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIME_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.LIME_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIME_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_LEVER.get(), Blocks.LIME_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.PINK_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), Blocks.PINK_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), Blocks.PINK_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.PINK_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.PINK_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_LEVER.get(), Blocks.PINK_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GRAY_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GRAY_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.GRAY_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.GRAY_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.GRAY_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_LEVER.get(), Blocks.GRAY_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_LEVER.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.CYAN_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), Blocks.CYAN_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), Blocks.CYAN_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.CYAN_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.CYAN_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_LEVER.get(), Blocks.CYAN_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.PURPLE_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.PURPLE_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), Blocks.PURPLE_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.PURPLE_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.PURPLE_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_LEVER.get(), Blocks.PURPLE_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.BLUE_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.BLUE_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLUE_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.BLUE_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BLUE_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_LEVER.get(), Blocks.BLUE_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.BROWN_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), Blocks.BROWN_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), Blocks.BROWN_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.BROWN_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BROWN_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_LEVER.get(), Blocks.BROWN_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GREEN_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GREEN_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), Blocks.GREEN_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.GREEN_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.GREEN_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_LEVER.get(), Blocks.GREEN_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.RED_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), Blocks.RED_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), Blocks.RED_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.RED_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.RED_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_LEVER.get(), Blocks.RED_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.BLACK_GLAZED_TERRACOTTA);
        this.slab(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), Blocks.BLACK_GLAZED_TERRACOTTA);
        this.wall(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLACK_GLAZED_TERRACOTTA);
        this.button(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON.get(), Blocks.BLACK_GLAZED_TERRACOTTA);
        this.pressurePlate(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BLACK_GLAZED_TERRACOTTA);
        this.lever(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_LEVER.get(), Blocks.BLACK_GLAZED_TERRACOTTA);
        this.stair(MissingLinksBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.WHITE_CONCRETE);
        this.slab(MissingLinksBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        this.wall(MissingLinksBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE);
        this.button(MissingLinksBlocks.WHITE_CONCRETE_BUTTON.get(), Blocks.WHITE_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), Blocks.WHITE_CONCRETE);
        this.lever(MissingLinksBlocks.WHITE_CONCRETE_LEVER.get(), Blocks.WHITE_CONCRETE);
        this.stair(MissingLinksBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.ORANGE_CONCRETE);
        this.slab(MissingLinksBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        this.wall(MissingLinksBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE);
        this.button(MissingLinksBlocks.ORANGE_CONCRETE_BUTTON.get(), Blocks.ORANGE_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), Blocks.ORANGE_CONCRETE);
        this.lever(MissingLinksBlocks.ORANGE_CONCRETE_LEVER.get(), Blocks.ORANGE_CONCRETE);
        this.stair(MissingLinksBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.MAGENTA_CONCRETE);
        this.slab(MissingLinksBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        this.wall(MissingLinksBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE);
        this.button(MissingLinksBlocks.MAGENTA_CONCRETE_BUTTON.get(), Blocks.MAGENTA_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), Blocks.MAGENTA_CONCRETE);
        this.lever(MissingLinksBlocks.MAGENTA_CONCRETE_LEVER.get(), Blocks.MAGENTA_CONCRETE);
        this.stair(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.LIGHT_BLUE_CONCRETE);
        this.slab(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        this.wall(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE);
        this.button(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), Blocks.LIGHT_BLUE_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        this.lever(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), Blocks.LIGHT_BLUE_CONCRETE);
        this.stair(MissingLinksBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.YELLOW_CONCRETE);
        this.slab(MissingLinksBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        this.wall(MissingLinksBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE);
        this.button(MissingLinksBlocks.YELLOW_CONCRETE_BUTTON.get(), Blocks.YELLOW_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), Blocks.YELLOW_CONCRETE);
        this.lever(MissingLinksBlocks.YELLOW_CONCRETE_LEVER.get(), Blocks.YELLOW_CONCRETE);
        this.stair(MissingLinksBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.LIME_CONCRETE);
        this.slab(MissingLinksBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        this.wall(MissingLinksBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE);
        this.button(MissingLinksBlocks.LIME_CONCRETE_BUTTON.get(), Blocks.LIME_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIME_CONCRETE);
        this.lever(MissingLinksBlocks.LIME_CONCRETE_LEVER.get(), Blocks.LIME_CONCRETE);
        this.stair(MissingLinksBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.PINK_CONCRETE);
        this.slab(MissingLinksBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);
        this.wall(MissingLinksBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE);
        this.button(MissingLinksBlocks.PINK_CONCRETE_BUTTON.get(), Blocks.PINK_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), Blocks.PINK_CONCRETE);
        this.lever(MissingLinksBlocks.PINK_CONCRETE_LEVER.get(), Blocks.PINK_CONCRETE);
        this.stair(MissingLinksBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.GRAY_CONCRETE);
        this.slab(MissingLinksBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        this.wall(MissingLinksBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE);
        this.button(MissingLinksBlocks.GRAY_CONCRETE_BUTTON.get(), Blocks.GRAY_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.GRAY_CONCRETE);
        this.lever(MissingLinksBlocks.GRAY_CONCRETE_LEVER.get(), Blocks.GRAY_CONCRETE);
        this.stair(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.LIGHT_GRAY_CONCRETE);
        this.slab(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        this.wall(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE);
        this.button(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), Blocks.LIGHT_GRAY_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        this.lever(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), Blocks.LIGHT_GRAY_CONCRETE);
        this.stair(MissingLinksBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CYAN_CONCRETE);
        this.slab(MissingLinksBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        this.wall(MissingLinksBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE);
        this.button(MissingLinksBlocks.CYAN_CONCRETE_BUTTON.get(), Blocks.CYAN_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), Blocks.CYAN_CONCRETE);
        this.lever(MissingLinksBlocks.CYAN_CONCRETE_LEVER.get(), Blocks.CYAN_CONCRETE);
        this.stair(MissingLinksBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.PURPLE_CONCRETE);
        this.slab(MissingLinksBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        this.wall(MissingLinksBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE);
        this.button(MissingLinksBlocks.PURPLE_CONCRETE_BUTTON.get(), Blocks.PURPLE_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), Blocks.PURPLE_CONCRETE);
        this.lever(MissingLinksBlocks.PURPLE_CONCRETE_LEVER.get(), Blocks.PURPLE_CONCRETE);
        this.stair(MissingLinksBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.BLUE_CONCRETE);
        this.slab(MissingLinksBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        this.wall(MissingLinksBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE);
        this.button(MissingLinksBlocks.BLUE_CONCRETE_BUTTON.get(), Blocks.BLUE_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLUE_CONCRETE);
        this.lever(MissingLinksBlocks.BLUE_CONCRETE_LEVER.get(), Blocks.BLUE_CONCRETE);
        this.stair(MissingLinksBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.BROWN_CONCRETE);
        this.slab(MissingLinksBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        this.wall(MissingLinksBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE);
        this.button(MissingLinksBlocks.BROWN_CONCRETE_BUTTON.get(), Blocks.BROWN_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), Blocks.BROWN_CONCRETE);
        this.lever(MissingLinksBlocks.BROWN_CONCRETE_LEVER.get(), Blocks.BROWN_CONCRETE);
        this.stair(MissingLinksBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.GREEN_CONCRETE);
        this.slab(MissingLinksBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        this.wall(MissingLinksBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE);
        this.button(MissingLinksBlocks.GREEN_CONCRETE_BUTTON.get(), Blocks.GREEN_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), Blocks.GREEN_CONCRETE);
        this.lever(MissingLinksBlocks.GREEN_CONCRETE_LEVER.get(), Blocks.GREEN_CONCRETE);
        this.stair(MissingLinksBlocks.RED_CONCRETE_STAIRS.get(), Blocks.RED_CONCRETE);
        this.slab(MissingLinksBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        this.wall(MissingLinksBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE);
        this.button(MissingLinksBlocks.RED_CONCRETE_BUTTON.get(), Blocks.RED_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), Blocks.RED_CONCRETE);
        this.lever(MissingLinksBlocks.RED_CONCRETE_LEVER.get(), Blocks.RED_CONCRETE);
        this.stair(MissingLinksBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.BLACK_CONCRETE);
        this.slab(MissingLinksBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);
        this.wall(MissingLinksBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE);
        this.button(MissingLinksBlocks.BLACK_CONCRETE_BUTTON.get(), Blocks.BLACK_CONCRETE);
        this.pressurePlate(MissingLinksBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLACK_CONCRETE);
        this.lever(MissingLinksBlocks.BLACK_CONCRETE_LEVER.get(), Blocks.BLACK_CONCRETE);
        this.stair(MissingLinksBlocks.WHITE_WOOL_STAIRS.get(), Blocks.WHITE_WOOL);
        this.slab(MissingLinksBlocks.WHITE_WOOL_SLAB.get(), Blocks.WHITE_WOOL);
        this.wall(MissingLinksBlocks.WHITE_WOOL_WALL.get(), Blocks.WHITE_WOOL);
        this.stair(MissingLinksBlocks.ORANGE_WOOL_STAIRS.get(), Blocks.ORANGE_WOOL);
        this.slab(MissingLinksBlocks.ORANGE_WOOL_SLAB.get(), Blocks.ORANGE_WOOL);
        this.wall(MissingLinksBlocks.ORANGE_WOOL_WALL.get(), Blocks.ORANGE_WOOL);
        this.stair(MissingLinksBlocks.MAGENTA_WOOL_STAIRS.get(), Blocks.MAGENTA_WOOL);
        this.slab(MissingLinksBlocks.MAGENTA_WOOL_SLAB.get(), Blocks.MAGENTA_WOOL);
        this.wall(MissingLinksBlocks.MAGENTA_WOOL_WALL.get(), Blocks.MAGENTA_WOOL);
        this.stair(MissingLinksBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), Blocks.LIGHT_BLUE_WOOL);
        this.slab(MissingLinksBlocks.LIGHT_BLUE_WOOL_SLAB.get(), Blocks.LIGHT_BLUE_WOOL);
        this.wall(MissingLinksBlocks.LIGHT_BLUE_WOOL_WALL.get(), Blocks.LIGHT_BLUE_WOOL);
        this.stair(MissingLinksBlocks.YELLOW_WOOL_STAIRS.get(), Blocks.YELLOW_WOOL);
        this.slab(MissingLinksBlocks.YELLOW_WOOL_SLAB.get(), Blocks.YELLOW_WOOL);
        this.wall(MissingLinksBlocks.YELLOW_WOOL_WALL.get(), Blocks.YELLOW_WOOL);
        this.stair(MissingLinksBlocks.LIME_WOOL_STAIRS.get(), Blocks.LIME_WOOL);
        this.slab(MissingLinksBlocks.LIME_WOOL_SLAB.get(), Blocks.LIME_WOOL);
        this.wall(MissingLinksBlocks.LIME_WOOL_WALL.get(), Blocks.LIME_WOOL);
        this.stair(MissingLinksBlocks.PINK_WOOL_STAIRS.get(), Blocks.PINK_WOOL);
        this.slab(MissingLinksBlocks.PINK_WOOL_SLAB.get(), Blocks.PINK_WOOL);
        this.wall(MissingLinksBlocks.PINK_WOOL_WALL.get(), Blocks.PINK_WOOL);
        this.stair(MissingLinksBlocks.GRAY_WOOL_STAIRS.get(), Blocks.GRAY_WOOL);
        this.slab(MissingLinksBlocks.GRAY_WOOL_SLAB.get(), Blocks.GRAY_WOOL);
        this.wall(MissingLinksBlocks.GRAY_WOOL_WALL.get(), Blocks.GRAY_WOOL);
        this.stair(MissingLinksBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), Blocks.LIGHT_GRAY_WOOL);
        this.slab(MissingLinksBlocks.LIGHT_GRAY_WOOL_SLAB.get(), Blocks.LIGHT_GRAY_WOOL);
        this.wall(MissingLinksBlocks.LIGHT_GRAY_WOOL_WALL.get(), Blocks.LIGHT_GRAY_WOOL);
        this.stair(MissingLinksBlocks.CYAN_WOOL_STAIRS.get(), Blocks.CYAN_WOOL);
        this.slab(MissingLinksBlocks.CYAN_WOOL_SLAB.get(), Blocks.CYAN_WOOL);
        this.wall(MissingLinksBlocks.CYAN_WOOL_WALL.get(), Blocks.CYAN_WOOL);
        this.stair(MissingLinksBlocks.PURPLE_WOOL_STAIRS.get(), Blocks.PURPLE_WOOL);
        this.slab(MissingLinksBlocks.PURPLE_WOOL_SLAB.get(), Blocks.PURPLE_WOOL);
        this.wall(MissingLinksBlocks.PURPLE_WOOL_WALL.get(), Blocks.PURPLE_WOOL);
        this.stair(MissingLinksBlocks.BLUE_WOOL_STAIRS.get(), Blocks.BLUE_WOOL);
        this.slab(MissingLinksBlocks.BLUE_WOOL_SLAB.get(), Blocks.BLUE_WOOL);
        this.wall(MissingLinksBlocks.BLUE_WOOL_WALL.get(), Blocks.BLUE_WOOL);
        this.stair(MissingLinksBlocks.BROWN_WOOL_STAIRS.get(), Blocks.BROWN_WOOL);
        this.slab(MissingLinksBlocks.BROWN_WOOL_SLAB.get(), Blocks.BROWN_WOOL);
        this.wall(MissingLinksBlocks.BROWN_WOOL_WALL.get(), Blocks.BROWN_WOOL);
        this.stair(MissingLinksBlocks.GREEN_WOOL_STAIRS.get(), Blocks.GREEN_WOOL);
        this.slab(MissingLinksBlocks.GREEN_WOOL_SLAB.get(), Blocks.GREEN_WOOL);
        this.wall(MissingLinksBlocks.GREEN_WOOL_WALL.get(), Blocks.GREEN_WOOL);
        this.stair(MissingLinksBlocks.RED_WOOL_STAIRS.get(), Blocks.RED_WOOL);
        this.slab(MissingLinksBlocks.RED_WOOL_SLAB.get(), Blocks.RED_WOOL);
        this.wall(MissingLinksBlocks.RED_WOOL_WALL.get(), Blocks.RED_WOOL);
        this.stair(MissingLinksBlocks.BLACK_WOOL_STAIRS.get(), Blocks.BLACK_WOOL);
        this.slab(MissingLinksBlocks.BLACK_WOOL_SLAB.get(), Blocks.BLACK_WOOL);
        this.wall(MissingLinksBlocks.BLACK_WOOL_WALL.get(), Blocks.BLACK_WOOL);
        this.stair(MissingLinksBlocks.CLAY_STAIRS.get(), Blocks.CLAY);
        this.slab(MissingLinksBlocks.CLAY_SLAB.get(), Blocks.CLAY);
        this.wall(MissingLinksBlocks.CLAY_WALL.get(), Blocks.CLAY);
        this.stair(MissingLinksBlocks.PACKED_MUD_STAIRS.get(), Blocks.PACKED_MUD);
        this.slab(MissingLinksBlocks.PACKED_MUD_SLAB.get(), Blocks.PACKED_MUD);
        this.wall(MissingLinksBlocks.PACKED_MUD_WALL.get(), Blocks.PACKED_MUD);
        this.stair(MissingLinksBlocks.SCULK_STAIRS.get(), Blocks.SCULK);
        this.slab(MissingLinksBlocks.SCULK_SLAB.get(), Blocks.SCULK);
        this.wall(MissingLinksBlocks.SCULK_WALL.get(), Blocks.SCULK);
        this.stair(MissingLinksBlocks.COAL_STAIRS.get(), Blocks.COAL_BLOCK);
        this.slab(MissingLinksBlocks.COAL_SLAB.get(), Blocks.COAL_BLOCK);
        this.wall(MissingLinksBlocks.COAL_WALL.get(), Blocks.COAL_BLOCK);
        this.stair(MissingLinksBlocks.IRON_STAIRS.get(), Blocks.IRON_BLOCK);
        this.slab(MissingLinksBlocks.IRON_SLAB.get(), Blocks.IRON_BLOCK);
        this.wall(MissingLinksBlocks.IRON_WALL.get(), Blocks.IRON_BLOCK);
        this.stair(MissingLinksBlocks.GOLD_STAIRS.get(), Blocks.GOLD_BLOCK);
        this.slab(MissingLinksBlocks.GOLD_SLAB.get(), Blocks.GOLD_BLOCK);
        this.wall(MissingLinksBlocks.GOLD_WALL.get(), Blocks.GOLD_BLOCK);
        this.stair(MissingLinksBlocks.REDSTONE_STAIRS.get(), Blocks.REDSTONE_BLOCK);
        this.slab(MissingLinksBlocks.REDSTONE_SLAB.get(), Blocks.REDSTONE_BLOCK);
        this.wall(MissingLinksBlocks.REDSTONE_WALL.get(), Blocks.REDSTONE_BLOCK);
        this.stair(MissingLinksBlocks.EMERALD_STAIRS.get(), Blocks.EMERALD_BLOCK);
        this.slab(MissingLinksBlocks.EMERALD_SLAB.get(), Blocks.EMERALD_BLOCK);
        this.wall(MissingLinksBlocks.EMERALD_WALL.get(), Blocks.EMERALD_BLOCK);
        this.stair(MissingLinksBlocks.LAPIS_STAIRS.get(), Blocks.LAPIS_BLOCK);
        this.slab(MissingLinksBlocks.LAPIS_SLAB.get(), Blocks.LAPIS_BLOCK);
        this.wall(MissingLinksBlocks.LAPIS_WALL.get(), Blocks.LAPIS_BLOCK);
        this.stair(MissingLinksBlocks.DIAMOND_STAIRS.get(), Blocks.DIAMOND_BLOCK);
        this.slab(MissingLinksBlocks.DIAMOND_SLAB.get(), Blocks.DIAMOND_BLOCK);
        this.wall(MissingLinksBlocks.DIAMOND_WALL.get(), Blocks.DIAMOND_BLOCK);
        this.stair(MissingLinksBlocks.NETHERITE_STAIRS.get(), Blocks.NETHERITE_BLOCK);
        this.slab(MissingLinksBlocks.NETHERITE_SLAB.get(), Blocks.NETHERITE_BLOCK);
        this.wall(MissingLinksBlocks.NETHERITE_WALL.get(), Blocks.NETHERITE_BLOCK);
        this.wall(MissingLinksBlocks.QUARTZ_WALL.get(), "quartz_block_side");
        this.button(MissingLinksBlocks.QUARTZ_BUTTON.get(), "quartz_block_side");
        this.pressurePlate(MissingLinksBlocks.QUARTZ_PRESSURE_PLATE.get(), "quartz_block_side");
        this.lever(MissingLinksBlocks.QUARTZ_LEVER.get(), "quartz_block_side", "quartz_lever");
        this.wall(MissingLinksBlocks.SMOOTH_QUARTZ_WALL.get(), "quartz_block_bottom");
        this.button(MissingLinksBlocks.SMOOTH_QUARTZ_BUTTON.get(), "quartz_block_bottom");
        this.pressurePlate(MissingLinksBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.get(), "quartz_block_bottom");
        this.lever(MissingLinksBlocks.SMOOTH_QUARTZ_LEVER.get(), "quartz_block_bottom", "smooth_quartz_lever");
        this.wall(MissingLinksBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), "red_sandstone_top");
        this.wall(MissingLinksBlocks.SMOOTH_SANDSTONE_WALL.get(), "sandstone_top");
        this.stair(MissingLinksBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE);
        this.wall(MissingLinksBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE);
        this.fence(MissingLinksBlocks.RED_NETHER_BRICK_FENCE.get(), Blocks.RED_NETHER_BRICKS);
        this.fenceGate(MissingLinksBlocks.RED_NETHER_BRICK_FENCE_GATE.get(), Blocks.RED_NETHER_BRICKS);
        this.fenceGate(MissingLinksBlocks.NETHER_BRICK_FENCE_GATE.get(), Blocks.NETHER_BRICKS);
    }

    public void stair(StairBlock stairBlock, Block stone) {
        this.stairsBlock(stairBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
    }

    public void slab(SlabBlock slabBlock, Block stone) {
        if (BuiltInRegistries.BLOCK.getKey(stone).getPath().contains("quartz_block")) {
            this.slabBlock(slabBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()), this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath() + "_bottom"));
        } else {
            this.slabBlock(slabBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()), this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
        }
    }

    public void wall(WallBlock wallBlock, Block stone) {
        this.wallBlock(wallBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
        this.itemModels().withExistingParent("block/" + BuiltInRegistries.BLOCK.getKey(wallBlock).getPath() + "_inventory", this.mcLoc("block/wall_inventory")).texture("wall", this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
    }

    public void wall(WallBlock wallBlock, String stone) {
        this.wallBlock(wallBlock, this.mcLoc("block/" + stone));
        this.itemModels().withExistingParent("block/" + BuiltInRegistries.BLOCK.getKey(wallBlock).getPath() + "_inventory", this.mcLoc("block/wall_inventory")).texture("wall", this.mcLoc("block/" + stone));
    }

    public void button(ButtonBlock buttonBlock, Block stone) {
        this.buttonBlock(buttonBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
        this.itemModels().withExistingParent("block/" + BuiltInRegistries.BLOCK.getKey(buttonBlock).getPath() + "_inventory", this.mcLoc("block/button_inventory")).texture("texture", this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
    }

    public void button(ButtonBlock buttonBlock, String stone) {
        this.buttonBlock(buttonBlock, this.mcLoc("block/" + stone));
        this.itemModels().withExistingParent("block/" + BuiltInRegistries.BLOCK.getKey(buttonBlock).getPath() + "_inventory", this.mcLoc("block/button_inventory")).texture("texture", this.mcLoc("block/" + stone));
    }

    public void pressurePlate(PressurePlateBlock pressurePlateBlock, Block stone) {
        this.pressurePlateBlock(pressurePlateBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
    }

    public void pressurePlate(PressurePlateBlock pressurePlateBlock, String stone) {
        this.pressurePlateBlock(pressurePlateBlock, this.mcLoc("block/" + stone));
    }

    public void fence(FenceBlock fenceBlock, Block stone) {
        this.fenceBlock(fenceBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
        this.itemModels().withExistingParent("block/" + BuiltInRegistries.BLOCK.getKey(fenceBlock).getPath() + "_inventory", this.mcLoc("block/fence_inventory")).texture("texture", this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
    }

    public void fenceGate(FenceGateBlock fenceGateBlock, Block stone) {
        this.fenceGateBlock(fenceGateBlock, this.mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(stone).getPath()));
    }

    public void lever(LeverBlock leverBlock, Block stone) {
        this.getVariantBuilder(leverBlock).forAllStates(blockState -> {
            String name = BuiltInRegistries.BLOCK.getKey(leverBlock).getPath();
            String stoneId = BuiltInRegistries.BLOCK.getKey(stone).getPath();
            Direction facing = blockState.getValue(LeverBlock.FACING);
            AttachFace face = blockState.getValue(LeverBlock.FACE);
            boolean powered = blockState.getValue(LeverBlock.POWERED);
            return ConfiguredModel.builder().modelFile(powered ? this.models().withExistingParent(name, this.mcLoc("block/lever")).texture("particle", this.mcLoc("block/" + stoneId)).texture("base", this.mcLoc("block/" + stoneId)).texture("lever", this.modLoc("block/" + stoneId + "_lever")) : this.models().withExistingParent(name + "_on", this.mcLoc("block/lever_on")).texture("particle", this.mcLoc("block/" + stoneId)).texture("base", this.mcLoc("block/" + stoneId)).texture("lever", this.modLoc("block/" + stoneId + "_lever"))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
        });
    }

    public void lever(LeverBlock leverBlock, String stone, String lever) {
        this.getVariantBuilder(leverBlock).forAllStates(blockState -> {
            String name = BuiltInRegistries.BLOCK.getKey(leverBlock).getPath();
            Direction facing = blockState.getValue(LeverBlock.FACING);
            AttachFace face = blockState.getValue(LeverBlock.FACE);
            boolean powered = blockState.getValue(LeverBlock.POWERED);
            return ConfiguredModel.builder().modelFile(powered ? this.models().withExistingParent(name, this.mcLoc("block/lever")).texture("particle", this.mcLoc("block/" + stone)).texture("base", this.mcLoc("block/" + stone)).texture("lever", this.modLoc("block/" + lever)) : this.models().withExistingParent(name + "_on", this.mcLoc("block/lever_on")).texture("particle", this.mcLoc("block/" + stone)).texture("base", this.mcLoc("block/" + stone)).texture("lever", this.modLoc("block/" + lever))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
        });
    }

    public void lever(LeverBlock leverBlock, Block stone, String lever) {
        this.getVariantBuilder(leverBlock).forAllStates(blockState -> {
            String name = BuiltInRegistries.BLOCK.getKey(leverBlock).getPath();
            String stoneId = BuiltInRegistries.BLOCK.getKey(stone).getPath();
            Direction facing = blockState.getValue(LeverBlock.FACING);
            AttachFace face = blockState.getValue(LeverBlock.FACE);
            boolean powered = blockState.getValue(LeverBlock.POWERED);
            return ConfiguredModel.builder().modelFile(powered ? this.models().withExistingParent(name, this.mcLoc("block/lever")).texture("particle", this.mcLoc("block/" + stoneId)).texture("base", this.mcLoc("block/" + stoneId)).texture("lever", this.modLoc("block/" + lever)) : this.models().withExistingParent(name + "_on", this.mcLoc("block/lever_on")).texture("particle", this.mcLoc("block/" + stoneId)).texture("base", this.mcLoc("block/" + stoneId)).texture("lever", this.modLoc("block/" + lever))).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).build();
        });
    }
}
