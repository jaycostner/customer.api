package com.jaycodes.customer.api.customer.api.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Customer {
    @Id
    private Long customerId;
    private String firstName;
    private String lastName;
    private int age;
}
