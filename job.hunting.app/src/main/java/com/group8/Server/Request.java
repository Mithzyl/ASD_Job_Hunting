package com.group8.Server;


import com.group8.Scheduler.RequestType;
import com.group8.User.User;

public class Request {
    public User requesterId;

    public RequestPayload payload;

    public RequestType requestType;

    private void updateDatabase(){}

    public void takeAction(Request request, String payload){}

    public void addToQueue(Request request){}

    public Request(User requesterId, RequestPayload payload, RequestType requestType) {
        this.requesterId = requesterId;
        this.payload = payload;
        this.requestType = requestType;
    }

    // constructor
    public Request() {
    }
}
