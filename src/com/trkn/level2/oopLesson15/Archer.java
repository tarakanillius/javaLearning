package com.trkn.level2.oopLesson15;

import com.trkn.level2.lesson18.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{
    private final Wolf wolf;
    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 100);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Archer " + getName() + " attacks enemy "+ enemy.getName());
        wolf.attackEnemy(enemy);
    }

     class Wolf{
        private final String name;
        private final int damage;

        private Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy){
            System.out.println("Wolf " + name + " attacks enemy "+ enemy.getName());
            enemy.takeDamage(damage+Archer.this.getDamage());
        }
     }
}
