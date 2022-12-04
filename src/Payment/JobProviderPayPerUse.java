package Payment;

import java.util.List;

public class JobProviderPayPerUse implements JobProviderPaymentModel{

    private String id;

    private Float totalAmount;

    private List<Integer> createdJobAdId;

    private Integer numberOfJobsCreated;

    private Float amountPerRequest;

    @Override
    public Float calculatePayment() {
        return null;
    }
}
