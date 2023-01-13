package com.group8.Job;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class JobAd {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public String id;

    public String description;

    public Integer salary;

    public WorkDetails workDetails;

    public String jobProviderId;

    public String workDetailsId;

    public List<Review> reviews;

    public JobState state;



    public void updateJobInfo() {
    }


    @Override
    public String toString() {
        return "JobAd{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", status=" + workDetails +
                ", jobProviderId='" + jobProviderId + '\'' +
                ", workDetailsId='" + workDetailsId + '\'' +
                ", review=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobAd jobAd = (JobAd) o;
        return Objects.equals(id, jobAd.id) && Objects.equals(description, jobAd.description) && Objects.equals(salary, jobAd.salary) && Objects.equals(workDetails, jobAd.workDetails) && Objects.equals(jobProviderId, jobAd.jobProviderId) && Objects.equals(workDetailsId, jobAd.workDetailsId) && Objects.equals(reviews, jobAd.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, salary, workDetails, jobProviderId, workDetailsId, reviews);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public WorkDetails getWorkDetails() {
        return workDetails;
    }

    public void setWorkDetails(WorkDetails workDetails) {
        this.workDetails = workDetails;
    }

    public String getJobProviderId() {
        return jobProviderId;
    }

    public void setJobProviderId(String jobProviderId) {
        this.jobProviderId = jobProviderId;
    }

    public String getWorkDetailsId() {
        return workDetailsId;
    }

    public void setWorkDetailsId(String workDetailsId) {
        this.workDetailsId = workDetailsId;
    }

    public JobState getState() {
        return state;
    }

    public void setState(JobState state) {
        this.state = state;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    // constructor
    public JobAd(String description, Integer salary, String jobProviderId, Integer workingHours, Boolean fullTime, List<String> qualifications, Integer weeks) {
        this.id = Integer.toString(ID_GENERATOR.getAndIncrement());
        this.description = description;
        this.salary = salary;
        this.state = JobState.OPEN;
        // composition
        this.workDetails = new WorkDetails(workingHours, fullTime, qualifications, weeks);
        this.jobProviderId = jobProviderId;
        this.workDetailsId = workDetailsId;
        this.reviews = new ArrayList<Review>();
    }
}
