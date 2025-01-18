package com.budget.app.finance_budget_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.security.PrivateKey;

@Entity
public class Source {
    @Id
    @GeneratedValue
    private Long id;
    private String source;
    private double amount;

    public Source(){}

    public Source(Long id, String source, double amount) {
        super();
        this.id = id;
        this.source = source;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
