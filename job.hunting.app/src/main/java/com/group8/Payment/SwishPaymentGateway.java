package com.group8.Payment;

import java.util.Date;
import java.util.List;

public class SwishPaymentGateway implements PaymentGateway{
    private String paymentId;

    private Float Amount;

    private String MobileNumber;

    private Boolean success;

    private String transactionId;

    @Override
    public String processPayment(List<Invoice> payment) {
        return transactionId;
    }
}
