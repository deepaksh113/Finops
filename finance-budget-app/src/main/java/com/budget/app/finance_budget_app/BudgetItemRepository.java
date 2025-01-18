package com.budget.app.finance_budget_app;

import org.springframework.data.jpa.repository.JpaRepository;

/*In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures,
default methods, static methods, and nested types. Interfaces cannot contain instance fields, constructors, or concrete methods. */
public interface BudgetItemRepository extends JpaRepository<BudgetItem, Long> {
}
