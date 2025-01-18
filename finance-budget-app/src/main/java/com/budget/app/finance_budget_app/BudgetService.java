package com.budget.app.finance_budget_app;

import org.springframework.stereotype.Service;

import java.util.List;

/*The @Service annotation is a convenient way to define a service layer in a Spring application,
  promoting organized and manageable code by clearly marking service-related components. */
@Service
public class BudgetService {

    /*The statement "private final BudgetItemRepository repository;" in Java is typically used in a Spring service
      or controller class to declare a field that holds a reference to a repository. */
    private final BudgetItemRepository repository;


    /* Constructor in the BudgetService class that performs constructor injection for the BudgetItemRepository dependency.*/
    public BudgetService(BudgetItemRepository repository){
        this.repository = repository;
    }

    public List<BudgetItem> getAllItems() {
        return repository.findAll();
    }

    public BudgetItem saveItem(BudgetItem item){
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}
