package Server;

import User.User;

public class Request<T> {
    public User requesterId;

    public T request;

    public String payload;

    private void updateDatabase(){}

    public void takeAction(Request request, String payload){}

    public void addToQueue(Request request){}

    // constructor
    public Request() {
    }
}
