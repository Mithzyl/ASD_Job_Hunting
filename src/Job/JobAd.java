package Job;

public class JobAd {

    public String id;

    public String description;

    public Integer salary;

    public WorkDetails status;

    public String jobProviderId;

    public String workDetailsId;

    public Review review;

    public void updateJobInfo(){}


    // constructor
    public JobAd() {
    }

    public JobAd(String id, String description, Integer salary, String jobProviderId, String workDetailsId, Review review) {
        this.id = id;
        this.description = description;
        this.salary = salary;

        // composition
        this.status = new WorkDetails();
        this.jobProviderId = jobProviderId;
        this.workDetailsId = workDetailsId;
        this.review = review;
    }
}
