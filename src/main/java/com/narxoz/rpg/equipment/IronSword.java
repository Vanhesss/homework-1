package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {

    private int damage;
    private String weaponType;

    public IronSword() {
        this.damage = 25;
        this.weaponType = "Sword";
    }

    // TODO: Implement methods from Weapon interface
    // Define those methods in the Weapon interface first!

    // Example method structure:
    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }

    public String getWeaponType() {
        return weaponType;
    }
}
