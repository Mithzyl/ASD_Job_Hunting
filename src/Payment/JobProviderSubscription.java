package Payment;

import java.util.Date;
import java.util.List;

public class JobProviderSubscription implements JobProviderPaymentModel{

    private String id;

    private Float totalAmount;

    private List<Integer> createdJobAdId;

    private Date expiredDate;

    private Float price;

    private Boolean isExpired(){
        return null;
    }

    @Override
    public Float calculatePayment() {
        return null;
    }
}
