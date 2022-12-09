import Job.Review;
import JobSeeker.JobSeeker;
import Payment.Invoice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to job hunting service!");
        List<JobSeeker> jobSeekers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            JobSeeker jobSeeker = new JobSeeker(true);
            jobSeekers.add(jobSeeker);
        }
    }
}