package com.company.taskB;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MainB {
    public static void main(String[] args) {
        Random random = new Random();
        // point 1
        List<Animal> pets = new LinkedList<>();
        for (int i = 1; i <= 50; i++) {
            pets.add(new Cat("Cat", i,  i));
            pets.add(new Dog("Dog", i, i));
        }
        System.out.println("50 cats and dogs: \n" + pets);

        // point 3, 4
        int catCounter = 0;
        int dogCounter = 0;
        int mouseCounter = 1;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat) {
                catCounter++;
                if (catCounter % 5 == 0) pets.remove(i--);
            }
            else if (pets.get(i) instanceof Dog) {
                dogCounter++;
                if (dogCounter % 3 == 0) {
                    pets.add(i , new Mouse("Mouse", mouseCounter, random.nextInt(10) + 1));
                    mouseCounter++;
                    Animal tmp = pets.get(i);
                    pets.set(i, pets.get(i + 1));
                    pets.set(i + 1, tmp);
                }
            }
        }
        System.out.println("Cats, dogs, mouses:(without some cats) \n" + pets);

        // point 7
        int catsAgeSum = 0;
        int dogsAgeSum = 0;
        int mouseAgeSum = 0;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat) catsAgeSum = catsAgeSum + (pets.get(i)).getAge();
            else if (pets.get(i) instanceof Dog) dogsAgeSum = dogsAgeSum + (pets.get(i).getAge());
            else if (pets.get(i) instanceof Mouse) mouseAgeSum = mouseAgeSum + (pets.get(i)).getAge();
        }
        System.out.println("sum of ages of cats = " + catsAgeSum);
        System.out.println("sum of ages of dogs = " + dogsAgeSum);
        System.out.println("sum iof ages of mouses = " + mouseAgeSum);

        // point 6
        List<Animal> mouseList = new LinkedList<>();
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Mouse){
                mouseList.add(pets.get(i));
            }
        }
        System.out.println("Only mouses: \n" + mouseList);

        // point 5
        List<Animal> newPets = new LinkedList<>();
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Mouse && pets.get(i + 1) instanceof Cat){
                newPets.add(pets.get(i));
                newPets.add(pets.get(i + 1));
                pets.remove(i);
                pets.remove(i--);
            }
        }
        System.out.println("Pets without some cats and all mouses: \n" + pets);
        System.out.println("Cats with mouses: \n" + newPets);

        // point 8
        LinkedList<Animal> sortedList = new LinkedList<>();
        for (Animal pet : pets) {
            if (pet instanceof Dog) sortedList.add(pet);
            else if (pet instanceof Cat) sortedList.addFirst(pet);
        }
        for (Animal newpet : newPets){
            if (newpet instanceof Cat) sortedList.addFirst(newpet);
            else if (newpet instanceof Mouse) sortedList.addLast(newpet);
        }
        System.out.println("sorted list:\n" + sortedList);

    }
}
