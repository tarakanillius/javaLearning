package com.trkn.level2.oopLesson15;

import com.trkn.level2.lesson18.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    private final String name;
    private final int damage;
    private T weapon;
    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}


