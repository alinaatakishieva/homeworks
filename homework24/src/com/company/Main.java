package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        City city1 = new City("Alina", "Bishkek", 169.9, 1055800, new District[7]); // creating new City(class) objects
        City city2 = new City("Nargiza", "Osh", 169.9, 1055900, new District[4]);
        City city3 = new City("Aidana", "Naryn", 90, 30000, new District[3]);


	    Village village1 = new Village("Kolya", "Nooken", 76, 3000); //creating new Village (class) objects
	    Village village2 = new Village("Katya", "prostakvashino", 45, 500);


        City[] cities = {city1, city2, city3}; // array of cities to use it for searching adviser
        Village[] villages = {village1, village2};

        Scanner scan = new Scanner(System.in);//user will enter adviser`s name to search
        System.out.println("Enter adviser`s name!");
        String searchAdviser = scan.next();
        for (City city : cities) { // for each loop, use to search at every city.
            if (searchAdviser.equals(city.getAdviser())) { // equals use to compare the values of two Strings
                System.out.println(city.getName()); // if the values will be equal or the same, print the name of the city
                break; // break searching if will found
            } else System.out.println("there is no " + searchAdviser + " in city " + city.getName()); // if the values will ot be equal, print there is no such adviser
        }

        for (Village village : villages) { // for each loop, use to search at every village.
            if (searchAdviser.equals(village.getAdviser())) { // equals use to compare the values of two Strings
                System.out.println(village.getName()); // if the values will be equal or the same, print the name of the village
                break; // break searching if will found
            } else System.out.println("there is no " + searchAdviser + " in village " + village.getName()); // if the values will ot be equal, print there is no such adviser
        }
    }
}
