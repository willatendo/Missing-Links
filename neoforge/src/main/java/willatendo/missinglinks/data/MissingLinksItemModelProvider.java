package willatendo.missinglinks.data;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import willatendo.missinglinks.server.block.MissingLinksBlocks;
import willatendo.missinglinks.server.item.MissingLinksItems;

import java.util.Objects;

public class MissingLinksItemModelProvider extends ItemModelProvider {
    public MissingLinksItemModelProvider(PackOutput packOutput, String modId, ExistingFileHelper existingFileHelper) {
        super(packOutput, modId, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.getBuilder(MissingLinksItems.ICON.getId().getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/icon")));

        this.button(MissingLinksBlocks.ANDESITE_BUTTON.get());
        this.block(MissingLinksBlocks.ANDESITE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.ANDESITE_LEVER.get());
        this.button(MissingLinksBlocks.DIORITE_BUTTON.get());
        this.block(MissingLinksBlocks.DIORITE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.DIORITE_LEVER.get());
        this.button(MissingLinksBlocks.GRANITE_BUTTON.get());
        this.block(MissingLinksBlocks.GRANITE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.GRANITE_LEVER.get());
        this.button(MissingLinksBlocks.COBBLED_DEEPSLATE_BUTTON.get());
        this.block(MissingLinksBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.COBBLED_DEEPSLATE_LEVER.get());
        this.block(MissingLinksBlocks.CALCITE_STAIRS.get());
        this.block(MissingLinksBlocks.CALCITE_SLAB.get());
        this.wall(MissingLinksBlocks.CALCITE_WALL.get());
        this.button(MissingLinksBlocks.CALCITE_BUTTON.get());
        this.block(MissingLinksBlocks.CALCITE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.CALCITE_LEVER.get());
        this.block(MissingLinksBlocks.TUFF_STAIRS.get());
        this.block(MissingLinksBlocks.TUFF_SLAB.get());
        this.wall(MissingLinksBlocks.TUFF_WALL.get());
        this.button(MissingLinksBlocks.TUFF_BUTTON.get());
        this.block(MissingLinksBlocks.TUFF_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.TUFF_LEVER.get());
        this.block(MissingLinksBlocks.DRIPSTONE_STAIRS.get());
        this.block(MissingLinksBlocks.DRIPSTONE_SLAB.get());
        this.wall(MissingLinksBlocks.DRIPSTONE_WALL.get());
        this.button(MissingLinksBlocks.DRIPSTONE_BUTTON.get());
        this.block(MissingLinksBlocks.DRIPSTONE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.DRIPSTONE_LEVER.get());
        this.block(MissingLinksBlocks.SMOOTH_BASALT_STAIRS.get());
        this.block(MissingLinksBlocks.SMOOTH_BASALT_SLAB.get());
        this.wall(MissingLinksBlocks.SMOOTH_BASALT_WALL.get());
        this.button(MissingLinksBlocks.SMOOTH_BASALT_BUTTON.get());
        this.block(MissingLinksBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.SMOOTH_BASALT_LEVER.get());
        this.block(MissingLinksBlocks.END_STONE_STAIRS.get());
        this.block(MissingLinksBlocks.END_STONE_SLAB.get());
        this.wall(MissingLinksBlocks.END_STONE_WALL.get());
        this.button(MissingLinksBlocks.END_STONE_BUTTON.get());
        this.block(MissingLinksBlocks.END_STONE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.END_STONE_LEVER.get());
        this.block(MissingLinksBlocks.OBSIDIAN_STAIRS.get());
        this.block(MissingLinksBlocks.OBSIDIAN_SLAB.get());
        this.wall(MissingLinksBlocks.OBSIDIAN_WALL.get());
        this.button(MissingLinksBlocks.OBSIDIAN_BUTTON.get());
        this.block(MissingLinksBlocks.OBSIDIAN_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.OBSIDIAN_LEVER.get());
        this.block(MissingLinksBlocks.CRYING_OBSIDIAN_STAIRS.get());
        this.block(MissingLinksBlocks.CRYING_OBSIDIAN_SLAB.get());
        this.wall(MissingLinksBlocks.CRYING_OBSIDIAN_WALL.get());
        this.button(MissingLinksBlocks.CRYING_OBSIDIAN_BUTTON.get());
        this.block(MissingLinksBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.CRYING_OBSIDIAN_LEVER.get());
        this.block(MissingLinksBlocks.QUARTZ_BRICK_STAIRS.get());
        this.block(MissingLinksBlocks.QUARTZ_BRICK_SLAB.get());
        this.wall(MissingLinksBlocks.QUARTZ_BRICK_WALL.get());
        this.button(MissingLinksBlocks.QUARTZ_BRICK_BUTTON.get());
        this.block(MissingLinksBlocks.QUARTZ_BRICK_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.QUARTZ_BRICK_LEVER.get());
        this.block(MissingLinksBlocks.TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.WHITE_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.WHITE_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.WHITE_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.WHITE_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.WHITE_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.ORANGE_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.ORANGE_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.ORANGE_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.ORANGE_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.MAGENTA_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.MAGENTA_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.MAGENTA_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.MAGENTA_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIGHT_BLUE_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.YELLOW_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.YELLOW_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.YELLOW_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.YELLOW_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.LIME_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.LIME_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.LIME_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.LIME_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.LIME_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIME_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.PINK_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.PINK_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.PINK_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.PINK_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.PINK_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.PINK_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.GRAY_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.GRAY_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.GRAY_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.GRAY_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.GRAY_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIGHT_GRAY_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.CYAN_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.CYAN_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.CYAN_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.CYAN_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.CYAN_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.PURPLE_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.PURPLE_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.PURPLE_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.PURPLE_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.BLUE_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.BLUE_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.BLUE_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.BLUE_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BLUE_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.BROWN_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.BROWN_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.BROWN_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.BROWN_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BROWN_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.GREEN_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.GREEN_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.GREEN_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.GREEN_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.GREEN_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.RED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.RED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.RED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.RED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.RED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.RED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.BLACK_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.BLACK_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.BLACK_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.BLACK_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BLACK_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.WHITE_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.ORANGE_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.MAGENTA_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.YELLOW_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIME_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.PINK_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.GRAY_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.CYAN_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.PURPLE_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BLUE_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BROWN_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.GREEN_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.RED_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get());
        this.block(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get());
        this.wall(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get());
        this.button(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON.get());
        this.block(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BLACK_GLAZED_TERRACOTTA_LEVER.get());
        this.block(MissingLinksBlocks.WHITE_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.WHITE_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.WHITE_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.WHITE_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.WHITE_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.ORANGE_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.ORANGE_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.ORANGE_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.ORANGE_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.ORANGE_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.MAGENTA_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.MAGENTA_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.MAGENTA_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.MAGENTA_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.MAGENTA_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.YELLOW_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.YELLOW_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.YELLOW_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.YELLOW_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.YELLOW_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.LIME_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.LIME_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.LIME_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.LIME_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIME_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.PINK_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.PINK_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.PINK_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.PINK_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.PINK_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.GRAY_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.GRAY_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.GRAY_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.GRAY_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.GRAY_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.CYAN_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.CYAN_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.CYAN_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.CYAN_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.CYAN_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.PURPLE_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.PURPLE_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.PURPLE_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.PURPLE_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.PURPLE_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.BLUE_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.BLUE_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.BLUE_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.BLUE_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BLUE_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.BROWN_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.BROWN_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.BROWN_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.BROWN_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BROWN_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.GREEN_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.GREEN_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.GREEN_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.GREEN_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.GREEN_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.RED_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.RED_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.RED_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.RED_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.RED_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.BLACK_CONCRETE_STAIRS.get());
        this.block(MissingLinksBlocks.BLACK_CONCRETE_SLAB.get());
        this.wall(MissingLinksBlocks.BLACK_CONCRETE_WALL.get());
        this.button(MissingLinksBlocks.BLACK_CONCRETE_BUTTON.get());
        this.block(MissingLinksBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.BLACK_CONCRETE_LEVER.get());
        this.block(MissingLinksBlocks.WHITE_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.WHITE_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.WHITE_WOOL_WALL.get());
        this.block(MissingLinksBlocks.ORANGE_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.ORANGE_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.ORANGE_WOOL_WALL.get());
        this.block(MissingLinksBlocks.MAGENTA_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.MAGENTA_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.MAGENTA_WOOL_WALL.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_BLUE_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_BLUE_WOOL_WALL.get());
        this.block(MissingLinksBlocks.YELLOW_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.YELLOW_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.YELLOW_WOOL_WALL.get());
        this.block(MissingLinksBlocks.LIME_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.LIME_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.LIME_WOOL_WALL.get());
        this.block(MissingLinksBlocks.PINK_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.PINK_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.PINK_WOOL_WALL.get());
        this.block(MissingLinksBlocks.GRAY_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.GRAY_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.GRAY_WOOL_WALL.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.LIGHT_GRAY_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.LIGHT_GRAY_WOOL_WALL.get());
        this.block(MissingLinksBlocks.CYAN_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.CYAN_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.CYAN_WOOL_WALL.get());
        this.block(MissingLinksBlocks.PURPLE_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.PURPLE_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.PURPLE_WOOL_WALL.get());
        this.block(MissingLinksBlocks.BLUE_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.BLUE_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.BLUE_WOOL_WALL.get());
        this.block(MissingLinksBlocks.BROWN_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.BROWN_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.BROWN_WOOL_WALL.get());
        this.block(MissingLinksBlocks.GREEN_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.GREEN_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.GREEN_WOOL_WALL.get());
        this.block(MissingLinksBlocks.RED_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.RED_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.RED_WOOL_WALL.get());
        this.block(MissingLinksBlocks.BLACK_WOOL_STAIRS.get());
        this.block(MissingLinksBlocks.BLACK_WOOL_SLAB.get());
        this.wall(MissingLinksBlocks.BLACK_WOOL_WALL.get());
        this.block(MissingLinksBlocks.CLAY_STAIRS.get());
        this.block(MissingLinksBlocks.CLAY_SLAB.get());
        this.wall(MissingLinksBlocks.CLAY_WALL.get());
        this.block(MissingLinksBlocks.PACKED_MUD_STAIRS.get());
        this.block(MissingLinksBlocks.PACKED_MUD_SLAB.get());
        this.wall(MissingLinksBlocks.PACKED_MUD_WALL.get());
        this.block(MissingLinksBlocks.SCULK_STAIRS.get());
        this.block(MissingLinksBlocks.SCULK_SLAB.get());
        this.wall(MissingLinksBlocks.SCULK_WALL.get());
        this.block(MissingLinksBlocks.COAL_STAIRS.get());
        this.block(MissingLinksBlocks.COAL_SLAB.get());
        this.wall(MissingLinksBlocks.COAL_WALL.get());
        this.block(MissingLinksBlocks.IRON_STAIRS.get());
        this.block(MissingLinksBlocks.IRON_SLAB.get());
        this.wall(MissingLinksBlocks.IRON_WALL.get());
        this.block(MissingLinksBlocks.GOLD_STAIRS.get());
        this.block(MissingLinksBlocks.GOLD_SLAB.get());
        this.wall(MissingLinksBlocks.GOLD_WALL.get());
        this.block(MissingLinksBlocks.REDSTONE_STAIRS.get());
        this.block(MissingLinksBlocks.REDSTONE_SLAB.get());
        this.wall(MissingLinksBlocks.REDSTONE_WALL.get());
        this.block(MissingLinksBlocks.EMERALD_STAIRS.get());
        this.block(MissingLinksBlocks.EMERALD_SLAB.get());
        this.wall(MissingLinksBlocks.EMERALD_WALL.get());
        this.block(MissingLinksBlocks.LAPIS_STAIRS.get());
        this.block(MissingLinksBlocks.LAPIS_SLAB.get());
        this.wall(MissingLinksBlocks.LAPIS_WALL.get());
        this.block(MissingLinksBlocks.DIAMOND_STAIRS.get());
        this.block(MissingLinksBlocks.DIAMOND_SLAB.get());
        this.wall(MissingLinksBlocks.DIAMOND_WALL.get());
        this.block(MissingLinksBlocks.NETHERITE_STAIRS.get());
        this.block(MissingLinksBlocks.NETHERITE_SLAB.get());
        this.wall(MissingLinksBlocks.NETHERITE_WALL.get());
        this.wall(MissingLinksBlocks.QUARTZ_WALL.get());
        this.button(MissingLinksBlocks.QUARTZ_BUTTON.get());
        this.block(MissingLinksBlocks.QUARTZ_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.QUARTZ_LEVER.get());
        this.wall(MissingLinksBlocks.SMOOTH_QUARTZ_WALL.get());
        this.button(MissingLinksBlocks.SMOOTH_QUARTZ_BUTTON.get());
        this.block(MissingLinksBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.get());
        this.lever(MissingLinksBlocks.SMOOTH_QUARTZ_LEVER.get());
        this.wall(MissingLinksBlocks.SMOOTH_RED_SANDSTONE_WALL.get());
        this.wall(MissingLinksBlocks.SMOOTH_SANDSTONE_WALL.get());
        this.block(MissingLinksBlocks.SMOOTH_STONE_STAIRS.get());
        this.wall(MissingLinksBlocks.SMOOTH_STONE_WALL.get());
        this.fence(MissingLinksBlocks.RED_NETHER_BRICK_FENCE.get());
        this.block(MissingLinksBlocks.RED_NETHER_BRICK_FENCE_GATE.get());
        this.block(MissingLinksBlocks.NETHER_BRICK_FENCE_GATE.get());
    }

    public void block(Block block) {
        this.getBuilder(BuiltInRegistries.BLOCK.getKey(block).getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath())));
    }

    public void button(ButtonBlock block) {
        this.getBuilder(BuiltInRegistries.BLOCK.getKey(block).getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath() + "_inventory")));
    }

    public void wall(WallBlock block) {
        this.getBuilder(BuiltInRegistries.BLOCK.getKey(block).getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath() + "_inventory")));
    }

    public void fence(FenceBlock block) {
        this.getBuilder(BuiltInRegistries.BLOCK.getKey(block).getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath() + "_inventory")));
    }

    public void lever(LeverBlock block) {
        this.basicItem(block.asItem(), this.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath()));
    }

    public ItemModelBuilder basicItem(Item item, ResourceLocation texture) {
        return this.basicItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)), texture);
    }

    public ItemModelBuilder basicItem(ResourceLocation item, ResourceLocation texture) {
        return this.getBuilder(item.toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", texture);
    }
}