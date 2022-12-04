package Tracker;

import Job.JobAd;
import Job.JobState;

import java.util.ArrayList;
import java.util.List;

public class JobTracker {
    private List<JobAd> jobs;

    public List<Integer> listCompletedJob(String userId){
        return new ArrayList<>();
    }

    public List<Integer> listUnassignedJob(String userId){
        return new ArrayList<>();
    }

    public void addNewJob(JobAd jobAd){}

    public void updateJobStatus(JobState jobState){}


    // constructor
    public JobTracker() {

    }
}
