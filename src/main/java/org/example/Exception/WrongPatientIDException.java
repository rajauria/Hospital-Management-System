package org.example.Exception;

public class WrongPatientIDException extends Exception{
    public WrongPatientIDException (String message){
        super (message);
    }
}
