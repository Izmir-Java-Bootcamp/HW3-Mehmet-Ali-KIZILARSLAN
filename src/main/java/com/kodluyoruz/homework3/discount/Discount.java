package com.kodluyoruz.homework3.discount;

import com.kodluyoruz.homework3.cart.Cart;
import com.kodluyoruz.homework3.cart.CartItem;
import org.springframework.stereotype.Service;

@Service
public interface Discount {
    boolean isDiscountable(Cart cart);
    double  applyDiscount(CartItem cartItem);

}
