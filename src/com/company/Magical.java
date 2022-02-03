package com.company;

import java.util.Random;

public class Magical extends Hero {
    public Magical(int hit, int health, String superAbility) {
        super(hit, health, superAbility);

    }
    public void Ability(Hero[] heroes) {
        int yy = new Random().nextInt(2);
        int damage = 0;
        if (yy == 1) {
            damage = new Random().nextInt(36);
        }
        System.out.println("Ability Magical - " + damage);
    }
    }

