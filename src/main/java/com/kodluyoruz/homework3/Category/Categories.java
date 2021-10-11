package com.kodluyoruz.homework3.Category;

import java.util.ArrayList;
import java.util.List;

public class Categories {
    private final List<MainCategory> mainCategoryList;

    public Categories() {
        this.mainCategoryList = new ArrayList<>();
    }

    public void addCategory(MainCategory mainCategory){
        mainCategoryList.add(mainCategory);
    }

    public List<MainCategory> getMainCategoryList(){
        return mainCategoryList;
    }


}
