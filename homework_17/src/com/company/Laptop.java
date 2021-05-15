package com.company;

public class Laptop {
    private Display display;
    private String brand;
    private String color;
    private HardDisk hardDisk;
    private RAM ram;
    private String videoCard;
    private USB [] array;
    private Keyboard keyboard;

    public Laptop(){

    }

    public Laptop(Display display, String brand, String color, HardDisk hardDisk, RAM ram, String videoCard, USB[] array, Keyboard keyboard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.videoCard = videoCard;
        this.array = array;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public USB[] getArray() {
        return array;
    }

    public void setArray(USB[] array) {
        this.array = array;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

}
