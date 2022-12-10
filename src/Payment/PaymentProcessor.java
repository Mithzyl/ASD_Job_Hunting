package Payment;

import Reception.Reception;

import java.util.List;

public class PaymentProcessor {
    public PaymentGateway gateway;

    public PaymentProcessor() {

        this.gateway = new DebitCardPaymentGateway();
    }

    private static PaymentProcessor single_instance = null;


    public void selectPaymentMethod(PaymentGateway paymentGateway){
        this.gateway=paymentGateway;
    }

    public String processPayment(List<Invoice> payment){
        // logic to handle both happy case and sad case
        // after that compare transactionID
        return "transactionId";
    }

    public static PaymentProcessor getInstance() {
        if (single_instance == null)
            single_instance = new PaymentProcessor();
        return single_instance;
    }

}
