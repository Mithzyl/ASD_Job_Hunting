package Server;

import Job.JobAd;
import Scheduler.NotificationType;
import Scheduler.ScheduledJob;
import java.sql.Timestamp;
import java.util.List;

public class RequestPayload {
    public ScheduledJob getScheduledJob() {
        return scheduledJob;
    }

    public JobAd getJobAd() {
        return jobAd;
    }

    private ScheduledJob scheduledJob;

    private JobAd jobAd;

    public RequestPayload(Timestamp notifyingTime, String targetUserId, NotificationType notificationType) {
        this.scheduledJob=new ScheduledJob(notifyingTime,targetUserId,notificationType);
    }

    public RequestPayload(String description, Integer salary, String jobProviderId, Integer workingHours, Boolean fullTime, List<String> qualifications, Integer weeks) {
        this.jobAd = new JobAd( description, salary,jobProviderId, workingHours,fullTime, qualifications, weeks);
    }
    // constructor
    public RequestPayload() {
    }

}
