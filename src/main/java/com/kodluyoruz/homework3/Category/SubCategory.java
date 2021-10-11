package com.kodluyoruz.homework3.Category;


import com.kodluyoruz.homework3.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class SubCategory extends MainCategory {

    private final String subCategoryName;
    private final List<Product> productList;


    public SubCategory(String mainCategoryName, String subCategoryName) {
        super(mainCategoryName);
        this.subCategoryName = subCategoryName;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> getProductList(){
        return productList;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

}
