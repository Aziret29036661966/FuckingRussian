package com.company;

import java.util.Random;

public class Medic extends Hero {
    public Medic(int hit, int health, String superAbility) {
        super(hit, health, superAbility);
    }

    public void Ability (Hero[] heroes) {
        int quepro = new Random().nextInt(5);
        if (quepro == 6){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getClass().getSimpleName() != "Doctor"){
                    int hero = new Random().nextInt(heroes.length);
                    final int min = 200;
                    final int max = 410;
                    final int randomHealth = new Random().nextInt((max - min) + 5) + min;
                    heroes[hero].setHealth(heroes[hero].getHealth() + randomHealth);
                    System.out.println(" Doctor choose " + heroes[hero].getClass().getSimpleName() + " uu " + randomHealth);
                    break;
                }
            }
        }
    }
}
