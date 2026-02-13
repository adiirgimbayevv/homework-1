package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;


public class Healer implements Character{
    private String name;
    private int health=90;
    private int spirit=130; // Особый стат для лекаря
    private Weapon equippedWeapon;
    public Healer(String name){
        this.name=name;
    }
    @Override public String getName() { return name; }
    @Override public int getHealth() { return health;
    }@Override
    public void equipArmor(Armor armor) {
        System.out.println(getName() + " is trying on armor...");
    }
    @Override
    public void displayStats(){
        System.out.println("Hero: "+name+" [Healer)");
        System.out.println("HP: "+health+" | Spirit: "+spirit);
        if (equippedWeapon!=null){
            System.out.println("Weapon: "+equippedWeapon.getWeaponInfo());}}
    @Override
    public void useSpecialAbility(){
        System.out.println(name+" uses Heal");
    }
    @Override
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon=weapon;
        System.out.println(name+" equipped "+weapon.getWeaponType());}
}