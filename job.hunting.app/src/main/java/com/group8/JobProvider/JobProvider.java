package com.group8.JobProvider;

import com.group8.Job.JobAd;
import com.group8.Payment.Invoice;
import com.group8.Payment.JobProviderPayPerUse;
import com.group8.Payment.JobProviderPaymentModel;
import com.group8.Payment.PaymentProcessor;
import com.group8.Server.Request;
import com.group8.Tracker.JobTracker;
import com.group8.User.User;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobProvider extends User {

    private List<String> jobs;

    private JobProviderPaymentModel paymentModel;

    private List<Invoice> payments;

    private PaymentProcessor paymentProcessor;


    // methods
    public String createJobAd(){
        //use factory pattern to initiate JobAd
        //use hard coded object for testing
        JobAd jobAd = new JobAd("testing", 10000, "1", 40, true, Arrays.asList("non-experience"), 30);
        JobTracker jobTracker= JobTracker.getInstance();
        jobTracker.addNewJob(jobAd);
        return null;
    }

    public String updateJobInfo(){
        return null;
    }

    public String markCompletedJobAd(String job){
        return null;
    }

    private String generateInvoice(){
        return null;
    }

    public Boolean changeSubscription(Boolean change){
        return null;
    }

    public String isSubscribed(){
        return null;
    }

    public String payAllInvoice(){
        return null;
    }

    public List<Integer> listCompletedJobs(){
        return null;
    }

    private String handOverRequest(Request request){
        return null;
    }

    public String receiveRequest(Request request){
        return null;
    }

    @Override
    public String writeReview(){
        return null;
    }

    @Override
    public String updateReview() {
        return null;
    }

    @Override
    public String updateProfile(){
        return null;
    }


    // constructor
    public JobProvider() {
        super();
        this.jobs = Collections.EMPTY_LIST;
        this.payments = Collections.EMPTY_LIST;
        this.paymentProcessor = PaymentProcessor.getInstance();
        // composition
        this.paymentModel = new JobProviderPayPerUse();

    }

}
