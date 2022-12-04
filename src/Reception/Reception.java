package Reception;

import Server.Request;

import java.util.Queue;

public class Reception {
    private String dbUrl;

    private Queue<Request> requests;

    private void updateDatabase(){}

    public void takeAction(Request request, String payload){}

    public void addToQueue(Request request){}


    // constructor
    public Reception() {
    }
}
