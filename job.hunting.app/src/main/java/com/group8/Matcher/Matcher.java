package com.group8.Matcher;

import com.group8.Job.JobAd;
import com.group8.Job.JobState;
import com.group8.Job.WorkDetails;
import com.group8.JobSeeker.JobSeeker;
import com.group8.JobSeeker.JobSeekerPreference;
import com.group8.Reception.Reception;
import com.group8.Scheduler.RequestType;
import com.group8.Server.Request;
import com.group8.Server.RequestPayload;
import com.group8.Tracker.ActiveJobSeekerStatusTracker;
import com.group8.User.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Matcher {
    private static Matcher single_instance = null;

    public List<Integer> jobSeekers;

    public List<Integer> jobAds;
    private ActiveJobSeekerStatusTracker jobSeekerStatusTracker;

    public List<JobSeeker> match(JobAd jobAd) {
        List<JobSeeker> candidateJobSeekers = new ArrayList<>();
        Queue<Integer> activeJobSeekers = jobSeekerStatusTracker.getActiveJobSeekers();
        WorkDetails workDetails = jobAd.getWorkDetails();

        for (int jobSeekerID : activeJobSeekers) {
            //get JobSeeker instance using JobSeekerID
            //for example: using hardcoded dummy JobSeeker instance.
            JobSeeker jobSeeker = new JobSeeker(true, 40, true, Arrays.asList("non-experience"), 30);
            JobSeekerPreference userPreference=jobSeeker.getJobSeekerPreference();

            if (userPreference.equals(workDetails)) {
                candidateJobSeekers.add(jobSeeker);
            }
        }
        return candidateJobSeekers;
    }

    public void invite(Integer jobSeekerId,JobAd jobAd ) {
        Reception reception=Reception.getInstance();
        //dummy hardcoded user for testing that has jobSeekerId
        User user = new User();
        user.setId(jobSeekerId);
        //send invitations Requests to receptions
        Request invitationsRequest= new Request(user,new RequestPayload(jobAd),RequestType.JOBSEEKER);
        reception.addToQueue(invitationsRequest);
    }

    private void executeRequest() {
    }

    private void handOverRequest(Request request) {
    }

    public void receiveRequest(Request request) {
        //stubbing for testing.
        JobAd jobAd = new JobAd("testing", 10000, "1", 40, true, Arrays.asList("non-experience"), 30);
        if (request.requestType == RequestType.MATHCER) {
            // do match operations
            //dummy hardcoded JobAd for testing
            List<JobSeeker> candidateJobSeekers=match(jobAd);
            for (JobSeeker candidateJobSeeker : candidateJobSeekers) {
                invite(candidateJobSeeker.getId(),jobAd);
                if (jobAd.getState() == JobState.ASSIGNED) {
                    // do not send invitations once jobAd is assigned
                    break;
                }
            }
        }
    }

    public void getUnassignedJobAds() {
    }


    // constructor
    private Matcher() {
        jobSeekerStatusTracker = ActiveJobSeekerStatusTracker.getInstance();
    }

    public static Matcher getInstance() {
        if (single_instance == null)
            single_instance = new Matcher();
        return single_instance;
    }
}
