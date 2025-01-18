package com.budget.app.finance_budget_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class FinanceBudgetAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
