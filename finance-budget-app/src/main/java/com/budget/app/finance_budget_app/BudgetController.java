package com.budget.app.finance_budget_app;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/* The @RestController annotation is used in Spring to define a RESTful web service controller.
   It is a combination of @Controller and @ResponseBody, simplifying the creation of REST APIs by automatically
   serializing objects into JSON (or other formats) and writing them to the response body. */
@RestController

/* The @RequestMapping annotation in Spring is used to map HTTP requests to handler methods of MVC and REST controllers.
  It is one of the most commonly used annotations for defining request endpoints and is part of Spring's web framework.*/
@RequestMapping("/api/budget")
public class BudgetController {
    private final BudgetService service;

    public BudgetController(BudgetService service){
        this.service = service;
    }

    /* @GetMapping is specifically used to handle HTTP GET requests,
       providing a more concise and readable way to map GET requests to handler methods in Spring controllers.*/
    @GetMapping
    public List<BudgetItem> getAllBudgetItems() {
        return service.getAllItems();
    }

    /* It provides a cleaner and more concise way to map HTTP POST requests to specific handler methods in Spring controllers. */
    @PostMapping
    public BudgetItem createBudgetItem(@RequestBody BudgetItem item) {
        return service.saveItem(item);
    }

    /* This annotation provides a more concise and readable way to map HTTP DELETE requests to specific handler methods in Spring controllers.*/
    @DeleteMapping
    public void deleteBudgetItem(@PathVariable Long id){
        service.deleteItem(id);
    }
}
