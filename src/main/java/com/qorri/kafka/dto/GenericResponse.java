package com.qorri.kafka.dto;

public class GenericResponse {
    private String status;
    private int code;
    private String message;
    private String data;

    public GenericResponse(String status, int code, String message, String data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // Getter and Setter
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
