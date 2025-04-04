package com.lostoflight.shadowslave;

import com.lostoflight.shadowslave.common.items.Foods;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(ShadowSlave.MODID)
public class ShadowSlave {
    // El id de mi mod
    public static final String MODID = "shadowslave";

    public ShadowSlave(){

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();       

        eventBus
        
        Foods.register(eventBus);
    }
}


