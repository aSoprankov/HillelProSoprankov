package com.soprankov1.exception;

public class NumberOfRoundsException extends RuntimeException{

    public NumberOfRoundsException(String string) {
        System.err.println("Incorrect number of rounds. " + string + " - invalid.");
    }
}
