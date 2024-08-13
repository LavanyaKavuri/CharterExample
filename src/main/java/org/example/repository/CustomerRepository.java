package org.example.repository;

import org.springframework.data.repository.CrudRepository;

import org.example.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long>{

    public Customer findByCustomerId(Long customerId);

}
