package org.example.Examination;

import java.time.LocalDate;

public abstract class Examination {

    //common between examinations
    protected String type;
    protected LocalDate date;


    public Examination(String type, LocalDate date) {
        this.type = type;
        this.date = date;
    }

}
