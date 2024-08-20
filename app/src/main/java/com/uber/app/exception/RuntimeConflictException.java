package com.uber.app.exception;

public class RuntimeConflictException extends RuntimeException {
    public RuntimeConflictException(String message) {
        super(message);
    }

    public RuntimeConflictException() {
        super();
    }
}
