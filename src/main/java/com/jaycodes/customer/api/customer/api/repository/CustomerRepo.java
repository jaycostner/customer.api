package com.jaycodes.customer.api.customer.api.repository;


import com.jaycodes.customer.api.customer.api.vo.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {



}
