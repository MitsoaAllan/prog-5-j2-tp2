package com.app.rent.exception;

public class NotAvailableException extends  RuntimeException {
    public NotAvailableException(String message) {
        super(message);
    }
}
