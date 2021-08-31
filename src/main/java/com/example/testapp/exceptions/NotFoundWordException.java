package com.example.testapp.exceptions;

public class NotFoundWordException extends Exception {

    private String message;

    public NotFoundWordException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
