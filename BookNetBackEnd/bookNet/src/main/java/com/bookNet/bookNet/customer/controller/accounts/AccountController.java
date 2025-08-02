package com.bookNet.bookNet.customer.controller.accounts;

import com.bookNet.bookNet.customer.model.Customer;
import com.bookNet.bookNet.customer.model.CustomerLoginRequest;
import com.bookNet.bookNet.customer.model.CustomerRegistrationRequest;
import com.bookNet.bookNet.customer.model.CustomerResponse;
import com.bookNet.bookNet.customer.service.accounts.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private CustomerAccountService CustomerAccountService;

    @PostMapping("/register")
    public HttpEntity<CustomerResponse> createAccount(@Validated  @RequestBody CustomerRegistrationRequest customer) {

         CustomerResponse customerResponse = CustomerAccountService.createAccount(customer);

         if (Objects.isNull(customerResponse) || customerResponse.getCustomerId() == null) {
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
         }

        return ResponseEntity.status(HttpStatus.CREATED).body(customerResponse);
    }

    @PostMapping("/login")
    public HttpEntity<CustomerResponse> createAccount(@Validated  @RequestBody CustomerLoginRequest customer) {

        Optional<CustomerResponse> customerResponse = CustomerAccountService.login(customer);

        if (customerResponse.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(customerResponse.get());

    }
}
