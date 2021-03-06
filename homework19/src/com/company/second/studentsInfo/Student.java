package com.company.second.studentsInfo;

public class Student {
    private String birthDate;
    private String surname;
    private String name;
    private boolean isMale;
    private int age;

    public Student() {

    }

    public Student(String birthDate, String surname, String name, boolean isMale, int age) {
        this.birthDate = birthDate;
        this.surname = surname;
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }



    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Error!");
        }
        else {
            this.age = age;
        }
    }
    @Override
    public String toString (){
        return  "Fullname: " + surname + " " + name + "\nDate of birth: " + birthDate + "\nIs male? " + isMale + "\nAge: " + age + "\n";
    }


}
