package com.budget.app.finance_budget_app.repository;

import com.budget.app.finance_budget_app.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
