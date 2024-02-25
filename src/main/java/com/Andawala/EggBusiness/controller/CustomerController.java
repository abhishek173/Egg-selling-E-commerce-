package com.Andawala.EggBusiness.controller;


import com.Andawala.EggBusiness.entity.Customer;
import com.Andawala.EggBusiness.repository.CustomerRepository;
import com.Andawala.EggBusiness.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer/save")
    public void saveCustomer(@RequestBody Customer customer){
        Customer customer1 = new Customer();
        customer1.setFullName(customer.getFullName());
        customer1.setMobileNumber(customer.getMobileNumber());
        customer1.setAddress(customer.getAddress());
        customer1.setProduct(customer.getProduct());
        customer1.setQuantity(customer.getQuantity());
        customer1.setPrice(customer.getPrice());
        customerService.save(customer1);
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomer() {
        return customerService.findAllCustomer();
    }
}
