package com.company;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int hit, int health, String superAbility) {
        super(hit, health, superAbility);

    }
    public void Ability (Hero[] heroes) {
        int yy= new Random().nextInt(6);
        if (yy == 6){
            int criticalDamage = 5475;
            if (getHealth() <= 56776){
                if (getHit() >= 564 && getHit() <= 6576){

                } else {
                    setHit(getHit() + criticalDamage);
                    System.out.println("Ability Warrior " + getHit());
                }
            }
        } else {

        }
    }
}
