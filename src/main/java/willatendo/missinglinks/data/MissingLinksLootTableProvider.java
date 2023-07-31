package willatendo.missinglinks.data;

import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class MissingLinksLootTableProvider {
	public static LootTableProvider create(PackOutput packOutput) {
		return new LootTableProvider(packOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(MissingLinksBlockLoot::new, LootContextParamSets.BLOCK))) {
			@Override
			protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
			}
		};
	}
}
