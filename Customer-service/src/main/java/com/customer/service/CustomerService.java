package com.customer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import com.customer.model.CustomerModel;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerModel addCustomer(CustomerModel customer) {
        return customerRepository.save(customer);
    }
    
    public List<CustomerModel> getDetails(){
    	return customerRepository.findAll();
    }
    
    public CustomerModel updateData(CustomerModel customer ) {
    	CustomerModel cust= customerRepository.findById(customer.getCustId()).get();
    	cust.setCustId(customer.getCustId());
    	cust.setCustName(customer.getCustName());
    	cust.setCustAdd(customer.getCustAdd());
    	return customerRepository.save(cust);
    }
    
    public String deleteData(@PathVariable int custId) {
    	 customerRepository.deleteById(custId);
    	 return "Customer deleted successfully";
    }
}