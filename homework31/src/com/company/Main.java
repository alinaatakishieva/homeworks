package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        changeFileType();
    }

    public static void changeFileType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();
        System.out.println("Введите новое расширение");
        String newType = scanner.nextLine();

        if (fileName.contains(".")) {
            String oldType = fileName.substring(fileName.lastIndexOf(".") + 1);
            String result = fileName.replace(oldType, newType);
            System.out.println("Result: " + result);
        } else
            System.out.println("Result: " + fileName + "." + newType);
    }
}
