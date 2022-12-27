package com.group8.Server;

import com.group8.Job.JobAd;
import com.group8.Job.Review;
import com.group8.Scheduler.NotificationType;
import com.group8.Scheduler.ScheduledJob;

import java.sql.Timestamp;
import java.util.List;

public class RequestPayload {
    private ScheduledJob scheduledJob;

    private JobAd jobAd;

    private Review review;

    public ScheduledJob getScheduledJob() {
        return scheduledJob;
    }

    public JobAd getJobAd() {
        return jobAd;
    }



    public RequestPayload(Timestamp notifyingTime, String targetUserId, NotificationType notificationType) {
        this.scheduledJob=new ScheduledJob(notifyingTime,targetUserId,notificationType);
    }

    public RequestPayload(String description, Integer salary, String jobProviderId, Integer workingHours, Boolean fullTime, List<String> qualifications, Integer weeks) {
        this.jobAd = new JobAd( description, salary,jobProviderId, workingHours,fullTime, qualifications, weeks);
    }

    public RequestPayload(JobAd jobAd) {
        this.jobAd = jobAd;
    }
    // constructor
    public RequestPayload() {
    }

}
