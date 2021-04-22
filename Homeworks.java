package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;
        int product = a * b * c;
//        float arithmeticMean = sum / 3;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
        System.out.println(a + " * " + b + " * " + c + " = " + product);
        System.out.println("(" + a + " + " + b + " + " + c + ")" + " / " + " 3 " + " = " + ((float)sum/3));
    }
}
