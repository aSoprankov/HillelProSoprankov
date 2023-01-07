package com.soprankov1.exception;

public class InputFormatException extends RuntimeException{
    public InputFormatException() {
        System.err.println("Enter the correct character.");
    }
}
