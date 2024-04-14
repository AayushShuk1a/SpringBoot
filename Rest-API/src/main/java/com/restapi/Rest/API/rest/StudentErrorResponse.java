package com.restapi.Rest.API.rest;

public class StudentErrorResponse {

    public int status;
    public String message;
    public Long timeStamps;


    public StudentErrorResponse(){

    }

    public StudentErrorResponse(int status, String message, Long timeStamps) {
        this.status = status;
        this.message = message;
        this.timeStamps = timeStamps;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(Long timeStamps) {
        this.timeStamps = timeStamps;
    }



}
