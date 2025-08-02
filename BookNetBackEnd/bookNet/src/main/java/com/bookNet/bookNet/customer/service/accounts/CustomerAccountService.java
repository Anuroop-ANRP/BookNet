package com.bookNet.bookNet.customer.service.accounts;

import com.bookNet.bookNet.customer.model.Customer;
import com.bookNet.bookNet.customer.model.CustomerLoginRequest;
import com.bookNet.bookNet.customer.model.CustomerRegistrationRequest;
import com.bookNet.bookNet.customer.model.CustomerResponse;
import com.bookNet.bookNet.customer.repository.CustomerRepository;
import com.fasterxml.jackson.datatype.jdk8.OptionalDoubleSerializer;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerAccountService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;


    public CustomerResponse createAccount(CustomerRegistrationRequest customer) {

        // Check if the Customer already exists
        String customerId = generateCustomerId(1);


        if (customerRepository.findById(customerId).isPresent()) {
            return new CustomerResponse(); // Customer already exists, account creation failed
        }
        System.out.println("Creating account for customer: " + customer.getName());
        Customer actualCustomer = setCustomerDetails(customer, customerId);

        Customer createdCustomer = customerRepository.save(actualCustomer);

        return new CustomerResponse(createdCustomer);
    }

    private Customer setCustomerDetails(CustomerRegistrationRequest customer, String customerId) {

        Customer actualCustomer = new Customer();


        actualCustomer.setCustomerName(customer.getName());
        actualCustomer.setAge(customer.getAge());
        actualCustomer.setEmail(customer.getEmail());
        actualCustomer.setPhoneNumber(customer.getPhoneNumber());
        actualCustomer.setState(customer.getState());
        actualCustomer.setDistrict(customer.getDistrict());
        actualCustomer.setCity(customer.getCity());
        actualCustomer.setAddress(customer.getAddress());
        actualCustomer.setPincode(customer.getPincode());
        actualCustomer.setCustomerId(customerId);
        actualCustomer.setPassword(passwordEncoder.encode(customer.getPassword()));
        actualCustomer.setRegistrantBy(customerId);
        actualCustomer.setRegistrationDateTime(new Time(System.currentTimeMillis()));
        actualCustomer.setUpdatedDateTime(new Time(System.currentTimeMillis()));
        actualCustomer.setLastUpdateBy(customerId);

        return actualCustomer;

    }

    private String generateCustomerId(int tryCount) {

        if (tryCount > 3) throw new RuntimeException("Error generating customer ID");

        long count = customerRepository.count() + tryCount;

        String customerId =  String.format("CUST%07d", count);


        return customerRepository.findByCustomerId(customerId).isPresent() ? generateCustomerId(++tryCount) : customerId;
    }

    public Optional<CustomerResponse> login(CustomerLoginRequest customer) {

        String customerId = customer.getCustomerId();
        String password = customer.getPassword();

         Optional<Customer> existingCustomer = customerRepository.findByCustomerId(customerId);

        if (existingCustomer.isPresent() && passwordEncoder.matches(password, existingCustomer.get().getPassword())) {
            CustomerResponse response = new  CustomerResponse(existingCustomer.get());
            return Optional.of(response);
        } else {
            return Optional.ofNullable(null); // Login failed
        }
    }
}
