package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.CharacterFactory;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.MedievalEquipmentFactory;
import com.narxoz.rpg.factory.MageEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- RPG GAME START ---");

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory mageFactory = new MageEquipmentFactory();

        Character warrior = CharacterFactory.createCharacter("Warrior", "Terizla");
        warrior.equipWeapon(medievalFactory.createWeapon());
        warrior.equipArmor(medievalFactory.createArmor());
        warrior.displayStats();
        warrior.useSpecialAbility();
        System.out.println("-----------------------");

        Character mage = CharacterFactory.createCharacter("Mage", "Kadita");
        mage.equipWeapon(mageFactory.createWeapon());
        mage.equipArmor(mageFactory.createArmor());
        mage.displayStats();
        mage.useSpecialAbility();
        System.out.println("-----------------------");

        Character archer = CharacterFactory.createCharacter("Archer", "Lesli");
        archer.equipWeapon(medievalFactory.createWeapon());
        archer.equipArmor(medievalFactory.createArmor());
        archer.displayStats();
        archer.useSpecialAbility();
        System.out.println("-----------------------");

        Character healer = CharacterFactory.createCharacter("Healer", "Estes");
        healer.equipWeapon(mageFactory.createWeapon());
        healer.equipArmor(mageFactory.createArmor());
        healer.displayStats();
        healer.useSpecialAbility();
        System.out.println("--- GAME OVER ---");}
}