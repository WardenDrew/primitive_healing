package com.hskll.wardendrew.primitive_healing;

import com.hskll.wardendrew.primitive_healing.items.Poultice;
import net.fabricmc.api.ModInitializer;
import com.hskll.wardendrew.primitive_healing.Constants;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class Fabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.getLogger().info("Primitive Healing for FABRIC is loading.");

        Registry.register(Registry.ITEM, new ResourceLocation(Constants.MODID, "poultice"), new Poultice());
    }
}