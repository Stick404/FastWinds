package stickia.fastwinds.github.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import stickia.fastwinds.github.FastWinds;

public class WindItems {
    public static final Item HHF = registerItem("hhf", new Item(new Item.Settings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(HHF);
    }


    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, Identifier.of(FastWinds.MOD_ID, name), item);
    }

    public static void registerWindItems() {
        FastWinds.LOGGER.info("Whooshed Windy Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(WindItems::addItemsToIngredientItemGroup);
    }
}
