package org.example.homeworks.musicStoreApplication.payment;


import org.example.homeworks.musicStoreApplication.customer.Customer;

public interface PaymentMethods {
    void payWithCreditCard(Customer customer, int quantity);

    void payWithPhone(Customer customer, int quantity);

    void payWithGiftCard(Customer customer, int quantity);
}
