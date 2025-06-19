package com.example.servingwebcontent.pure_java_project.model;

public class Customer {
    private String customerId;
    private String customerName;
    private String email;
    private String password;
    private String phoneNumber;

    public Customer() {} // Default constructor cần cho Spring Binding

    public Customer(String customerId, String customerName, String email, String password, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
