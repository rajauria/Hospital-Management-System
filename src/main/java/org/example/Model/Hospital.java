package org.example.Model;

import java.sql.SQLOutput;

public class Hospital {
    String hospitalName ;
    int totalBeds;

    int hospitalPhoneNumber ;

    String hospitalAddress ;

    public Hospital(String hospitalName, int totalBeds, String hospitalAddress, int hospitalPhoneNumber){
         this.hospitalName = hospitalName;
         this.hospitalAddress = hospitalAddress;
         this.totalBeds = totalBeds;
         this.hospitalPhoneNumber = hospitalPhoneNumber;
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

    }


}
