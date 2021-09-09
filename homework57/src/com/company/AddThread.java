package com.company;

public class AddThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Сумма -> " + (Main.number + 2));
    }
}
