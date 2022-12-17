package com.group8.Job;

import java.util.concurrent.atomic.AtomicInteger;

public class Review {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public String reviewId;

    public String jobId;

    public String reviewedById;

    public String reviewedToId;

    public void writeReview(){}

    public void updateReview(){}


    // constructor
    public Review(String jobId, String reviewedById, String reviewedToId) {
        this.reviewId = Integer.toString(ID_GENERATOR.getAndIncrement());
        this.jobId = jobId;
        this.reviewedById = reviewedById;
        this.reviewedToId = reviewedToId;
    }
}
