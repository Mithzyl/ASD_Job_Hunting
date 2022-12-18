package com.group8.Payment;

import java.util.Date;
import java.util.List;

public class JobProviderSubscription implements JobProviderPaymentModel {

    private String id;

    private Float totalAmount;

    private List<Integer> createdJobAdId;

    private Date expiredDate;

    private Float price;

    private Boolean isExpired() {
        Date currentDate = new Date();
        if (currentDate.after(expiredDate)) {
            return true;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Integer> getCreatedJobAdId() {
        return createdJobAdId;
    }

    public void setCreatedJobAdId(List<Integer> createdJobAdId) {
        this.createdJobAdId = createdJobAdId;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public Float calculatePayment() {
    //logic to pay price to renew subscription
        return null;
    }
}
