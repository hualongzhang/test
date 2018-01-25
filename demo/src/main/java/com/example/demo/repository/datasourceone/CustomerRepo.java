package com.example.demo.repository.datasourceone;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.one.Customer;


public interface CustomerRepo extends CrudRepository<Customer, Serializable>{

}
