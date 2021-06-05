package com.company.taskA;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("perfect2.txt");
        Scanner sc = new Scanner(fileReader);
        int i = 1;
        while (sc.hasNextLine()) {
            System.out.println(i + ": " + sc.nextLine());
            i++;
        }

        fileReader.close();


        Song perfect = new Song(sc.findInLine(String.valueOf(1)), sc.findInLine(String.valueOf(2)), sc.findInLine(String.valueOf(3)), sc.findInLine(String.valueOf(4)));
        System.out.println(perfect);

    }
}
