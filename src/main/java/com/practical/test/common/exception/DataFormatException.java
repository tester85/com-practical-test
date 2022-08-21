package com.practical.test.common.exception;

public final class DataFormatException extends RuntimeException {

    public DataFormatException(String message) {
        super(message);
    }

    public DataFormatException(Throwable cause) {
        super(cause);
    }

    public DataFormatException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
