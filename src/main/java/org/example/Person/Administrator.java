package org.example.Person;

import org.example.Examination.MRIScan;

public class Administrator extends Person{
    public Administrator() {
        super("Administrator");
    }


    public void getAdminView(Patient patient){
        //getting relevent data and outputting to console
        String patientName = patient.getName();
        int tesla;
        String mriDate;
        String bpType;
        String bpDate;

        System.out.println("Patient: "+patientName+": MRI: "+tesla+" Tesla, "+mriDate+": BP: "+bpType+", "+bpDate);

    }
}
