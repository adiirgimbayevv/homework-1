package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;

public interface Character{
    String getName();
    int getHealth();

    void displayStats();
    void useSpecialAbility();
    void equipWeapon(Weapon weapon);

}