package com.company;

public class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("qria qria, I am flying");
    }

    @Override
    public void swim() {
        System.out.println("qria qria, I am swimming");
    }
}
