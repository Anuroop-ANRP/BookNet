package com.bookNet.bookNet.customer.model;

import com.bookNet.bookNet.common.models.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.sql.Time;

@Entity
public class Customer extends Person {

    @Id
    private String customerId;
    @NotNull
    @NotEmpty
    private String customerName;
    @NotNull
    @NotEmpty
    private String password;
    private String status = "active"; // default status is active
    private Time registrationDateTime;
    private Time updatedDateTime;
    private String lastUpdateBy;
    private String registrantBy;

    public @NotNull @NotEmpty String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(@NotNull @NotEmpty String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public @NotNull @NotEmpty String getPassword() {
        return password;
    }

    public void setPassword(@NotNull @NotEmpty String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(Time registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

    public Time getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Time updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getRegistrantBy() {
        return registrantBy;
    }

    public void setRegistrantBy(String registrantBy) {
        this.registrantBy = registrantBy;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Customer(String name, String email, String phoneNumber, String state, String district, String city, String address, String pincode, int age, String CustomerName, String password, String CustomerId, String status, Time registrationDateTime, Time updatedDateTime, String lastUpdateBy, String registrantBy) {
        super(name, email, phoneNumber, state, district, city, address, pincode, age);
        this.customerName = CustomerName;
        this.password = password;
        this.customerId = CustomerId;
        this.status = status;
        this.registrationDateTime = registrationDateTime;
        this.updatedDateTime = updatedDateTime;
        this.lastUpdateBy = lastUpdateBy;
        this.registrantBy = registrantBy;
    }

    public Customer(String CustomerName, String password, String CustomerId, String status, Time registrationDateTime, Time updatedDateTime, String lastUpdateBy, String registrantBy) {
        this.customerName = CustomerName;
        this.password = password;
        this.customerId = CustomerId;
        this.status = status;
        this.registrationDateTime = registrationDateTime;
        this.updatedDateTime = updatedDateTime;
        this.lastUpdateBy = lastUpdateBy;
        this.registrantBy = registrantBy;
    }

    public Customer() {
        
    }
}
