package org.example;

import org.example.Model.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital aiims = new Hospital("Aiims", 1000,"New Delhi", 123456);

        aiims.getTotalBeds();
        aiims.getHospitalAddress();

    }
}