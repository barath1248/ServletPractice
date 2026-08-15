package com.customer.repository;

import org.springframework.stereotype.Repository;

import com.customer.model.CustomerModel;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {
  
}
