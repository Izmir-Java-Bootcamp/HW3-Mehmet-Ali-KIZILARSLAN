package com.kodluyoruz.homework3.service.discount;

import com.kodluyoruz.homework3.cart.Cart;
import com.kodluyoruz.homework3.cart.CartItem;

public class Buy2Take3 implements Discount {

    @Override
    public double applyDiscount(CartItem cartItem) {
    int discountQuantity = cartItem.getQuantity() % 3;
    int paidQuantity = cartItem.getQuantity() - discountQuantity;
    return paidQuantity * cartItem.getProduct().getPrice();
}

    @Override
    public boolean isDiscountable(Cart cart) {

        int value=cart.getCartItemList()
                .stream()
                .map(CartItem::getQuantity)
                .max(Integer::compare).get();

        return value>2;
    }
}
