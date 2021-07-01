package com.example.webapp.myClasses;

import org.springframework.beans.factory.annotation.Autowired;


public class ResponseTransfer {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ResponseTransfer(String text) {
        this.text = text;
    }
}
