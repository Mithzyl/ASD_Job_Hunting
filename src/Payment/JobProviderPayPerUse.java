package Payment;

import java.util.List;

public class JobProviderPayPerUse implements JobProviderPaymentModel{

    private Integer numberOfJobsCreated;

    private Float amountPerRequest;

    public Integer getNumberOfJobsCreated() {
        return numberOfJobsCreated;
    }

    public void setNumberOfJobsCreated(Integer numberOfJobsCreated) {
        this.numberOfJobsCreated = numberOfJobsCreated;
    }

    public Float getAmountPerRequest() {
        return amountPerRequest;
    }

    public void setAmountPerRequest(Float amountPerRequest) {
        this.amountPerRequest = amountPerRequest;
    }

    @Override
    public Float calculatePayment() {
        return numberOfJobsCreated*amountPerRequest;
    }
}
