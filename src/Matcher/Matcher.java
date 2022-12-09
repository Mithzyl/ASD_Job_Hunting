package Matcher;

import Job.JobAd;
import JobSeeker.JobSeeker;
import Scheduler.Scheduler;
import Server.Request;
import Tracker.ActiveJobSeekerStatusTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Matcher {
    private static Matcher single_instance = null;

    public List<Integer> jobSeekers;

    public List<Integer> jobAds;
    private ActiveJobSeekerStatusTracker jobSeekerStatusTracker;
    public List<Integer> match(JobAd jobAd){
        Queue<Integer> jobSeekersIds= jobSeekerStatusTracker.getActiveJobSeekers();
        while(jobSeekersIds.isEmpty()){
            int candidateJobSeeker=jobSeekersIds.remove();
        }
        return null;
    }

    public void invite(Integer jobSeekerId){}

    private void executeRequest(){}

    private void handOverRequest(Request request){}

    public void receiveRequest(Request request){}

    public void getUnassignedJobAds(){}


    // constructor
    private Matcher() {
        jobSeekerStatusTracker=ActiveJobSeekerStatusTracker.getInstance();
    }

    public static Matcher getInstance() {
        if (single_instance == null)
            single_instance = new Matcher();
        return single_instance;
    }

}
