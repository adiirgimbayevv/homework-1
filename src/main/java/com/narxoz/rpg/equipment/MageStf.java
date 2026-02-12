package com.narxoz.rpg.equipment;

public class MageStf implements Weapon {
    @Override public String getWeaponType(){ return "Staff"; }
    @Override public String getWeaponInfo(){ return "Invincible magic stick"; }
    @Override public int getDamage(){ return 25; }
}