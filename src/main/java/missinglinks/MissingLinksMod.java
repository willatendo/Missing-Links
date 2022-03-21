package missinglinks;

import missinglinks.server.block.MissingLinksBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tyrannotitanlib.core.content.UtilitiesRegistry;

@Mod(MissingLinksMod.ID)
public class MissingLinksMod {
	public static final String ID = "missinglinks";
	public static final UtilitiesRegistry UTILS = new UtilitiesRegistry(ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ID);

	public MissingLinksMod() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		MissingLinksBlocks.init();

		BLOCKS.register(bus);
	}
}
