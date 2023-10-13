package org.example.Database;

import org.example.Model.Interfaces.Doctor;
import org.example.Model.Interfaces.Patients;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDB {
    HashMap<String, Doctor> docDetails;

    HashMap <String, ArrayList<Patients>> docVsPatient ;
    public DoctorDB (){
        docDetails = new HashMap<>();
        docVsPatient = new HashMap<>();

    }

    public int getTotalDocs (){
        return docDetails.size();
    }

    public ArrayList<Patients> getAssignedPatients (String docID){
        return docVsPatient.get (docID);
    }

    public Doctor assignPatientToDoctor (Patients p){
        String docID = "";
        int min = Integer.MAX_VALUE;
        for (String docIDs : docVsPatient.keySet()){
            if (min > docVsPatient.get(docIDs).size()){
                min = docVsPatient.get(docIDs).size();
                docID= docIDs;
            }
        }
        ArrayList<Patients> allPatients = docVsPatient.get (docID);
        allPatients.add (p);

        return docDetails.get(docID);
    }

    public void addDoctorToDB (Doctor d){
        String docID = d.docID();
        docDetails.put (docID,d);
        docVsPatient.put (docID, new ArrayList <> ());
        System.out.println("New doctor ended in database with doctor id " + docID);

    }



}
