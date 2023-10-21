package org.example;

import org.example.Exception.WrongDoctorIDException;
import org.example.Exception.WrongPatientIDException;
import org.example.Model.Hospital;

public class Main {
    public static void main(String[] args) throws WrongPatientIDException, WrongDoctorIDException {
        Hospital aiims = new Hospital("Aiims", 1000,"New Delhi", 123456);

        aiims.addDoctor("Ashish","MBBS",34, "Cardiology");
        aiims.addDoctor("Himanshu","MD",45, "Oncology");

        aiims.getHospitalName();
        aiims.getHospitalAddress();
        aiims.getTotalBeds();
        aiims.getDoctorDetails("HSP1");
        aiims.getTotalPatients();

        aiims.admitPatient("Heena", "Fever", 27, "Female");
        aiims.admitPatient("Nakul", "Fever", 26, "Male");

        aiims.getTotalPatients();

        aiims.getPatientDetails("Patient1");
        aiims.getPatientDetails("Patient5");




    }
}