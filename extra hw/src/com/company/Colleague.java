package com.company;

public class Colleague extends Person {
    private String position;
    private int salary;
    private int prize;
    private int penalty;
    private int experience;
    private int vacationDays;

    public Colleague() {

    }

    public Colleague(String position, int salary, int prize, int penalty, int experience, int vacationDays) {
        this.position = position;
        this.salary = salary;
        this.prize = prize;
        this.penalty = penalty;
        this.experience = experience;
        this.vacationDays = vacationDays;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }


    public void goToWork() {
        System.out.println("Na rabote");
    }

    public void goToVocation() {
        System.out.println("Ura otpusk!");
    }

    public String toBeLate() {
        return "i`m late!";
    }


}
