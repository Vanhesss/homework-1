package com.narxoz.rpg.character;

public class Archer implements Character {
    
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    
    private String weapon;
    private String armor;
    
    public Archer(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 70;
        this.strength = 60;
        this.intelligence = 50;
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
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }
    
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses MULTI-SHOT! Fires multiple arrows at once!");
    }
    
    @Override
    public void atack() {
        System.out.println(name + " shoots with " + weapon + " dealing " + strength + " damage from distance!");
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
