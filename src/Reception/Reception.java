package Reception;

import Scheduler.RequestType;
import Server.Request;

import java.util.Queue;

public class Reception {
    private static Reception single_instance = null;
    private String dbUrl;

    private Queue<Request> requests;

    private void updateDatabase() {
    }

    public void takeAction(Request request, String payload) {
    }

    public void addToQueue(Request request) {
        if (request.requestType == RequestType.DATABASE) {
            // contact database connector
        }
    }


    // constructor
    private Reception() {
    }

    public static Reception getInstance() {
        if (single_instance == null)
            single_instance = new Reception();
        return single_instance;
    }
}
