package com.jaycodes.customer.api.customer.api.service;


import com.jaycodes.customer.api.customer.api.repository.CustomerRepo;
import com.jaycodes.customer.api.customer.api.vo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    //find all customers
    public List<Customer> findAllCustomers(){
        return (List<Customer>)customerRepo.findAll();
    }

    public Customer findCustomerById(Long customerId){
        Optional<Customer> optionalCustomer = customerRepo.findById(customerId);
        if (optionalCustomer.isPresent()){
            return optionalCustomer.get();
        }
        return new Customer();
    }


    public Customer saveNewCustomer(Customer customer){

        if (customerRepo.findById(customer.getCustomerId()).isEmpty()){
            customerRepo.save(customer);
        }

        return customer;

    }

    public Customer updateCurrentCustomer(Long customerId, Customer customer){
        if (customerRepo.existsById(customerId)){
            customerRepo.save(customer);
        }
        return customer;
    }

    public  void deleteAllCustomers(){
       customerRepo.deleteAll();
    }

}


