package com.trkn.level2.oopLesson15;

import com.trkn.level2.lesson18.weapon.*;

public class TrainingGround {
    public static void main(String[] args) {
        test(new Warrior<Sword>("Name", 30), new Mage<Wand>("Name", 100), new Archer<Bow>("Name", 500));
    }

    public static void test(Hero<? extends Weapon>... heroes){
        Enemy enemy = new Enemy("Name",100);
        for (Hero<? extends Weapon> hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
}
