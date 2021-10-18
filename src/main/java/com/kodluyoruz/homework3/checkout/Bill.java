package com.kodluyoruz.homework3.checkout;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Bill {
    private List<BillItem> billItemList;
    private double totalPrice;
}
