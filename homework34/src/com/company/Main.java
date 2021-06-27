package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Dog> dogs = new ArrayList<>();
        Set<Dog> dalmatians = new HashSet<>();

        for (int i = 1; i <= 40; i++) {
            dogs.add(new Dog("dog " + i, random.nextInt(40 + 1 - 1) + 1));
            dalmatians.addAll(dogs);
        }

        System.out.println(dalmatians);
        System.out.println(dalmatians.size());

        
    }
}
