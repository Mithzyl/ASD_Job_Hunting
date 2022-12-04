package JobProvider;

import Job.JobAd;
import Job.Review;
import Payment.Invoice;
import Payment.JobProviderPaymentModel;
import Payment.PaymentProcessor;
import Server.Request;
import User.User;

import java.util.List;

public class JobProvider extends User {

    private List<String> jobs;

    private JobProviderPaymentModel paymentModel;

    private List<Invoice> payments;

    private PaymentProcessor paymentProcessor;


    // methods
    public String createJobAd(){
        return null;
    }

    public String updateJobInfo(){
        return null;
    }

    public String markCompletedJobAd(String job){
        return null;
    }

    public String generateInvoice(){
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
    }

    public JobProvider(List<String> jobs, List<Invoice> payments, PaymentProcessor paymentProcessor) {
        this.jobs = jobs;

        // composition
        this.paymentModel = (JobProviderPaymentModel) new Object();
        this.payments = payments;
        this.paymentProcessor = paymentProcessor;
    }
}
