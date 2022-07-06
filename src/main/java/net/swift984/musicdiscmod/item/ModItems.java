package net.swift984.musicdiscmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.swift984.musicdiscmod.MusicDiscMod;
import net.swift984.musicdiscmod.item.custom.ModMusicDiscItem;
import net.swift984.musicdiscmod.sound.ModSounds;

public class ModItems {

    public static final Item WATERSONG_MUSIC_DISC = registerItem("watersong_music_disc",
            new ModMusicDiscItem(7, ModSounds.WATERSONG,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(13).rarity(Rarity.RARE).fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MusicDiscMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MusicDiscMod.MOD_ID);
    }
}
