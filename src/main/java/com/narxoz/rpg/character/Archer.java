package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {
    private String name;
    private Weapon weapon;
    private Armor armor;
    public Archer(String name) { this.name = name; }

    @Override
    public String getName() { return name; }
    @Override
    public int getHealth() { return 100;}
    @Override
    public void equipWeapon(Weapon weapon) { this.weapon=weapon; }
    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }
    @Override
    public void displayStats() {
        System.out.println("Archer: "+name+" (HP: " + getHealth()+")");
        if (weapon!=null) {
            System.out.println("Weapon: "+weapon.getWeaponInfo());}
        if (armor!=null) {
            System.out.println("Armor: "+armor.getArmorInfo());}
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " shoots an arrows!");}
}