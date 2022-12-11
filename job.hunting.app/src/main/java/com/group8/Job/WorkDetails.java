package Job;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class WorkDetails {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    public String id;

    public Integer workingHours;

    public Boolean fullTime;

    public List<String> qualifications;

    public Integer weeks;

    public void updateDetails(){

    }

    // constructor
    public WorkDetails(Integer workingHours, Boolean fullTime, List<String> qualifications, Integer weeks) {
        this.id =Integer.toString(ID_GENERATOR.getAndIncrement());
        this.workingHours = workingHours;
        this.fullTime = fullTime;
        this.qualifications = qualifications;
        this.weeks = weeks;
    }
}
