package com.company;

public class Circle implements Drawable { // implements use for interfaces
    @Override
    public void draw() { // overriding the draw abstract method from Drawable interface
        System.out.println("it`s A drawable circle");
    }
}
