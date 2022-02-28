package missinglinks;

import missinglinks.server.block.MissingLinksBlocks;
import net.minecraftforge.fml.common.Mod;
import tyrannotitanlib.core.content.UtilitiesRegistry;

@Mod(MissingLinksMod.ID)
public class MissingLinksMod {
	public static final String ID = "missinglinks";
	public static final UtilitiesRegistry MISSING_LINKS_UTILS = new UtilitiesRegistry(ID);

	public MissingLinksMod() {
		MissingLinksBlocks.init();
	}
}
