package com.trkn.level2.lesson18;

import com.trkn.level2.lesson18.weapon.*;
import com.trkn.level2.oopLesson15.Archer;
import com.trkn.level2.oopLesson15.Hero;
import com.trkn.level2.oopLesson15.Mage;
import com.trkn.level2.oopLesson15.Warrior;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {
    public static void main(String[] args) {
        Hero<MagicWeapon> mage = new Mage<>("Mage", 10);
        mage.setWeapon(new Wand());
        printWeaponDamage(mage);
    }

    public static void printWeaponDamage(Hero<MagicWeapon> hero) {
        hero.setWeapon(new Wand());
    }

    @Test
    public void testArcher() {
        Archer<Bow> archer = new Archer<>("Name",0);
        archer.setWeapon(new Bow());
        assertEquals(archer.getWeapon().getDamage(),10);
    }

     @Test
    public void testWarrior() {
        Warrior<Sword> warrior = new Warrior<>("Name",0);
        warrior.setWeapon(new Sword());
        assertEquals(warrior.getWeapon().getDamage(),15);
    }

    @Test
    public void testMage() {
        Mage<MagicWeapon> mage = new Mage<>("Name",0);
        mage.setWeapon(new Wand());
        assertEquals(mage.getWeapon().getDamage(),20);
    }


}
