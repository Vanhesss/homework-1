package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    
    private int defense;
    private String armorType;
    private int agilityBonus; // Уникальное свойство легкой брони
    
    public LeatherArmor() {
        this.defense = 20;
        this.armorType = "Medium Armor";
        this.agilityBonus = 15; // Дает +15 к ловкости
    }
    
    @Override
    public int getDefense() {
        return defense;
    }
    
    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Flexible leather armor that enhances mobility";
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
        System.out.println("Agility Bonus: +" + agilityBonus);
    }
    
    public int getAgilityBonus() {
        return agilityBonus;
    }
}
