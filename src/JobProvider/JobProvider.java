package JobProvider;

import Job.JobAd;
import Job.Review;
import Payment.Invoice;
import User.User;

import java.util.List;

public class JobProvider extends User {

    private Boolean openToWork;

    private List<Review> reviews;

    private List<Invoice> invoices;

    private List<Integer> assignedJobAd;

    public JobProvider() {
    }

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
