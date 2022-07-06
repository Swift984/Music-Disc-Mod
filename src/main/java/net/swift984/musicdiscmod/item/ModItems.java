package net.swift984.musicdiscmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
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

    public static final Item BALLROOM_MUSIC_DISC = registerItem("ballroom_music_disc",
            new ModMusicDiscItem(7, ModSounds.BALLROOM,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE).fireproof()));

    public static final Item BENNY_WORM_MUSIC_DISC = registerItem("benny_worm_music_disc",
            new ModMusicDiscItem(7, ModSounds.BENNY_WORM,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE).food(FoodComponents.SUSPICIOUS_STEW)));

    public static final Item BRYLCREAM_MUSIC_DISC = registerItem("brylcream_music_disc",
            new ModMusicDiscItem(7, ModSounds.BRYLCREAM,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BURNING_MEMORY_MUSIC_DISC = registerItem("burning_memory_music_disc",
            new ModMusicDiscItem(7, ModSounds.BURNING_MEMORY,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE)));

    public static final Item CANAL_ROYALE_MUSIC_DISC = registerItem("canal_royale_music_disc",
            new ModMusicDiscItem(7, ModSounds.CANAL_ROYALE,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE).fireproof()));

    public static final Item COURTYARD_MUSIC_DISC = registerItem("courtyard_music_disc",
            new ModMusicDiscItem(7, ModSounds.COURTYARD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE).fireproof()));

    public static final Item FARAWAY_BEACH_MUSIC_DISC = registerItem("faraway_beach_music_disc",
            new ModMusicDiscItem(7, ModSounds.FARAWAY_BEACH,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE).fireproof()));

    public static final Item GHASTLY_GHOSTSHIP_MUSIC_DISC = registerItem("ghastly_ghostship_music_disc",
            new ModMusicDiscItem(7, ModSounds.GHASTLY_GHOSTSHIP,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE).fireproof()));

    public static final Item MASQUERADE_MUSIC_DISC = registerItem("masquerade_music_disc",
            new ModMusicDiscItem(7, ModSounds.MASQUERADE,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MY_GOLDEN_HOOK_MUSIC_DISC = registerItem("my_golden_hook_music_disc",
            new ModMusicDiscItem(7, ModSounds.MY_GOLDEN_HOOK,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE)));

    public static final Item OMFG_HELLO_MUSIC_DISC = registerItem("omfg_hello_music_disc",
            new ModMusicDiscItem(7, ModSounds.OMFG_HELLO,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE)));

    public static final Item RHYTHMIC_REEF_MUSIC_DISC = registerItem("rhythmic_reef_music_disc",
            new ModMusicDiscItem(7, ModSounds.RHYTHMIC_REEF,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE).fireproof()));

    public static final Item THIS_IS_BERK_MUSIC_DISC = registerItem("this_is_berk_music_disc",
            new ModMusicDiscItem(7, ModSounds.THIS_IS_BERK,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE)));

    public static final Item VINE_BOOM_MUSIC_DISC = registerItem("vine_boom_music_disc",
            new ModMusicDiscItem(7, ModSounds.VINE_BOOM,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.EPIC).fireproof()));

    public static final Item DOG_MUSIC_DISC = registerItem("dog_music_disc",
            new ModMusicDiscItem(7, ModSounds.DOG,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.EPIC).fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MusicDiscMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MusicDiscMod.MOD_ID);
    }
}
