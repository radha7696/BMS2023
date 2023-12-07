package com.example.demo.bms.exceptions;

public class SeatsAlreadyBookedException extends Exception{
    public SeatsAlreadyBookedException() {
    }

    public SeatsAlreadyBookedException(String message) {
        super(message);
    }
}
