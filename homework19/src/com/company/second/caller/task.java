package com.company.second.caller;

import com.company.second.studyProgram.Course;
import com.company.second.studentsInfo.Group;
import com.company.second.studyProgram.Lesson;
import com.company.second.studentsInfo.Student;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
        Course english = new Course();
        english.setName("English course");
        english.setID("id-1314");
        english.setDate("01.01.21");
        english.setMentorsName("Ahmed");
        // System.out.println("Course name: " + english.getName() + "\nCourse ID: " + english.getID() + "\nDate: " + english.getDate() + "\nMentor: " + english.getMentorsName());
        Student student1 = new Student();
        student1.setName("Alina");
        student1.setSurname("Atakishieva");
        student1.setBirthDate("13.09.1999");
        student1.setAge(21);
        student1.setMale(false);
        //System.out.println("Student fullname: " + student1.getName() + " " + student1.getSurname() + "\nDate of birth: " + student1.getBirthDate() + "\nAge: " + student1.getAge() + "\nIs male? " + student1.isMale());
        Student student2 = new Student();
        student2.setName("Timur");
        student2.setSurname("Atakishiev");
        student2.setBirthDate("25.05.1993");
        student2.setAge(28);
        student2.setMale(true);
        //System.out.println("Student fullname: " + student2.getName() + " " + student2.getSurname() + "\nDate of birth: " + student2.getBirthDate() + "\nAge: " + student2.getAge() + "\nIs male? " + student2.isMale());


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

        Lesson lesson = new Lesson();
        lesson.setLessonDate("08.05.2021");
        lesson.setHere(students);
        lesson.setLessonStartTime("19:00");
        lesson.setWasHomework(true);
        lesson.setWasExam(false);

        //System.out.println("Students array: " + Arrays.toString(group.getArray()) + "\nCourse: " + group.getCourse() + "\nStarts: " + group.getStartDate() + "\nDuration: " + group.getMonths() + " months");
        // System.out.println("Students array: " + Arrays.toString(students) + "\nCourse: " + english + "\nStarts: " + group.getStartDate() + "\nDuration: " + group.getMonths() + " months");

        System.out.println("- I am " + student1.getName() + " " + student1.getSurname() + ", " + student1.getAge() + " years old. I am participating " + english.getName() + ". The duration of this course is " + group.getMonths());
        System.out.println("- the mentor`s name is " + english.getMentorsName() + ". ");
        System.out.println("In our group there are 2 students " + Arrays.toString(group.getArray()));
        System.out.println("Today " + lesson.getLessonDate() + " at " + lesson.getLessonStartTime() + " we had a lesson.");
        System.out.println("Was there a homework for us? " + lesson.isWasHomework() +"\nWas Ahmed prepared an exam for us? " + lesson.isWasExam());

    }

    public static void separate() {
        System.out.println("================================");
    }
}
