package com.company;

import java.util.Scanner;

public class Monkey implements Climbable, Carryable, Eatable {
    private String fruit;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public void climb() {
        System.out.println("I can climb");
    }



    @Override
    public void carry() {
        System.out.println("I can carry on my back other climbable animal - " + new OtherClimbableAnimal());
    }


    @Override
    public void eat() {
        if (fruit.equals("eatable")) {
            System.out.println("I eat eatable fruits");
        } else System.out.println("I will not eat this fruit because it is not eatable");
    }
}
