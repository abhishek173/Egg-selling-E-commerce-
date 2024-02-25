package com.Andawala.EggBusiness.repository;

import com.Andawala.EggBusiness.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

    public List<Customer> findAll();

}
