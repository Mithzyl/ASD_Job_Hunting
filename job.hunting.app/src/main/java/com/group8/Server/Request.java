package Server;

import Scheduler.RequestType;
import User.User;

public class Request {
    public User requesterId;

    public RequestPayload payload;

    public RequestType requestType;

    private void updateDatabase(){}

    public void takeAction(Request request, String payload){}

    public void addToQueue(Request request){}

    // constructor
    public Request() {
    }
}
