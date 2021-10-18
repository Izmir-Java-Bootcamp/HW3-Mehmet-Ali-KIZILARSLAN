package com.kodluyoruz.homework3.service.discount;

import com.kodluyoruz.homework3.cart.Cart;
import com.kodluyoruz.homework3.cart.CartItem;
import com.kodluyoruz.homework3.properties.DiscountProperty;

public class PercentageDiscount implements Discount{

    private DiscountProperty discountProperties;

    @Override
    public double applyDiscount(CartItem cartItem) {

        double price = cartItem.getProduct().getPrice() * cartItem.getQuantity();
        double appliedDiscount = price * discountProperties.getPercentage();
        return price - appliedDiscount;
    }

    @Override
    public boolean isDiscountable(Cart cart) {
        double totalPrice=cart.getCartItemList().stream()
                .map(CartItem::getPrice)
                .mapToDouble(d->d)
                .sum();

        return  totalPrice>=1000 ;
    }
}
