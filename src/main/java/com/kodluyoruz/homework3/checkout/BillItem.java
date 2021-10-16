package com.kodluyoruz.homework3.checkout;


import lombok.Data;

@Data
public class BillItem {
    private String productName;
    private String descriptoon;
    private double price;
    private double discountedPrice;
    private int quantity;

}
