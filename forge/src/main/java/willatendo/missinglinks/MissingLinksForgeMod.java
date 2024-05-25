package willatendo.missinglinks;

import net.minecraftforge.fml.common.Mod;
import willatendo.missinglinks.server.utils.MissingLinksUtils;
import willatendo.simplelibrary.server.registry.SimpleRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod(MissingLinksUtils.ID)
public class MissingLinksForgeMod {
    public static final List<SimpleRegistry<?>> REGISTRIES = new ArrayList<>();

    public MissingLinksForgeMod() {
        MissingLinksMod.onInitialize(REGISTRIES);
    }
}
