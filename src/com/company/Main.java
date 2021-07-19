package com.company;

public class Main {

    public static void main(String[] args) {

        // Code for testing purposes

       /* Bank antonsAccount = new Bank("12345", 0.00, "Anton B","antonb@live.com","07711289475");
        System.out.println(antonsAccount.getAccountNumber());

        System.out.println(antonsAccount.getBalance());
        antonsAccount.depositFunds(256.50);

        System.out.println(antonsAccount.getBalance());
        antonsAccount.withdrawFunds(10.00);
        System.out.println(antonsAccount.getBalance());

        antonsAccount.depositFunds(1000.00);
        System.out.println(antonsAccount.getBalance());

        antonsAccount.withdrawFunds(10000.00);
        System.out.println(antonsAccount.getBalance());

        Bank timsAccount = new Bank("Tim","Tim@gmail.com","12345");
        System.out.println(timsAccount.getAccountNumber() + " name: " +timsAccount.getCustomerName());*/

      VipCustomer person1 = new VipCustomer();
      System.out.println(person1.getName());

      VipCustomer person2 = new VipCustomer("Bob", 25000.00);
      System.out.println(person2.getName());

      VipCustomer person3 = new VipCustomer("Tim", 100.00, "Tim@gmail.com");
      System.out.println(person3.getName());
      System.out.println(person3.getEmail());

    }
}
