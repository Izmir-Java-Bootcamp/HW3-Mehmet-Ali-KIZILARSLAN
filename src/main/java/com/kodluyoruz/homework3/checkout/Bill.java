package com.kodluyoruz.homework3.checkout;


import lombok.Data;

@Data
public class Bill {
    private List<BillItem> billItemList;
    private double totalPrice;
}
