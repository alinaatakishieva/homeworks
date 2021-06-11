package com.company;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Alina\\IdeaProjects\\homework29\\kode.txt"); // file path in comp
        Path path = Paths.get("C:\\Users\\Alina\\IdeaProjects\\homework29\\kode.txt");    // to get path
        if (file.exists()) { //to check if file exists(sushestvuet)
            long bytes = file.length();
            System.out.println("File " + path + " length in bytes = " + bytes);  // to print file path with its size
        }

        try (FileReader fileReader = new FileReader("C:\\Users\\Alina\\Desktop\\homework16git\\homeworks\\homework28\\src\\com\\company\\taskA\\Main.java");
             FileWriter fileWriter = new FileWriter("kode.txt")) {  //try to read thi file and to write it in another new file
            Scanner scanner = new Scanner(fileReader);  // Scanner used to read
            while (scanner.hasNext()) {
                fileWriter.write(scanner.nextLine() + "\n\t");// use to write the old file into new file "kode.txt"
            }
        } catch (Exception ex) {  // catch any exception if it will
            System.out.println(ex.getMessage());
        }

        try {
            File file1 = new File("kode.txt");
            getFileSize(file); // function to get file size
        } catch (IllegalStateException exception) {  // catch exception if file is more than 100 bytes
            //  exception.printStackTrace();
            System.out.println("your " + file.getName() + " file is more than 100 bytes. it`s " + file.length() + " bytes");
        } finally {
            try {
                FileReader fileReader2 = new FileReader("kode.txt"); // possible to place another file and check it
                Scanner scan = new Scanner(fileReader2);
                while (scan.hasNext()) {
                    String string = scan.nextLine();
                    //System.out.println(string);
                }
            } catch (FileNotFoundException notFoundException) {  // if system will not find a file, it will throw an exception
                System.out.println("Your file is not found");
            }
        }

        try (FileReader fileReader3 = new FileReader("C:\\Users\\Alina\\IdeaProjects\\homework29\\src\\com\\company\\Main.java");
             FileWriter fileWriter = new FileWriter("code2.txt")) {  // i`m gonna writhe this code into new file without tabs and spaces
            Scanner scanner = new Scanner(fileReader3);  // Scanner used to read
            while (scanner.hasNext()) {
                fileWriter.write(scanner.nextLine());// use to write this code into new file "code2.txt"
            }
        } catch (Exception ex) {  // catch any exception if it will
            System.out.println(ex.getMessage());
        }

        File file2 = new File("C:\\Users\\Alina\\IdeaProjects\\homework29\\src\\com\\company\\Main.java"); // code2.txt file place
        long bytes = file2.length();
        System.out.println("File code2.txt length in bytes = " + bytes + "  Without tabs  and spaces");  // to print file  size
    }

    public static void getFileSize(File file) {  // function to check the file size
        long bytes = file.length();
        if (bytes > 100) {
            throw new IllegalStateException("Your file is more than 100 bytes");
        }
    }
}
