package com.budget.app.finance_budget_app.repository;

import com.budget.app.finance_budget_app.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {}
