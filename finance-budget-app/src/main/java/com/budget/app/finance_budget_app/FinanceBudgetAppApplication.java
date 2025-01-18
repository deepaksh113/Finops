package com.budget.app.finance_budget_app;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

/* Using @SpringBootApplication simplifies the setup and bootstrapping process of a Spring Boot application. */
@SpringBootApplication
public class FinanceBudgetAppApplication {


	public static void main(String[] args) {

        /* This method is central to starting your Spring Boot application, handling all the necessary setup and bootstrapping processes. */
		SpringApplication.run(FinanceBudgetAppApplication.class, args);
	}

}
