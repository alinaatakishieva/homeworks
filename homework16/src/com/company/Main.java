package com.company;

public class Main {

    public static void main(String[] args) {
        Parrot kesha = new Parrot();
        kesha.setAnimal("Parrot");
        kesha.setName("Kesha");
        kesha.setAge(0);
        kesha.setColor("Green");
        kesha.setBreed("Ara");
        kesha.setTalk(true);

        System.out.println("Animal: " + kesha.getAnimal() + "\nName: " + kesha.getName() + "\nAge: " + kesha.getAge() + "\nColor: " + kesha.getColor() + "\nBreed: " + kesha.getBreed() + "\nIs it talk? " + kesha.isTalk);

        separate();

        Parrot popka = new Parrot();
        popka.setAnimal("Parrot");
        popka.setName("Popka");
        popka.setColor("red");
        popka.setAge(3);
        popka.setBreed("Kakadu");
        popka.setTalk(false);

        System.out.println("Animal: " + popka.getAnimal() + "\nName: " + popka.getName() + "\nAge: " + popka.getAge() + "\nColor: " + popka.getColor() + "\nBreed: " + popka.getBreed() + "\nIs it talk? " + popka.isTalk);

        separate();

        Dog bobik = new Dog();
        bobik.setAnimal("Dog");
        bobik.setName("Bobik");
        bobik.setAge(4);
        bobik.setColor("black");
        bobik.setBreed("Pitbul");
        bobik.setMale(true);
        bobik.setWatchdog(true);

        System.out.println("Animal: " + bobik.getAnimal() + "\nName: " + bobik.getName() + "\nAge: " + bobik.getAge() + "\nColor: " + bobik.getColor() + "\nBreed: " + bobik.getBreed() + "\nIs it a watchdog? " + bobik.isWatchdog() + "\nIs it a male? " + bobik.isMale());

        separate();

        Dog monika = new Dog();
        monika.setAnimal("Dog");
        monika.setName("Monika");
        monika.setAge(6);
        monika.setColor("Brown");
        monika.setBreed("Shpic");
        monika.setWatchdog(false);
        monika.setMale(false);

        System.out.println("Animal: " + monika.getAnimal() + "\nName: " + monika.getName() + "\nAge: " + monika.getAge() + "\nColor: " + monika.getColor() + "\nBreed: " + monika.getBreed() + "\nIs it a watchdog? " + monika.isWatchdog() + "\nIs it a male? " + monika.isMale());

        separate();

        Cat musya = new Cat();
        musya.setAnimal("Cat");
        musya.setName("Musya");
        musya.setAge(2);
        musya.setBreed("Egiptian cat");
        musya.setColor("Camel");
        musya.setLivingAtHome(true);

        System.out.println("Animal: " + musya.getAnimal() + "\nName: " + musya.getName() + "\nAge: " + musya.getAge() + "\nColor: " + musya.getColor() + "\nBreed: " + musya.getBreed() + "\nIs it a pet? " + musya.isLivingAtHome());

        separate();

        Cat barsik = new Cat();
        barsik.setAnimal("Cat");
        barsik.setName("Barsik");
        barsik.setAge(4);
        barsik.setBreed("Abyssinian Cat");
        barsik.setColor("redhead");
        barsik.setLivingAtHome(true);

        System.out.println("Animal: " + barsik.getAnimal() + "\nName: " + barsik.getName() + "\nAge: " + barsik.getAge() + "\nColor: " + barsik.getColor() + "\nBreed: " + barsik.getBreed() + "\nIs it a pet? " + barsik.isLivingAtHome());

        separate();

        Fish dory = new Fish();
        dory.setAnimal("Fish");
        dory.setName("Dory");
        dory.setColor("Blue");
        dory.setAge(2);
        dory.setBreed("Regal Tang");
        dory.setAquarium(false);

        System.out.println("Animal: " + dory.getAnimal() + "\nName: " + dory.getName() + "\nColor: " + dory.getColor() + "\nAge: " + dory.getAge() + "\nBreed: " + dory.getBreed() + "\nIs it aquarium fish? " + dory.isAquarium());
    }

    public static void separate() {
        System.out.println("===============================");
    }
}
