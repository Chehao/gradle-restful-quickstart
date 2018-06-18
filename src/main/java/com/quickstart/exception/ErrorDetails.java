package com.quickstart.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorDetails {


    private Date timestamp;
    private String message;
    private String details;

    private HttpStatus status;

    public ErrorDetails(Date timestamp, String message, String details, HttpStatus status) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
