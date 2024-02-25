package com.Andawala.EggBusiness.service;

import com.Andawala.EggBusiness.entity.Customer;

import java.util.List;

public interface CustomerService {

    public void save(Customer customer);
    public List<Customer> findAllCustomer();

}
