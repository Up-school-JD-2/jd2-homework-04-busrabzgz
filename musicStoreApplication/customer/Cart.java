package org.example.homeworks.musicStoreApplication.customer;


import org.example.homeworks.musicStoreApplication.song.Song;
import org.example.homeworks.musicStoreApplication.packages.Paket;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Song> list;
    private int total;

    public Cart() {
        list = new ArrayList<>();
    }

    public List<Song> getList() {
        return list;
    }

    public int getTotal() {
        return total;
    }

    public int calculateOrder(Paket paket) {
        for (Song song : list) {
            total += song.getPrice();
        }

        total -= (total * paket.getDiscountRate()) / 100;

        return total;
    }
}
