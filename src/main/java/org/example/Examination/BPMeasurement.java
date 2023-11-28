package org.example.Examination;

import java.time.LocalDate;

public class BPMeasurement extends Examination{
    private int systolicPressure;
    private int diastolicPressure;
    private String duration;
    public BPMeasurement(LocalDate date, int systolicPressure, int diastolicPressure, String duration) {
        //specific for BP examination
        super("BP", date);
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.duration = duration;
    }

    public String getDate(){
        return date.toString();
    }
    public int getSystolicPressure(){
        return systolicPressure;
    }
    public int getDiastolicPressure(){
        return diastolicPressure;
    }
    public String getDuration(){
        return duration;
    }
}
