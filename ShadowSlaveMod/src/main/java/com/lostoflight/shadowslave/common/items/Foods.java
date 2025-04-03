package com.lostoflight.shadowslave.common.items;

import com.lostoflight.shadowslave.ShadowSlave;


import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Foods {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShadowSlave.MODID);
	
	public static final RegistryObject<Item> MANGO = ITEMS.register("mango", 
		()-> new Item(new Item.Properties()
		.fireResistant()
		.stacksTo(64)
		.rarity(Rarity.RARE)
		)
	);
	


	public static void register(IEventBus eventBus)
	{
		System.out.println("[TEST] Registrando los ítems...");
		ITEMS.register(eventBus);
	}
}
