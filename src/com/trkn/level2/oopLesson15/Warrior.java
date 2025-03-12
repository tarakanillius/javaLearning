package com.trkn.level2.oopLesson15;

import com.trkn.level2.lesson18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T>{
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Warrior " + getName() + " attacks enemy "+ enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
