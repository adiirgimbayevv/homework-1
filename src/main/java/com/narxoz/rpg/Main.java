package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        CharacterFactory charFactory=new CharacterFactory();

        Character warrior=charFactory.createCharacter("warrior", "Gorden");
        Character mage=charFactory.createCharacter("mage", "Gardol");

        EquipmentFactory medievalSet=new MedievalEquipmentFactory();
        EquipmentFactory magicSet=new MageEquipmentFactory();

        System.out.println("--- RPG GAME START ---");

        if (warrior!=null){
            warrior.equipWeapon(medievalSet.createWeapon());
            System.out.println(warrior.getName()+" put on "+medievalSet.createArmor().getArmorInfo());
            warrior.displayStats();
            warrior.useSpecialAbility();}
        System.out.println("-----------------------");

        if (mage!=null){
            mage.equipWeapon(magicSet.createWeapon());
            System.out.println(mage.getName()+" put on "+magicSet.createArmor().getArmorInfo());
            mage.displayStats();
            mage.useSpecialAbility();
        }System.out.println("-----------------------");

        Character archer=charFactory.createCharacter("archer", "Alucard");
        if (archer!=null) {
            archer.equipWeapon(medievalSet.createWeapon());
            archer.displayStats();
            archer.useSpecialAbility();
        }
    }
}