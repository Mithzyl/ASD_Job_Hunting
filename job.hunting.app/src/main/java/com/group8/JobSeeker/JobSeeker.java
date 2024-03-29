package com.group8.JobSeeker;

import com.group8.Job.Review;
import com.group8.Job.JobAd;
import com.group8.Job.JobState;
import com.group8.Payment.Invoice;
import com.group8.Payment.JobSeekerPaymentModel;
import com.group8.Payment.PayPerUse;
import com.group8.Server.Request;
import com.group8.Tracker.JobTracker;
import com.group8.User.User;

import java.util.Collections;
import java.util.List;

public class JobSeeker extends User {

    private Boolean openToWork;

    private List<Review> reviews;

    private List<Invoice> invoices;

    private List<Integer> assignedJobAds;

    // composition
    private final JobSeekerPreference jobSeekerPreference;

    private final JobSeekerPaymentModel jobSeekerPaymentModel;

    public String updatePreference() {
        return null;
    }

    public String respondJob(Boolean respond, Request request) {
        JobAd jobAd = request.payload.getJobAd();
        JobTracker jobTracker = JobTracker.getInstance();
        jobTracker.updateJobStatus(jobAd, JobState.ASSIGNED);
        return null;
    }

    public String collectPayment() {
        return null;
    }

    private List<Integer> listCompletedJobs() {
        return null;
    }

    private String handOverRequest() {
        return null;
    }

    public String receiveRequest(Request request) {
        respondJob(true, request);
        return "yes";
    }

    private String changeAvailability(Boolean status) {
        return null;
    }

    public JobSeekerPreference getJobSeekerPreference() {
        return jobSeekerPreference;
    }

    @Override
    public String writeReview() {
        System.out.println("writeReview");
        return null;
    }

    @Override
    public String updateReview() {

        System.out.println("updateReview");
        return null;
    }

    @Override
    public String updateProfile() {
        System.out.println("updateProfile");
        return "updateProfile";
    }

    // Constructor
    public JobSeeker(Boolean openToWork, Integer workingHours, Boolean fullTime, List<String> qualifications, Integer weeks) {
        super();
        this.openToWork = openToWork;
        this.reviews = Collections.EMPTY_LIST;
        ;
        this.invoices = Collections.EMPTY_LIST;
        ;
        this.assignedJobAds = Collections.EMPTY_LIST;
        ;

        // composition
        this.jobSeekerPreference = new JobSeekerPreference(workingHours, fullTime, qualifications, weeks);
        this.jobSeekerPaymentModel = new PayPerUse();
    }

    // Getters and setters
    public Boolean getOpenToWork() {
        return openToWork;
    }

    public void setOpenToWork(Boolean openToWork) {
        this.openToWork = openToWork;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Integer> getAssignedJobAd() {
        return assignedJobAds;
    }

    public void setAssignedJobAd(Integer assignedJobAd) {

        this.assignedJobAds.add(assignedJobAd);
    }

    public void setAssignedJobAd(List<Integer> assignedJobAd) {
        this.assignedJobAds = assignedJobAd;
    }
}
