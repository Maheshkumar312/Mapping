package com.prodian.SpringJpaMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.SpringJpaMapping.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

}
