package net.swift984.musicdiscmod.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swift984.musicdiscmod.MusicDiscMod;

public class ModSounds {

    public static SoundEvent WATERSONG = registerSoundEvent("watersong");

    public static SoundEvent BALLROOM = registerSoundEvent("ballroom");

    public static SoundEvent BENNY_WORM = registerSoundEvent("benny_worm");

    public static SoundEvent BRYLCREAM = registerSoundEvent("brylcream");

    public static SoundEvent BURNING_MEMORY = registerSoundEvent("burning_memory");

    public static SoundEvent CANAL_ROYALE = registerSoundEvent("canal_royale");

    public static SoundEvent COURTYARD = registerSoundEvent("courtyard");

    public static SoundEvent FARAWAY_BEACH = registerSoundEvent("faraway_beach");

    public static SoundEvent GHASTLY_GHOSTSHIP = registerSoundEvent("ghastly_ghostship");

    public static SoundEvent MASQUERADE = registerSoundEvent("masquerade");

    public static SoundEvent MY_GOLDEN_HOOK = registerSoundEvent("my_golden_hook");

    public static SoundEvent OMFG_HELLO = registerSoundEvent("omfg_hello");

    public static SoundEvent RHYTHMIC_REEF = registerSoundEvent("rhythmic_reef");

    public static SoundEvent THIS_IS_BERK = registerSoundEvent("this_is_berk");

    public static SoundEvent VINE_BOOM = registerSoundEvent("vine_boom");

    public static SoundEvent DOG = registerSoundEvent("dog");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MusicDiscMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
