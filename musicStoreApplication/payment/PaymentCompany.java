package org.example.homeworks.musicStoreApplication.payment;


import org.example.homeworks.musicStoreApplication.customer.Customer;
import org.example.homeworks.musicStoreApplication.album.Album;

public class PaymentCompany implements PaymentMethods {
    public static final PaymentCompany INSTANCE = new PaymentCompany();

    @Override
    public void payWithCreditCard(Customer customer, int quantity) {
        customer.getWallet().setTotal(quantity);
        customer.getWallet().setTotal(customer.getWallet().getTotal() - quantity);
        Album.INSTANCE.getWallet().setTotal(Album.INSTANCE.getWallet().getTotal() + quantity);
    }

    @Override
    public void payWithPhone(Customer customer, int quantity) {
        customer.getWallet().setTotal(quantity);
        customer.getWallet().setTotal(customer.getWallet().getTotal() - quantity);
        Album.INSTANCE.getWallet().setTotal(Album.INSTANCE.getWallet().getTotal() + quantity);
    }

    @Override
    public void payWithGiftCard(Customer customer, int quantity) {
        customer.getWallet().setTotal(quantity);
        customer.getWallet().setTotal(customer.getWallet().getTotal() - quantity);
        Album.INSTANCE.getWallet().setTotal(Album.INSTANCE.getWallet().getTotal() + quantity);
    }
}
