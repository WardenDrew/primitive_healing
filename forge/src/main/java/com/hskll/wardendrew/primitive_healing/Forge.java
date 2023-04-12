package com.hskll.wardendrew.primitive_healing;

import com.hskll.wardendrew.primitive_healing.items.Poultice;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import com.hskll.wardendrew.primitive_healing.Constants;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Constants.MODID)
public final class Forge {
    public Forge() {
        Constants.getLogger().info("Primitive Healing for FORGE is loading.");

        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DeferredRegister<Item> itemsRegister = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MODID);
        itemsRegister.register("poultice", () -> new Poultice());

        itemsRegister.register(modEventBus);
    }


}