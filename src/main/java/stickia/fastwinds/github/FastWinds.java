package stickia.fastwinds.github;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stickia.fastwinds.github.item.WindItems;

public class FastWinds implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("fast-winds");
	public static final String MOD_ID = "fast-winds";

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		WindItems.registerWindItems();
	}
}