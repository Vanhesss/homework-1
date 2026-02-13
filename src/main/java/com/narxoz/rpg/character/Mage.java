package com.narxoz.rpg.character;

public class Mage implements Character {
    
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    
    private String weapon;
    private String armor;
    
    public Mage(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 90;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getHealth() {
        return health;
    }
    
    @Override
    public int getMana() {
        return mana;
    }
    
    @Override
    public int getStrength() {
        return strength;
    }
    
    @Override
    public int getIntelligence() {
        return intelligence;
    }
    
    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }
    
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts FIREBALL! Massive magical damage!");
    }
    
    @Override
    public void atack() {
        System.out.println(name + " attacks with " + weapon + " dealing " + intelligence + " magical damage!");
    }
    
    @Override
    public String getWeapon() {
        return weapon;
    }
    
    @Override
    public String getArmor() {
        return armor;
    }
    
    @Override
    public void equipWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public void equipArmor(String armor) {
        this.armor = armor;
    }
}
