package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.customer.model.CustomerModel;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerservice;

    @PostMapping("/add")
    public CustomerModel addCustomer(@RequestBody CustomerModel customer) {
        return customerservice.addCustomer(customer);
    }
    
    @GetMapping("/getdata")
    public List<CustomerModel> getDetails(){
    	return customerservice.getDetails();
    }
    
    @PutMapping("/update")
    public CustomerModel updateData(@RequestBody CustomerModel customer) {
    	return customerservice.updateData(customer);
    }
    
    @DeleteMapping("/delete/{custId}")
    public 	String deleteData(@PathVariable int custId) {
    	return customerservice.deleteData(custId);
    }
}