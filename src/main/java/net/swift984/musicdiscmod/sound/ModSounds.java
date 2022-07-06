package net.swift984.musicdiscmod.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swift984.musicdiscmod.MusicDiscMod;

public class ModSounds {
    public static SoundEvent WATERSONG = registerSoundEvent("watersong");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MusicDiscMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
