package org.example.Model;

import org.example.Database.DoctorDB;
import org.example.Database.PatientDB;
import org.example.Model.Interfaces.Doctor;

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

    }

    public void getTotalDoctors (){

    }

    public void getPatientDetails (String patientID  ){

    }

    public void getDoctorDetails (String doctorID  ){

    }

    public void admitPatient (String patientName , String patientIllness, int patientAge, String  gender){

    }

    public void addDoctor (String doctorName, String doctorDegree, int doctorAge , String doctorSpecialisation ){
            int totalDocTillNow = doctorDatabase.getTotalDocs();
            String docID = "HSP" + (totalDocTillNow + 1);
            Doctor doc = new OfflineDoctor(doctorName,doctorDegree,doctorAge,doctorSpecialisation,docID);
            doctorDatabase.addDoctorToDB(doc);
    }


}
