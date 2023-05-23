package com.ronakon45.playground;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer/")
@CrossOrigin
public class CustomerController {
    
    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<Customer> all() {
      return (List<Customer>) repository.findAll();
    }

    @PostMapping
    Customer newCustomer(@RequestBody Customer newCustomer) {
      return repository.save(newCustomer);
    }


}
