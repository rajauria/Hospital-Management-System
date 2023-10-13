package org.example.Model;

import org.example.Model.Interfaces.Doctor;

public class OfflineDoctor implements Doctor {


    String doctorID ;

    String doctorName;
    String doctorDegree;
    int doctorAge ;
    String doctorSpecialisation;


    OfflineDoctor (String doctorName, String doctorDegree, int doctorAge , String doctorSpecialisation, String doctorID ){
        this.doctorAge = doctorAge;
        this.doctorDegree = doctorDegree;
        this.doctorSpecialisation = doctorSpecialisation;
        this.doctorName = doctorName;
        this.doctorID = doctorID;
    }

    @Override
    public void diagnosis() {
        System.out.println("Doing Diagnosis offline");
    }

    @Override
    public void getMyPatients() {

    }

    @Override
    public void getMyDetails() {
        System.out.println("Hey i am Doctor" + doctorName);
        System.out.println("My doc degree is " + doctorDegree);
        System.out.println("My age is " + doctorAge);
        System.out.println("with specialisation in " + doctorSpecialisation);
    }
}
