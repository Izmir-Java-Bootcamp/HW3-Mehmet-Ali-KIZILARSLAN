package com.kodluyoruz.homework3.service;


import com.kodluyoruz.homework3.cart.Cart;
import com.kodluyoruz.homework3.checkout.Bill;
import com.kodluyoruz.homework3.checkout.BillItem;
import com.kodluyoruz.homework3.discount.DiscountStrategy;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Builder
@Data
public class CheckoutService {
    private int deliveryFee;
    private int deliveryFeeLimit;
    private final DiscountStrategy discountStrategy;

    public Bill checkout(Cart cart) {
        List<BillItem> billItems = cart.getCartItemList()
                .stream()
                .map(cartItem -> BillItem.builder()

                        .productName(cartItem.getProduct().getName())
                        .quantity(cartItem.getQuantity())
                        .price(cartItem.getPrice())
                        .description(cartItem.getProduct().getDescription())
                        .discountedPrice(discountStrategy.discount(cart,cartItem))
                        .build())
                .collect(Collectors.toList());

        double totalSum = billItems.stream()
                .map(BillItem::getDiscountedPrice)
                .mapToDouble(d -> d)
                .sum();

        if(totalSum==0){
            totalSum= cart.getTotalPrice();
        }
        if(totalSum<deliveryFeeLimit){
            totalSum=totalSum+deliveryFee;
        }

        return Bill.builder()
                .billItemList(billItems)
                .totalPrice(totalSum)
                .build();
    }
}
