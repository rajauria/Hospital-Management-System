package org.example.Database;

import org.example.Model.Interfaces.Patients;

import java.util.HashMap;

public class PatientDB  {
    public HashMap < String, Patients> patientDetails ;

    public PatientDB (){
        patientDetails = new HashMap<>();

    }

    public Patients getPatientByID (String patientID){
        return patientDetails.get (patientID);
    }

    public int getTotalPatients (){
        return patientDetails.size();
    }


    public Patients getPatient (String patientID){
        return patientDetails.get (patientID);

    }

    public void addPatient (Patients p){
        String pID = p.patientID();
        patientDetails.put (pID,p);
    }
}
