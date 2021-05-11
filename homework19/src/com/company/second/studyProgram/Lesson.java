package com.company.second.studyProgram;

import com.company.second.studentsInfo.Student;

public class Lesson {
    private String lessonDate;
    private Student[] here;
    private Course course;
    private String lessonStartTime;
    private boolean wasHomework;
    private boolean wasExam;

    public String getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Student[] getHere() {
        return here;
    }

    public void setHere(Student[] here) {
        this.here = here;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getLessonStartTime() {
        return lessonStartTime;
    }

    public void setLessonStartTime(String lessonStartTime) {
        this.lessonStartTime = lessonStartTime;
    }

    public boolean isWasHomework() {
        return wasHomework;
    }

    public void setWasHomework(boolean wasHomework) {
        this.wasHomework = wasHomework;
    }

    public boolean isWasExam() {
        return wasExam;
    }

    public void setWasExam(boolean wasExam) {
        this.wasExam = wasExam;
    }


    public Lesson(){

    }

    public Lesson(String lessonDate, Student[] here, Course course, String lessonStartTime, boolean wasHomework, boolean wasExam) {
        this.lessonDate = lessonDate;
        this.here = here;
        this.course = course;
        this.lessonStartTime = lessonStartTime;
        this.wasHomework = wasHomework;
        this.wasExam = wasExam;
    }

    @Override
    public String toString(){
        return " ";
    }
}
