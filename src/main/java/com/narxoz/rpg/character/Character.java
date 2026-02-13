package com.narxoz.rpg.character;

public interface Character {
    String getName();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();
    void displayStats();
    void useSpecialAbility();

    void atack();
    String getWeapon();
    String getArmor();
    void equipWeapon(String weapon);
    void equipArmor(String armor);
}
