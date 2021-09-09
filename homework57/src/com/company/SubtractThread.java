package com.company;

public class SubtractThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Разница -> " + (Main.number - 2));
    }
}
