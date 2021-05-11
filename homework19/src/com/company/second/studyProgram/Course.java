package com.company.second.studyProgram;

public class Course {
    private String name;
    private String ID;
    private String mentorsName;
    private String date;

    public Course() {

    }

    public Course(String name, String ID, String date, String mentorsName) {
        this.name = name;
        this.ID = ID;
        this.date = date;
        this.mentorsName = mentorsName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMentorsName() {
        return mentorsName;
    }

    public void setMentorsName(String mentorsName) {
        this.mentorsName = mentorsName;
    }

    @Override
    public String toString() {
        return "Name of the course: " + name + "\nID: " + ID + "\nDate: " + date + "\nMentor is: " + mentorsName;
    }

}
