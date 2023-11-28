package org.example.Person;

import java.net.URL;

public class Doctor extends Person{
    public Doctor() {
        super("Doctor");
    }

    //unfinished Doctor view, set as void for now
    public void getDoctorView(Patient patient) {
        URL photo = patient.getPhoto();
        String name = patient.getName();
        int age = patient.getAge();
        URL mriImage = patient.getMRIData().getImageURL();
        int systolic = patient.getBPData().getSystolicPressure();
        int diastolic = patient.getBPData().getDiastolicPressure();

        //set up JPanel for doctor view here, formatted photos and text
    }
}
