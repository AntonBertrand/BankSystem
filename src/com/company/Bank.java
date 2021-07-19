package com.company;

public class Bank {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank() {
        this("56789", 2.50, "Default", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }


    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("Account constructor called!");
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getEmail () {
        return this.email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double number) {
        double balance = getBalance();
        balance += number;
        setBalance(balance);
    }

    public void withdrawFunds(double number) {
        double balance = getBalance();

        if (number > balance) {
            System.out.println("Insufficient funds!");
        }else {

            balance -= number;
            setBalance(balance);
        }
    }


    }
