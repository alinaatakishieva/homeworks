package com.company;

public class Bread implements Bakeable {
    @Override
    public void bake() { // overriding bake method from Bakeable interface
        System.out.println("it`s a bakeable bread");
    }
}
