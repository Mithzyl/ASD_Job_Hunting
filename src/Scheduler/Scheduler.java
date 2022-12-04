package Scheduler;

import Job.JobAd;
import Server.Request;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private Timestamp timestamp;

    private List<ScheduledJobs> scheduledJobs;

    private void executeScheduleJob(){}

    private void loop(){}

    private void checkTime(){};

    private void handOverRequest(Request request){}

    public void receiveRequest(Request request){}


    // constructor
    public Scheduler() {
    }

    public Scheduler(Timestamp timestamp) {
        this.timestamp = timestamp;
        this.scheduledJobs = new ArrayList<>();
    }
}
