package com.group8.Scheduler;

import java.sql.Timestamp;

public class ScheduledJob {
    private Timestamp notifyingTime;

    private String targetUserId;

    private NotificationType notificationType;

    public void notify(NotificationType notificationType, String targetUserId){}


    public ScheduledJob(Timestamp notifyingTime, String targetUserId, NotificationType notificationType) {
        this.notifyingTime = notifyingTime;
        this.targetUserId = targetUserId;
        this.notificationType = notificationType;
    }

    // constructor
    public ScheduledJob() {
    }
}
