package com.company;

public class Cat implements Swimmable, Runable{
    @Override
    public void run() {
        System.out.println("Miua miua, run run");
    }

    @Override
    public void swim() {
        System.out.println("miua miua, swim smim");
    }
}
