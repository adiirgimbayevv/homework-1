package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Warrior implements Character{
    private String name;
    private int health;
    private int strength;
    private Weapon equippedWeapon;
    private Armor armor;

    public Warrior(String name){
        this.name=name;
        this.health=120;
        this.strength=70;
    }
    @Override
    public String getName(){
        return name;}
    @Override
    public int getHealth(){
        return health;
    }@Override
    public void equipArmor(Armor armor) {
        this.armor=armor;
        System.out.println(name+" puts on heavy armor!");
    }
    @Override
    public void displayStats() {
        System.out.println("Warrior: " + name + " (HP: " + getHealth() + ")");
        System.out.println("Stats -> Strength: " + strength);
        if (equippedWeapon != null) {
            System.out.println("Weapon: " + equippedWeapon.getWeaponInfo());
        }

        if (armor != null) {
            System.out.println("Armor: " + armor.getArmorInfo());
        }
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name+" uses Heavy Slam!");}

    @Override
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon=weapon;
        System.out.println(name+" equipped "+weapon.getWeaponType());}
}