package com.hskll.wardendrew.primitive_healing.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;

public class Poultice  extends Item {

    public Poultice() {
        super(
            new Item.Properties()
                .tab(CreativeModeTab.TAB_FOOD)
                .stacksTo(1)
                .rarity(Rarity.COMMON)
                .food(
                    (new FoodProperties.Builder())
                    .nutrition(0)
                    .saturationMod(0f)
                    .alwaysEat()
                    .build()
                )
        );
    }

    @Override
    public int getUseDuration(ItemStack itemStack) {
        return 60;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level level, List<Component> componentList, TooltipFlag tooltipFlag) {
        componentList.add(Component.literal("Simple herbal poultice that heals 1/2 a heart."));
        super.appendHoverText(itemStack, level, componentList, tooltipFlag);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        if (livingEntity == null) return itemStack;

        super.finishUsingItem(itemStack, level, livingEntity);

        livingEntity.setHealth(livingEntity.getHealth() + 1);

        if (itemStack.isEmpty()) {
            return new ItemStack(Items.BOWL);
        }

        return itemStack;
    }
}
