package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter 'eatable' or 'not eatable!");
        String fruit = scann.next();

        Monkey monkey = new Monkey();
        monkey.setFruit(fruit);
        monkey.climb();
        monkey.carry();
        monkey.eat();
    }
}
