package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {
    
    private int damage;
    private String weaponType;
    private int manaBoost; // Уникальное свойство магического оружия
    
    public WizardStaff() {
        this.damage = 15;
        this.weaponType = "Staff";
        this.manaBoost = 20; // Дает +20 к мане
    }
    
    @Override
    public int getDamage() {
        return damage;
    }
    
    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - A mystical staff that enhances magical power";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Mana Boost: +" + manaBoost);
    }
    
    @Override
    public String getWeaponType() {
        return weaponType;
    }
    
    public int getManaBoost() {
        return manaBoost;
    }
}
