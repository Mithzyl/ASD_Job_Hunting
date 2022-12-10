package Job;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class JobAd {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public String id;

    public String description;

    public Integer salary;

    public WorkDetails status;

    public String jobProviderId;

    public String workDetailsId;

    public Review review;

    public JobState state;

    public void updateJobInfo() {
    }


    @Override
    public String toString() {
        return "JobAd{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", status=" + status +
                ", jobProviderId='" + jobProviderId + '\'' +
                ", workDetailsId='" + workDetailsId + '\'' +
                ", review=" + review +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobAd jobAd = (JobAd) o;
        return Objects.equals(id, jobAd.id) && Objects.equals(description, jobAd.description) && Objects.equals(salary, jobAd.salary) && Objects.equals(status, jobAd.status) && Objects.equals(jobProviderId, jobAd.jobProviderId) && Objects.equals(workDetailsId, jobAd.workDetailsId) && Objects.equals(review, jobAd.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, salary, status, jobProviderId, workDetailsId, review);
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

    public WorkDetails getStatus() {
        return status;
    }

    public void setStatus(WorkDetails status) {
        this.status = status;
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

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    // constructor
    public JobAd(String description, Integer salary, String jobProviderId, Integer workingHours, Boolean fullTime, List<String> qualifications, Integer weeks) {
        this.id = Integer.toString(ID_GENERATOR.getAndIncrement());
        this.description = description;
        this.salary = salary;
        this.state = JobState.OPEN;
        // composition
        this.status = new WorkDetails(workingHours, fullTime, qualifications, weeks);
        this.jobProviderId = jobProviderId;
        this.workDetailsId = workDetailsId;
        this.review = review;
    }
}
