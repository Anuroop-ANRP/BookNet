package com.bookNet.bookNet.customer.model;

import lombok.Data;

@Data
public class CustomerResponse {

    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String pinCode;
    private int age;
    private String status;
    private String registrationDateTime;
    private String updatedDateTime;
    private String registrantBy;
    private String lastUpdateBy;

    public CustomerResponse() {
    }

    public CustomerResponse(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.firstName = customer.getCustomerName();
        this.lastName = customer.getName();
        this.email = customer.getEmail();
        this.phoneNumber = customer.getPhoneNumber();
        this.address = customer.getAddress();
        this.city = customer.getCity();
        this.state = customer.getState();
        this.pinCode = customer.getPincode();
        this.age = customer.getAge();
        this.status = customer.getStatus();
        this.registrationDateTime = customer.getRegistrationDateTime().toString();
        this.updatedDateTime = customer.getUpdatedDateTime().toString();
        this.registrantBy = customer.getRegistrantBy();
        this.lastUpdateBy = customer.getLastUpdateBy();
    }

    public CustomerResponse(String customerId, String firstName, String lastName, String email, String phoneNumber, String address, String city, String state, String zipCode, String country, int age, String status, String registrationDateTime, String updatedDateTime, String registrantBy, String lastUpdateBy) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = zipCode;
        this.age = age;
        this.status = status;
        this.registrationDateTime = registrationDateTime;
        this.updatedDateTime = updatedDateTime;
        this.registrantBy = registrantBy;
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(String registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

    public String getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
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
    // Additional fields can be added as needed
}
