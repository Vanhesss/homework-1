package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {
    
    private int defense;
    private String armorType;
    private int manaBoost; 
    
    public EnchantedRobes() {
        this.defense = 10;
        this.armorType = "Light Armor";
        this.manaBoost = 25; // Дает +25 к мане
    }
    
    @Override
    public int getDefense() {
        return defense;
    }
    
    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - Mystical robes woven with magical threads";
    }
    
    @Override
    public String getArmorType() {
        return armorType;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Mana Boost: +" + manaBoost);
    }
    
    public int getManaBoost() {
        return manaBoost;
    }
}
