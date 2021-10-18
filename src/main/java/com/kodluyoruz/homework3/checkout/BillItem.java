package com.kodluyoruz.homework3.checkout;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillItem {
    private String productName;
    private String description;
    private double price;
    private double discountedPrice;
    private int quantity;

}
