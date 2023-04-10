package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;

public class ErrorDetails {

    private LocalDate timeStamp;
    private String message;
    private String Details;

    public ErrorDetails(LocalDate timeStamp, String message, String details) {
        this.timeStamp = timeStamp;
        this.message = message;
        Details = details;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    @Override
    public String toString() {
        return "ErrorDetails{" +
                "timeStamp=" + timeStamp +
                ", message='" + message + '\'' +
                ", Details='" + Details + '\'' +
                '}';
    }
}