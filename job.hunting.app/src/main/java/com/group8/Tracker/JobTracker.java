package com.group8.Tracker;


import com.group8.Job.JobAd;
import com.group8.Job.JobState;

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
        jobAd.setState(JobState.OPEN);
        jobs.add(jobAd);
    }

    public void updateJobStatus(JobAd jobAd,JobState jobState) {
        jobs.remove(jobAd);
        jobAd.setState(jobState);
        jobs.add(jobAd);
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
