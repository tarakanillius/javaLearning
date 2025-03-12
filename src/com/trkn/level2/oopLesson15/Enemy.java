package com.trkn.level2.oopLesson15;

public class Enemy implements Mortal{
    private final String name;
    private int health;

    public Enemy(String name,int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage){
        health -= Math.min(health, damage);
        System.out.println(health);
    }

    @Override
    public void isALive() {
        System.out.println(health > 0 ? "Enemy is alive" : "Enemy is dead");
    }
}
