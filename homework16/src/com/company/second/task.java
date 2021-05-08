package com.company.second;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
        Course english = new Course();
        english.setName("English course");
        english.setID("id-1314");
        english.setDate("01.01.21");
        english.setMentorsName("Ahmed");

        System.out.println("Course name: " + english.getName() + "\nCourse ID: " + english.getID() + "\nDate: " + english.getDate() + "\nMentor: " + english.getMentorsName());

        separate();

        Student student1 = new Student();
        student1.setName("Alina");
        student1.setSurname("Atakishieva");
        student1.setBirthDate("13.09.1999");
        student1.setAge(21);
        student1.setMale(false);

        System.out.println("Student fullname: " + student1.getName() + " " + student1.getSurname() + "\nDate of birth: " + student1.getBirthDate() + "\nAge: " + student1.getAge() + "\nIs male? " + student1.isMale());

        separate();

        Student student2 = new Student();
        student2.setName("Timur");
        student2.setSurname("Atakishiev");
        student2.setBirthDate("25.05.1993");
        student2.setAge(28);
        student2.setMale(true);

        System.out.println("Student fullname: " + student2.getName() + " " + student2.getSurname() + "\nDate of birth: " + student2.getBirthDate() + "\nAge: " + student2.getAge() + "\nIs male? " + student2.isMale());

        separate();

//        Group group = new Group();
//        Student[] students = {student1, student2};
//        Course course = english;
//        group.setStartDate("1.01.22");
//        group.setMonths(5);

        Group group = new Group();
        Student[] students = {student1, student2};
        group.setArray(students);
        group.setCourse(english);
        group.setStartDate("1.01.22");
        group.setMonths(5);

        System.out.println("Students array: " + Arrays.toString(group.getArray()) + "\nCourse: " + group.getCourse() + "\nStarts: " + group.getStartDate() + "\nDuration: " + group.getMonths() + " months");
        separate();
        System.out.println("Students array: " + Arrays.toString(students) + "\nCourse: " + english + "\nStarts: " + group.getStartDate() + "\nDuration: " + group.getMonths() + " months");
    }

    public static void separate() {
        System.out.println("================================");
    }
}
