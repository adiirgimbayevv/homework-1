package com.narxoz.rpg.factory;
import com.narxoz.rpg.equipment.*;

public class MageEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon(){
        return new MageStf();}
    @Override
    public Armor createArmor(){
        return new MageArmor();}
}