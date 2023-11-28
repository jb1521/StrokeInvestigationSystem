package org.example.Person;

import org.example.Examination.Examination;

import java.net.URL;
import java.util.ArrayList;

public class Patient extends Person{
    private String name;
    private URL urlToPicture;
    private static int age;
    public ArrayList<Examination> examination = new ArrayList<Examination>();

    public Patient(String name, URL url, int age) {
        super("Patient");
        this.name = name;
        this.urlToPicture = url;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public static int getAge(){
        return age;
    }

    public void addExamination(Examination exam) {
        examination.add(exam);
    }


}
