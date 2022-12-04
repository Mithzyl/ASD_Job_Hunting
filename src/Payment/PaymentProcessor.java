package Payment;

import java.util.List;

public class PaymentProcessor {
    public PaymentGateway gateway;

    public void selectPaymentMethod(PaymentGateway paymentGateway){}

    public String processPayment(List<Invoice> payment){
        return "transactionId";
    }
}
