package com.company;

public class Human implements Runable, Swimmable{
    @Override
    public void run() {
        System.out.println("I am human and i can run");
    }

    @Override
    public void swim() {
        System.out.println("I am human and i can swim");
    }
}
