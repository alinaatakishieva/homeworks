package com.company.taskB;

public class Cat extends Animal {
    String name;
    public Cat(String name, int animalNumber, int age) {
        super(animalNumber, age);
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " " + age + " years cat number: " + animalNumber;
    }
}
