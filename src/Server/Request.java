package Server;

import Scheduler.RequestType;
import User.User;

public class Request<T> {
    public User requesterId;

    public T request;

    public String payload;

    public RequestType requestType;


    private void updateDatabase(){}

    public void takeAction(Request request, String payload){}

    public void addToQueue(Request request){}

    // constructor
    public Request() {
    }
}
