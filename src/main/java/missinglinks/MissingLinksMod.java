package missinglinks;

import com.tterrag.registrate.util.nullness.NonNullSupplier;

import missinglinks.server.block.MissingLinksBlocks;
import missinglinks.server.util.MissingLinksRegistrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(MissingLinksMod.ID)
public class MissingLinksMod {
	public static final String ID = "missinglinks";
	private static final NonNullSupplier<MissingLinksRegistrate> REGISTRATE = MissingLinksRegistrate.lazy(ID);

	public MissingLinksMod() {
		MissingLinksBlocks.init();
	}

	public static MissingLinksRegistrate getRegistrate() {
		return REGISTRATE.get();
	}

	public static ResourceLocation rL(String path) {
		return new ResourceLocation(ID, path);
	}
}
