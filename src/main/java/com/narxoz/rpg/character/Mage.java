package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
public class Mage implements Character {
    private String name;
    private Armor armor;
    private int health=60;
    private int mana=130;
    private Weapon equippedWeapon;
    public Mage(String name){
        this.name=name;
    }

    @Override public String getName() { return name;
    }@Override
    public void equipArmor(Armor armor) {
        this.armor=armor;
        System.out.println("Mage " + getName() + " equips magical robes: " + armor.getArmorInfo());
    }
    @Override public int getHealth() { return health; }
    @Override
    public void displayStats(){
        System.out.println("Hero: " + name + " (Mage)");
        System.out.println("HP: " + health + " | Mana: " + mana);

        if (equippedWeapon!=null) {
            System.out.println("Weapon: " + equippedWeapon.getWeaponInfo());}
        if (armor!=null) {
            System.out.println("Armor: "+armor.getArmorInfo());
        }
    }
    @Override
    public void useSpecialAbility(){
        System.out.println(name+" uses Fireball");}
    @Override
    public void equipWeapon(Weapon weapon){
        this.equippedWeapon=weapon;
        System.out.println(name+" equipped "+weapon.getWeaponType());
    }
}