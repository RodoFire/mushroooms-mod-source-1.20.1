package net.louis.mushrooomsmod.sound;

import net.louis.mushrooomsmod.MushrooomsMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent LA_MARSEILLAISE_DISC = registerSoundEvent("la_marseillaise_disc");
    public static SoundEvent HYMEN_URSS = registerSoundEvent("hymne_urss");


    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(MushrooomsMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerModSound(){
        MushrooomsMod.LOGGER.info("registering sounds");
    }
}
