package com.company;

public class DivideThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Деление -> " + (Main.number / 2));
    }
}
