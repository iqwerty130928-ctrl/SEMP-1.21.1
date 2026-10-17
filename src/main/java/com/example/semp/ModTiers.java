package com.example.semp;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModTiers implements Tier {
    TUNGSTEN(5, 3500, 15.0F, 5.0F, 25, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final java.util.function.Supplier<Ingredient> repairIngredient;

    ModTiers(int level, int uses, float speed, float damage, int enchantmentValue, java.util.function.Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    public int getUses() { return this.uses; }
    public float getSpeed() { return this.speed; }
    public float getAttackDamageBonus() { return this.damage; }
    public int getLevel() { return this.level; }
    public int getEnchantmentValue() { return this.enchantmentValue; }
    public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }
}
