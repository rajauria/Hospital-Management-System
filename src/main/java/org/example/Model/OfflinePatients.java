package org.example.Model;

import org.example.Model.Interfaces.Patients;

public class OfflinePatients implements Patients {

    String patientID;
    String patientName ;
    String patientIllness ;
    int patientAge ;
    String gender ;

    int bedNumber ;


    OfflinePatients (String patientName , String patientIllness, int patientAge, String  gender, String patientID){
        this.patientAge = patientAge;
        this.patientName = patientName;
        this.patientIllness = patientIllness;
        this.gender = gender;
        this.patientID   = patientID;

    }
    @Override
    public void getMyDetails() {
        System.out.println("Hey i am Patient" + patientName);
        System.out.println("having illness " + patientIllness);
        System.out.println("My age is " + patientAge);
        System.out.println("My patient id is" + patientID );
        System.out.println("My bed no is" + bedNumber );

    }

    @Override
    public void getMyBedNumber() {
        System.out.println(bedNumber);
    }

    @Override
    public void assignMeDoctor() {

    }
}
