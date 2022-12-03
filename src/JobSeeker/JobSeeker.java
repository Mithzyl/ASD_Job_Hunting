package JobSeeker;

import Job.Review;
import Payment.Invoice;
import Payment.JobSeekerPaymentModel;
import Server.Request;
import User.User;

import java.util.List;

public class JobSeeker extends User {

    private Boolean openToWork;

    private List<Review> reviews;

    private List<Invoice> invoices;

    private List<Integer> assignedJobAd;

    // composition
    private JobSeekerPreference jobSeekerPreference;

    private JobSeekerPaymentModel jobSeekerPaymentModel;


    public String updatePreference(){
        return null;
    }

    public String respondJob(Boolean respond){
        return null;
    }

    public String collectPayment(){
        return null;
    }

    private List<Integer> listCompletedJobs(){
        return null;
    }

    private String handOverRequest(){
        return null;
    }
    public String receiveRequest(Request request){
        return null;
    }

    private String changeAvailability(Boolean status){
        return null;
    }

    public String writeReview(){
        return null;
    }

    public String updateReview(){
        return null;
    }

    public String updateProfile(){
        return null;
    }

    // Constructor
    public JobSeeker() {

    }

    public JobSeeker(Boolean openToWork, List<Review> reviews, List<Invoice> invoices, List<Integer> assignedJobAd) {
        this.openToWork = openToWork;
        this.reviews = reviews;
        this.invoices = invoices;
        this.assignedJobAd = assignedJobAd;

        // composition
        this.jobSeekerPreference = new JobSeekerPreference();
        this.jobSeekerPaymentModel = new JobSeekerPaymentModel() {};
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
        return assignedJobAd;
    }

    public void setAssignedJobAd(List<Integer> assignedJobAd) {
        this.assignedJobAd = assignedJobAd;
    }
}
