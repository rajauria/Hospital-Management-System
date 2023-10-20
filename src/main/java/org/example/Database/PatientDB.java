package org.example.Database;

import org.example.Model.Interfaces.Patients;

import java.util.HashMap;

public class PatientDB  {
    HashMap < String, Patients> patientDetails ;

    public PatientDB (){
        patientDetails = new HashMap<>();

    }

    public Patients getPatient (String patientID){
        return patientDetails.get (patientID);

    }

    public void addPatient (Patients p){
        String pID = p.patientID();
        patientDetails.put (pID,p);
    }
}
