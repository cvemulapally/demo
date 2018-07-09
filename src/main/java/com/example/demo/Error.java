package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

public class Error {
    private String message;
    private String description;

    public Error() {
    }

    public Error(String message, String description) {
        this.message = message;
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
