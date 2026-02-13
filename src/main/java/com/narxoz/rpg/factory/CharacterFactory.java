package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;

public class CharacterFactory {
    public Character createCharacter(String type, String name) {
        if (type==null) return null;
        if (type.equalsIgnoreCase("warrior")){
            return new Warrior(name);} else if (type.equalsIgnoreCase("mage")){
            return new Mage(name);} else if (type.equalsIgnoreCase("healer")){
            return new Healer(name);}else if (type.equalsIgnoreCase("archer")) { // Добавляем сюда!
            return new Archer(name);}
        return null;}
}