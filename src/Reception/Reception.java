package Reception;

import Database.DatabaseConnector;
import Scheduler.RequestType;
import Server.Request;

import java.util.LinkedList;
import java.util.Queue;

public class Reception {
    private static Reception single_instance = null;
    private DatabaseConnector dbConnector;

    private Queue<Request> requests;

    private void updateDatabase() {
    }

    public void takeAction(Request request) {
        if (request.requestType == RequestType.DATABASE) {
            // contact database connector
            updateDatabase();
        }
        if (request.requestType == RequestType.SCHEDULER) {
            // contact scheduler
        }
        if (request.requestType == RequestType.MATHCER) {
            // contact matcher
        }
        if (request.requestType == RequestType.JOBPROVIDER) {
            // contact jobprovider
        }
        if (request.requestType == RequestType.JOBSEEKER) {
            // contact jobseeker
        }
    }

    public void addToQueue(Request request) {
        requests.add(request);
    }


    // constructor
    private Reception() {
        requests = new LinkedList<>();
        dbConnector=new DatabaseConnector("connection", "url", "loginUser", "loginPassword");
    }

    public static Reception getInstance() {
        if (single_instance == null)
            single_instance = new Reception();
        return single_instance;
    }
}
