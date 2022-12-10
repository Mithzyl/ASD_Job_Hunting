package Scheduler;

import java.sql.Timestamp;

public class ScheduledJob {
    private Timestamp notifyingTime;

    private String targetUserId;

    private NotificationType notificationType;

    public void notify(NotificationType notificationType, String targetUserId){}


    // constructor
    public ScheduledJob() {
    }
}
