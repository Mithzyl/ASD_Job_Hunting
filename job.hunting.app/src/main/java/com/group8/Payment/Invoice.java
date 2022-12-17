package com.group8.Payment;

import java.util.concurrent.atomic.AtomicInteger;

public class Invoice {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    private String paymentId;

    private Float paymentAmount;

    private Float netAmount;

    private Float chargedAmount;

    public String method;

    public String payFor;

    public String payBy;

    private Boolean isPaid;

    private String transactionId;

    public void seeDetails(){}

    public Invoice() {
        this.paymentId = Integer.toString(ID_GENERATOR.getAndIncrement());

    }
}
