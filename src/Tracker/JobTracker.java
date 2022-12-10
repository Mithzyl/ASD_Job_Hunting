package Tracker;

import Job.JobAd;
import Job.JobState;
import Matcher.Matcher;

import java.util.ArrayList;
import java.util.List;

public class JobTracker {
    private static JobTracker single_instance = null;

    private List<JobAd> jobs;

    public List<Integer> listCompletedJob(String userId) {
        return new ArrayList<>();
    }

    public List<Integer> listUnassignedJob(String userId) {
        return new ArrayList<>();
    }

    public void addNewJob(JobAd jobAd) {
        jobs.add(jobAd);
    }

    public void updateJobStatus(JobState jobState) {
    }


    // constructor
    public JobTracker() {
        jobs = new ArrayList<>();
    }

    public static JobTracker getInstance() {
        if (single_instance == null)
            single_instance = new JobTracker();
        return single_instance;
    }
}
