package com.group8.Payment;

public interface JobSeekerPaymentModel {

    String id="1";

    Float totalAmount= 0f;
    Float commission= 0.1f;
    public Float calculatePayment();
}
