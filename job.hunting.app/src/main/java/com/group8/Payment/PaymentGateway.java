package com.group8.Payment;

import java.util.List;

public interface PaymentGateway {
    public String processPayment(List<Invoice> payment);
}
