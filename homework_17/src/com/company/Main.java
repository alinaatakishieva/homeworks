package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Display display = new Display();
        display.setDiagonal(18);
        display.setProducer("Xiomi");
        display.setMatrixType("LCD");

        HardDisk hardDisk = new HardDisk();
        hardDisk.setMemory(8);
        hardDisk.setDiskCount(10);

        USB usb1 = new USB();
        usb1.setType("usb");
        usb1.setId("a");

        USB usb2 = new USB();
        usb2.setType("type-C");
        usb2.setId("b");

        
        USB[] array = {usb1, usb2};

        Keyboard keyboard = new Keyboard();
        keyboard.setExtraInt(false);
        keyboard.setBacklighting(true);

        RAM ram = new RAM();
        ram.setVolume(8);
        ram.setProducer("mi");

        Laptop laptop = new Laptop();
        laptop.setBrand("Xiomi");
        laptop.setColor("Gray");
        laptop.setDisplay(display);
        laptop.setHardDisk(hardDisk);
        laptop.setArray(array);
        laptop.setKeyboard(keyboard);
        laptop.setRam(ram);
        laptop.setVideoCard("rx 2070");

        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Color: " + laptop.getColor());
        System.out.println("Display: " + laptop.getDisplay());
        System.out.println("USB ports: " + Arrays.toString(laptop.getArray()));
        System.out.println("Hard disk: " + laptop.getHardDisk());
        System.out.println("Keyboard: " + laptop.getKeyboard());
        System.out.println("RAM: " + laptop.getRam());
        System.out.println("Videocard: " + laptop.getVideoCard());


    }
}
