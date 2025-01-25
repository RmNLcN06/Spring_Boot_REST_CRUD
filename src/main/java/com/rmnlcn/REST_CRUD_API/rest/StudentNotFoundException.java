package com.rmnlcn.REST_CRUD_API.rest;

public class StudentNotFoundException extends RuntimeException {

    // generate constructors from Superclass
    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
