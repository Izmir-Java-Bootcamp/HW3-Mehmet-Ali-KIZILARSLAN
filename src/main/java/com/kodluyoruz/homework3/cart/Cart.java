package com.kodluyoruz.homework3.cart;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    private final List<CartItem> cartItemList;
    public Cart(){
        this.cartItemList = new ArrayList<>();
    }

    public void addItem(CartItem cartItem ){
        cartItemList.add(cartItem);
    }

    public List<CartItem> getCartItemList(){
        return cartItemList;
    }

    public double getTotalPrice(){
        return 0;
    }

}
