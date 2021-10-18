package com.kodluyoruz.homework3.service.discount;

import com.kodluyoruz.homework3.cart.Cart;
import com.kodluyoruz.homework3.cart.CartItem;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Stream;


@AllArgsConstructor
public class DiscountStrategy {
    private final List<Discount> discounts;

    public double discount(Cart cart, CartItem cartItem) {
        double price=0;
        Stream<Discount> discountStream =discounts.stream()
                .filter(discount -> discount.isDiscountable(cart));
        return discountStream
                .findFirst()
                .get().applyDiscount(cartItem);
    }
}
