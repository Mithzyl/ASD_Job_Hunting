package Job;

public class JobAd {

    private String id;

    private String description;

    private Integer salary;

    private WorkDetails status;

    private String jobProviderId;

    private String workDetailsId;

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
