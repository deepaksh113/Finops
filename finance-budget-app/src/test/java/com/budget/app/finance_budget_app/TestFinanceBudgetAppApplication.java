package com.budget.app.finance_budget_app;

import org.springframework.boot.SpringApplication;

public class TestFinanceBudgetAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(FinanceBudgetAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
