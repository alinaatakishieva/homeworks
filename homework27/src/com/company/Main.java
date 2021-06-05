package com.company;

public class Main {

    public static void main(String[] args) {
        Flyable plane = new Plane();
        Flyable duck = new Duck();
        Flyable parrot = new Parrot();

        Runable human = new Human();
        Runable cat = new Cat();

        Swimmable shark = new Shark();
        Swimmable whale = new Whale();
        Swimmable sheep = new Sheep();

        Flyable[] flyables = {plane, duck, parrot};
        Runable[] runables = {human, cat};
        Swimmable[] swimmables = {shark, whale, sheep};

        for (Flyable item : flyables){
            item.fly();
        }
        for (Runable item : runables){
            item.run();
        }
        for (Swimmable item : swimmables){
            item.swim();
        }
    }
}
