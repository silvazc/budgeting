package com.example.budgetapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Report {
    @Id
    private double spent;
    private String category;
    private String subcategory;
    private String paymentType;

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Report{" +
                "spent=" + spent +
                ", category='" + category + '\'' +
                ", subcategory='" + subcategory + '\'' +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
