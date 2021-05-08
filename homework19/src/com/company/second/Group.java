package com.company.second;

public class Group {
    Student[] array;
    Course course;
    String startDate;
    int months;

    public Group() {

    }

    public Group(Student[] array, Course course, String startDate, int monthes) {
        this.array = array;
        this.course = course;
        this.startDate = startDate;
        this.months = monthes;
    }



    public Student[] getArray() {
        return array;
    }

    public void setArray(Student[] array) {
        this.array = array;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public String toString(){
        return " ";
    }

}
