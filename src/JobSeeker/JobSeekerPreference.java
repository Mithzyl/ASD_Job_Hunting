package JobSeeker;

import java.util.List;

public class JobSeekerPreference {

    public Integer workingHours;

    public Boolean fullTime;

    public List<String> qualifications;

    public Integer weeks;

    public void updatePreference(){
        System.out.println("updatePreference");
    }

    public JobSeekerPreference(Integer workingHours, Boolean fullTime, List<String> qualifications, Integer weeks) {
        this.workingHours = workingHours;
        this.fullTime = fullTime;
        this.qualifications = qualifications;
        this.weeks = weeks;
    }

    public JobSeekerPreference() {
    }
}
