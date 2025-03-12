package com.trkn.level2.oopLesson15;

import com.trkn.level2.lesson18.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{
    public Mage(String name, int damage) {
        super(name,damage);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Mage " + getName() + " attacks enemy "+ enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
