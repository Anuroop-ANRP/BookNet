package com.bookNet.bookNet.customer.repository;

import com.bookNet.bookNet.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    int countByCustomerName(String CustomerName);

    Optional<Customer> findByCustomerId(String customerId);
}
