package com.example.bruteforce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int responseCode;

    private String responseMessage;

    private String requestBody;

    private String url;

    public Request() {
    }

    public Request(int responseCode, String responseMessage, String requestBody, String url) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.requestBody = requestBody;
        this.url = url;
    }

    public Request(long id, int responseCode, String responseMessage, String requestBody, String url) {
        this.id = id;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.requestBody = requestBody;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
