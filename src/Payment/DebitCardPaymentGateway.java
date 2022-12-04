package Payment;

import java.util.Date;
import java.util.List;

public class DebitCardPaymentGateway implements PaymentGateway{
    private String paymentId;

    private Float Amount;

    private Integer cardNumber;

    private Integer cvc;

    private Date expiryDate;

    private Boolean success;

    private String transactionId;

    @Override
    public String processPayment(List<Invoice> payment) {
        return transactionId;
    }
}
