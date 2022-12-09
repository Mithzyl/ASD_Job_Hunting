package Scheduler;

import Job.JobAd;
import Reception.Reception;
import Server.Request;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private static Scheduler single_instance = null;

    private Timestamp timestamp;

    private List<ScheduledJobs> scheduledJobs;

    private void executeScheduleJob() {
    }

    private void loop() {
    }

    private void checkTime() {
    }

    ;

    private void handOverRequest(Request request) {
    }

    public void receiveRequest(Request request) {
    }


    // constructor
    private Scheduler() {
        this.timestamp = timestamp;
        this.scheduledJobs = new ArrayList<>();
    }

    public static Scheduler getInstance() {
        if (single_instance == null)
            single_instance = new Scheduler();
        return single_instance;
    }

}
