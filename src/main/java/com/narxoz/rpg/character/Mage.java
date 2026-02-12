package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;
public class Mage implements Character {
    private String name;
    private int health=60;
    private int mana=130;
    private Weapon equippedWeapon;
    public Mage(String name){
        this.name=name;
    }

    @Override public String getName() { return name;
    }
    @Override public int getHealth() { return health; }
    @Override
    public void displayStats(){
        System.out.println("Hero: "+name+" (Mage)");
        System.out.println("HP: "+health+" | Mana: "+mana);
        if (equippedWeapon!=null){
            System.out.println("Weapon: "+equippedWeapon.getWeaponInfo());}}
    @Override
    public void useSpecialAbility(){
        System.out.println(name+" uses Fireball");}
    @Override
    public void equipWeapon(Weapon weapon){
        this.equippedWeapon=weapon;
        System.out.println(name+" equipped "+weapon.getWeaponType());
    }
}