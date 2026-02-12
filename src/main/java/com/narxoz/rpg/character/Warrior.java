package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;

public class Warrior implements Character{
    private String name;
    private int health;
    private int mana;
    private int strength;
    private Weapon equippedWeapon;

    public Warrior(String name){
        this.name=name;
        this.health=120;
        this.mana=20;
        this.strength=70;
    }
    @Override
    public String getName(){
        return name;}
    @Override
    public int getHealth(){
        return health;
    }
    @Override
    public void displayStats(){
        System.out.println("=== Warrior Profile ===");
        System.out.println("Name: "+name);
        System.out.println("Health: "+health);
        System.out.println("Mana: "+mana);
        System.out.println("Strength: "+strength);

        if (equippedWeapon!=null){
            System.out.println("Weapon: "+equippedWeapon.getWeaponInfo()+"(Damage: "+equippedWeapon.getDamage()+")");
        } else{System.out.println("Weapon: Bare hands");}
        System.out.println("--------------------");
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name+" uses Heavy Slam!");}

    @Override
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon=weapon;
        System.out.println(name+" equipped "+weapon.getWeaponType());}
}