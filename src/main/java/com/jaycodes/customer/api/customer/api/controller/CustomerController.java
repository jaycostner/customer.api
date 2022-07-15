package com.jaycodes.customer.api.customer.api.controller;


import com.jaycodes.customer.api.customer.api.service.CustomerService;
import com.jaycodes.customer.api.customer.api.vo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    // find all customers
    @RequestMapping(value = "/customers", method= RequestMethod.GET)
    public List<Customer> findAllCustomers(){
        return customerService.findAllCustomers();
    }
    // find a customer by id
    @RequestMapping(value = "/customers/{customerId}", method= RequestMethod.GET)
    public Customer findCustomerById(@PathVariable Long customerId){
        return customerService.findCustomerById(customerId);


    }

    //create new customers
    @RequestMapping(value ="/customers", method= RequestMethod.POST)
     public Customer createCustomer(@RequestBody Customer customer){
        return customerService.saveNewCustomer(customer);
    }

    //update existing customer by id
    @RequestMapping (value = "/customers/{customerId}", method = RequestMethod.PUT)
      public Customer updateCurrentCustomer(@PathVariable Long customerId, @RequestBody Customer customer){
        return customerService.updateCurrentCustomer(customerId, customer);
    }

    // delete customer

    @RequestMapping (value = "/customers" , method = RequestMethod.DELETE)
     public void deleteAllCustomer(){
         customerService.deleteAllCustomers();
    }
}
