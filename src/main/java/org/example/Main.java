package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

import org.example.Examination.MRIScan;
import org.example.Examination.BPMeasurement;
import org.example.Person.Administrator;
import org.example.Person.Doctor;
import org.example.Person.Patient;

public class Main {
    public static void main(String[] args) {

        //instantiating, with try/catch on URL
        Patient patient1 = null;
        try {
            patient1 = new Patient("Daphne Von Oram", new URL("https://martinh.netfirms.com/BIOE60010/mri1.jpg"), 62);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try {
            patient1.addExamination(new MRIScan(LocalDate.of(2023,9,14), new URL("https://martinh.netfirms.com/BIE60010/mri1.jpg"), 2));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        patient1.addExamination(new BPMeasurement(LocalDate.of(2023,9,15), 130, 70, "ST"));

        Patient patient2 = null;
        try {
            patient2 = new Patient("Sebastian Compton", new URL("https://martinh.netfirms.com/BIOE60010/mri2.jpg"), 31);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try {
            patient2.addExamination(new MRIScan(LocalDate.of(2023,11,19), new URL("https://martinh.netfirms.com/BIE60010/mri2.jpg"), 4));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        patient2.addExamination(new BPMeasurement(LocalDate.of(2023,11,20),150,80,"VST"));

        Doctor doctor1 = new Doctor();
        Administrator admin1 = new Administrator();

    }


}