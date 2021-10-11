package com.kodluyoruz.homework3.Category;

import java.util.ArrayList;
import java.util.List;

public class MainCategory extends Categories{
    private final String mainCategoryName;
    private final List<SubCategory> subCategoryList;

    public MainCategory(String categoryName) {
        this.mainCategoryName = categoryName;
        this.subCategoryList = new ArrayList<>();
    }

    public void addSubCategory(SubCategory subCategory){
        subCategoryList.add(subCategory);
    }

    public List<SubCategory> getSubCategoryList(){
        return subCategoryList;
    }

    public String getMainCategoryName() {
        return mainCategoryName;
    }





}
