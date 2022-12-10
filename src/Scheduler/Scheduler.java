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

    private List<ScheduledJob> scheduledJobs;

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
        if (request.requestType == RequestType.SCHEDULER) {
            ScheduledJob scheduledJob = new ScheduledJob();
            this.scheduledJobs.add(scheduledJob);
        }
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
