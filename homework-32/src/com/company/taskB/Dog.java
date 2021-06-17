package com.company.taskB;

public class Dog extends Animal {
    String name;
    public Dog(String name, int animalNumber, int age) {
        super(animalNumber, age);
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " " + age + " years dog number: " + animalNumber;
    }
}
