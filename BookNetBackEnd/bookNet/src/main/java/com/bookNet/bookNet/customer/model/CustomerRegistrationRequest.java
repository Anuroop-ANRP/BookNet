package com.bookNet.bookNet.customer.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
public class CustomerRegistrationRequest {

    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    @NotEmpty(message = "Phone number cannot be empty")
    private String phoneNumber;
    @NotEmpty(message = "State cannot be empty")
    private String state;
    @NotEmpty(message = "District cannot be empty")
    private String district;
    @NotEmpty(message = "City cannot be empty")
    private String city;
    @NotEmpty(message = "Address cannot be empty")
    private String address;
    @NotEmpty(message = "Pincode cannot be empty")
    private String pincode;
    @NotNull(message = "Age cannot be null")
    private int age;
    @NotEmpty
    @NotNull
    private String password;


    public @NotEmpty(message = "Name cannot be empty") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name cannot be empty") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Email cannot be empty") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "Email cannot be empty") String email) {
        this.email = email;
    }

    public @NotEmpty(message = "Phone number cannot be empty") String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotEmpty(message = "Phone number cannot be empty") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public @NotEmpty(message = "State cannot be empty") String getState() {
        return state;
    }

    public void setState(@NotEmpty(message = "State cannot be empty") String state) {
        this.state = state;
    }

    public @NotEmpty(message = "District cannot be empty") String getDistrict() {
        return district;
    }

    public void setDistrict(@NotEmpty(message = "District cannot be empty") String district) {
        this.district = district;
    }

    public @NotEmpty(message = "City cannot be empty") String getCity() {
        return city;
    }

    public void setCity(@NotEmpty(message = "City cannot be empty") String city) {
        this.city = city;
    }

    public @NotEmpty(message = "Address cannot be empty") String getAddress() {
        return address;
    }

    public void setAddress(@NotEmpty(message = "Address cannot be empty") String address) {
        this.address = address;
    }

    public @NotEmpty(message = "Pincode cannot be empty") String getPincode() {
        return pincode;
    }

    public void setPincode(@NotEmpty(message = "Pincode cannot be empty") String pincode) {
        this.pincode = pincode;
    }

    @NotNull(message = "Age cannot be null")
    public int getAge() {
        return age;
    }

    public void setAge(@NotNull(message = "Age cannot be null") int age) {
        this.age = age;
    }

    public @NotEmpty @NotNull String getPassword() {
        return password;
    }

    public void setPassword(@NotEmpty @NotNull String password) {
        this.password = password;
    }

    public CustomerRegistrationRequest() {
    }

    public CustomerRegistrationRequest(String name, String email, String phoneNumber, String state, String district, String city, String address, String pincode, int age, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.district = district;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
        this.age = age;
        this.password = password;
    }
}
