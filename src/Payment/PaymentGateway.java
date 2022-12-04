package Payment;

import java.util.List;

public interface PaymentGateway {
    public String processPayment(List<Invoice> payment);
}
