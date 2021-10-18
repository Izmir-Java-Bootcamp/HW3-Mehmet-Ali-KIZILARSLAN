package com.kodluyoruz.homework3.cart;

import com.kodluyoruz.homework3.Product.Product;

public class CartItem {

    private Product product;
    private int quantity;

    public double getPrice(){
        return product.getPrice() * quantity;
    }
    public int getQuantity() {return quantity;}

    public Product getProduct() {
        return product;
    }
}
