package com.budget.app.finance_budget_app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* In Spring Boot, the @Entity annotation is used to mark a Java class as a JPA entity,
   which means it represents a table in a relational database. */
@Entity
public class BudgetItem {

    /* The @Id annotation in Java Persistence API (JPA) is used to specify the primary key of an entity. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*The @GeneratedValue annotation in the Java Persistence API (JPA) is used to specify that the value of the primary key should be automatically generated. */
    private long id;
    private String category;
    private double amount;

    public BudgetItem() {}

    public BudgetItem(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
