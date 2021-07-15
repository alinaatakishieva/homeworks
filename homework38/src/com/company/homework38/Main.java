package com.company.homework38;

import com.company.homework38.taskA.TrenersListDB;
import com.company.homework38.taskB.StudentsDB;
import com.company.homework38.taskC.CountriesCitiesDB;

public class Main {

    public static void main(String[] args) {
        //Task A
        TrenersListDB trenersList = new TrenersListDB();
        trenersList.getTrenersNameWithSalary();
        separate();
        System.out.println("Total sum of salaries is = " + trenersList.getTrenersSalarySum());
        separate();
        trenersList.addMolodecToTrenersName();
        separate();

        //TaskB
        StudentsDB studentsDB = new StudentsDB();
        System.out.println("There are " + studentsDB.getStudentsCount() + " students in a group");
        separate();
        studentsDB.getGroupsName();

        //TaskC
        CountriesCitiesDB countriesCitiesDB = new CountriesCitiesDB();
        countriesCitiesDB.getCountriesCitiesNamesWithK();
        separate();
        countriesCitiesDB.getTotalCitiesPopulation();
        separate();
        countriesCitiesDB.getAbilityToAddOfficialLanguage();
    }

    public static void separate() {
        System.out.println("----------------------");
    }
}
