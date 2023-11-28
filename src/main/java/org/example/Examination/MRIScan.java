package org.example.Examination;

import java.net.URL;
import java.time.LocalDate;

public class MRIScan extends Examination{
    private URL imageURL;
    private int fieldStrength;
    public MRIScan(LocalDate date, URL imageURL, int fieldStrength) {
        //specific for MRI scan
        super("MRI", date);
        this.imageURL = imageURL;
        this.fieldStrength = fieldStrength;
    }

    public URL getImageURL() {
        return imageURL;
    }
    public int getFieldStrength(){
        return fieldStrength;
    }
    public String getDate(){
        return date.toString();
    }

}
