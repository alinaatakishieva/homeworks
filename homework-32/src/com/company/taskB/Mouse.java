package com.company.taskB;

public class Mouse extends Animal{
    String name;

    public Mouse(String name, int animalNumber, int age) {
        super(animalNumber, age);
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " " + age + " years mouse number: " + animalNumber;
    }
}
