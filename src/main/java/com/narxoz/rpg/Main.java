package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");
        
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();
        
        Character warrior = warriorFactory.createCharacter("Conan the Barbarian");
        Character mage = mageFactory.createCharacter("Gandalf the Grey");
        Character archer = archerFactory.createCharacter("Legolas Greenleaf");
        
        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory magicFactory = new MagicEquipmentFactory();
        EquipmentFactory rangerFactory = new RangerEquipmentFactory();
        
        Weapon medievalWeapon = medievalFactory.createWeapon();
        Armor medievalArmor = medievalFactory.createArmor();
        
        Weapon magicWeapon = magicFactory.createWeapon();
        Armor magicArmor = magicFactory.createArmor();
        
        Weapon rangerWeapon = rangerFactory.createWeapon();
        Armor rangerArmor = rangerFactory.createArmor();
        
        System.out.println("--- CHARACTER STATS ---\n");
        
        warrior.displayStats();
        System.out.println("Special Ability:");
        warrior.useSpecialAbility();
        System.out.println();
        
        mage.displayStats();
        System.out.println("Special Ability:");
        mage.useSpecialAbility();
        System.out.println();
        
        archer.displayStats();
        System.out.println("Special Ability:");
        archer.useSpecialAbility();
        System.out.println();
        
        System.out.println("--- EQUIPPING CHARACTERS ---\n");
        
        equipCharacter(warrior, medievalWeapon, medievalArmor);
        equipCharacter(mage, magicWeapon, magicArmor);
        equipCharacter(archer, rangerWeapon, rangerArmor);
        
        System.out.println("\n--- EQUIPMENT DETAILS ---\n");
        
        displayCharacterWithEquipment(warrior, medievalWeapon, medievalArmor);
        displayCharacterWithEquipment(mage, magicWeapon, magicArmor);
        displayCharacterWithEquipment(archer, rangerWeapon, rangerArmor);
        
        System.out.println("--- COMBAT DEMONSTRATION ---\n");
        
        warrior.atack();
        mage.atack();
        archer.atack();

        System.out.println("\n=== Demo Complete ===");
    }

    private static void equipCharacter(Character character, Weapon weapon, Armor armor) {
        character.equipWeapon(weapon.getWeaponInfo());
        character.equipArmor(armor.getArmorInfo());
        System.out.println("✓ " + character.getName() + " equipped with " + 
                         weapon.getWeaponType() + " and " + armor.getArmorType());
    }

    private static void displayCharacterWithEquipment(Character character, Weapon weapon, Armor armor) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("  " + character.getName());
        System.out.println("╚════════════════════════════════════════╝");
        weapon.displayInfo();
        System.out.println();
        armor.displayInfo();
        System.out.println();
    }
}
