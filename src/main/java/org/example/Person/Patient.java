package org.example.Person;

import org.example.Examination.BPMeasurement;
import org.example.Examination.Examination;
import org.example.Examination.MRIScan;

import java.net.URL;
import java.util.ArrayList;

public class Patient extends Person{
    private String name;
    private URL urlOfPhoto;
    private static int age;
    public ArrayList<Examination> examinations = new ArrayList<Examination>();

    public Patient(String name, URL url, int age) {
        super("Patient");
        this.name = name;
        this.urlOfPhoto = url;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public URL getPhoto(){
        return urlOfPhoto;
    }

    //add examinations method
    public void addExamination(Examination exam) {
        examinations.add(exam);
    }

    public MRIScan getMRIData() {
        for (Examination exam : examinations) {
            if (exam instanceof MRIScan) {
                return (MRIScan) exam;
            }
        }
        return null;
    }

    public BPMeasurement getBPData() {
        for (Examination exam : examinations) {
            if (exam instanceof BPMeasurement) {
                return (BPMeasurement) exam;
            }
        }
        return null;
    }



}
