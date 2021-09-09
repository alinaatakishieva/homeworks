package com.company;

public class MultiplyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Умножение -> " + (Main.number * 2));
    }
}
