package Cloneable;

import java.util.ArrayList;

public class Cohort {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Mentor>mentors = new ArrayList<>();

    public Cohort(String name){
        this.name = name;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Mentor> mentors = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }
    public void info(){
        System.out.println("The name cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
