package com.budget.app.finance_budget_app.service;

import com.budget.app.finance_budget_app.model.Budget;
import com.budget.app.finance_budget_app.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget saveBudget(Budget budget) {
        return budgetRepository.save(budget);
    }
}
