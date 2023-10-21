package org.example.Model;

import org.example.Database.DoctorDB;
import org.example.Database.PatientDB;
import org.example.Exception.WrongDoctorIDException;
import org.example.Exception.WrongPatientIDException;
import org.example.Model.Interfaces.Doctor;
import org.example.Model.Interfaces.Patients;

import java.sql.SQLOutput;

public class Hospital {
    String hospitalName ;
    int totalBeds;

    int hospitalPhoneNumber ;

    String hospitalAddress ;

    DoctorDB doctorDatabase;
    PatientDB patientDatabase;

    public Hospital(String hospitalName, int totalBeds, String hospitalAddress, int hospitalPhoneNumber){
         this.hospitalName = hospitalName;
         this.hospitalAddress = hospitalAddress;
         this.totalBeds = totalBeds;
         this.hospitalPhoneNumber = hospitalPhoneNumber;
         doctorDatabase = new DoctorDB();
         patientDatabase = new PatientDB();
    }

    public void getHospitalName (){
        System.out.println(hospitalName);
    }

    public void getTotalBeds (){
        System.out.println(totalBeds);
    }

    public void getHospitalAddress (){
        System.out.println(hospitalAddress);
    }

    public void getHospitalPhoneNumber (){
        System.out.println(hospitalPhoneNumber);
    }

    public void getTotalPatients (){
        System.out.println(patientDatabase.getTotalPatients());
    }

    public void getTotalDoctors (){
        System.out.println(doctorDatabase.getTotalDocs());
    }

    public void getPatientDetails (String patientID ) throws WrongPatientIDException {
        if (patientDatabase.patientDetails.containsKey(patientID)){
            Patients p = patientDatabase.getPatientByID (patientID);
            p.getMyDetails();
        }
        else {
            throw new WrongPatientIDException("Hey user this patient id does not exist in our DB");
        }

    }

    public void getDoctorDetails (String doctorID ) throws WrongDoctorIDException {
        if (doctorDatabase.docDetails.containsKey(doctorID)){
            Doctor d = doctorDatabase.getDoctorByID(doctorID);
            d.getMyDetails();
        }
        else {
            throw new WrongDoctorIDException("Doctor is not present in DB");
        }

    }

    public void admitPatient (String patientName , String patientIllness, int patientAge, String  gender){
        String patientID = "Patient" + (patientDatabase.getTotalPatients() + 1);
        Patients p = new OfflinePatients(patientID,patientName,patientIllness,patientAge,gender,1);
        patientDatabase.addPatient(p);
        Doctor d = doctorDatabase.assignPatientToDoctor(p);

        System.out.println("Patient  " + p.getPatientName() + " got admitted with patient id " + p.patientID());
        System.out.println(p.getPatientName() + " got assigned to Doctor " + d.doctorName() +" whose doctor ID is " + d.docID());
    }

    public void addDoctor (String doctorName, String doctorDegree, int doctorAge , String doctorSpecialisation ){
            int totalDocTillNow = doctorDatabase.getTotalDocs();
            String docID = "HSP" + (totalDocTillNow + 1);
            Doctor doc = new OfflineDoctor(doctorName,doctorDegree,doctorAge,doctorSpecialisation,docID);
            doctorDatabase.addDoctorToDB(doc);
    }


}
