package com.example.demo.bms.exceptions;

public class InvalidUser extends Exception{

    public InvalidUser() {
    }

    public InvalidUser(String message) {
        super(message);
    }
}
