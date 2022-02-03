package com.company;

public abstract class Hero extends HavingSuperAbility {
    private int hit, health;
     private String superAbility = "";

     public Hero(int hit, int health, String superAbility) {
         super();
         this.hit = hit;
        this.health = health;
        this.superAbility = superAbility;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "hit=" + hit +
                ", health=" + health +
                ", superAbility='" + superAbility + '\'' +
                '}';
    }
}
