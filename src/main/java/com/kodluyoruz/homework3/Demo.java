package com.kodluyoruz.homework3;

import com.kodluyoruz.homework3.Category.Categories;
import com.kodluyoruz.homework3.Category.MainCategory;
import com.kodluyoruz.homework3.Category.SubCategory;
import com.kodluyoruz.homework3.Product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;


// TODO: 11.10.2021 try to create main menu method
@Component
@RequiredArgsConstructor
public class Demo implements CommandLineRunner {
    private final Scanner scanner;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to kodluyoruz shop");

        Categories categories = new Categories();


//Fruit and Vegetable
        MainCategory fruitAndVegetable = new MainCategory("Fruit And Vegetables");
        categories.addCategory(fruitAndVegetable);
//Fruit Sub Category
        SubCategory fruit = new SubCategory("Fruit And Vegetables", "Fruit");
        fruitAndVegetable.addSubCategory(fruit);
//Fruit Products
        Product apple = new Product("Fruit And Vegetables","Fruit", "Apple", "Amasya elması kütür kütür", 10);
        fruit.addProduct(apple);

        Product pear = new Product("Fruit And Vegetables","Fruit", "Pear", "BAL ŞEKER ARMUT", 15);
        fruit.addProduct(pear);

        Product grape = new Product("Fruit And Vegetables","Fruit", "Grape", "Bağdan yeni koparılmış üzüm", 18);
        fruit.addProduct(grape);

//Vegetable Sub Category"
        SubCategory vegetable = new SubCategory("Fruit And Vegetables", "Vegetable");
        fruitAndVegetable.addSubCategory(vegetable);
//Vegetable Products
        Product tomato = new Product("Fruit And Vegetables", "Vegetable", "Tomato", "Salçalık domates", 12);
        vegetable.addProduct(tomato);

        Product pepper = new Product("Fruit And Vegetables", "Vegetable", "Pepper", "Tatlı biber",8);
        vegetable.addProduct(pepper);

        Product eggplant = new Product("Fruit And Vegetables", "Vegetable", "Eggplant", "Dolmalık Patlıcan efenimm", 9);
        vegetable.addProduct(eggplant);


//Snack
        MainCategory snacks = new MainCategory("Snacks");
        categories.addCategory(snacks);

//Chips Sub Category
        SubCategory chips = new SubCategory("Snacks", "Chips");
        snacks.addSubCategory(chips);

//Chip products
        Product lays = new Product("Snacks", "Chips", "Lays", "Tarladan Lays cips", 3);
        chips.addProduct(lays);

        Product doritos = new Product("Snacks", "Chips", "Doritos", "Üçgen cips", 4);
        chips.addProduct(doritos);

        Product ruffles = new Product("Snacks", "Chips", "Ruffles", "Ruffles'la hayatı enlerde yaşa ", 5);
        chips.addProduct(ruffles);


//Chocolate Sub Category
        SubCategory chocolate = new SubCategory("Snacks", "Chocolate");
        snacks.addSubCategory(chocolate);

//Chocolate products
        Product tadelle = new Product("Snacks", "Chocolate", "Tadelle", "Tadelle çikolata", 7);
        chocolate.addProduct(tadelle);

        Product albeni = new Product("Snacks", "Chocolate", "Albeni", "Albeni al", 8);
        chocolate.addProduct(albeni);

        Product metro = new Product("Snacks", "Chocolate", "Metro", "Metro, enerji geliyorum demez", 9);
        chocolate.addProduct(metro);

        Product hobby = new Product("Snacks", "Chocolate", "Hobby", "Hobby işte :D ", 10);
        chocolate.addProduct(hobby);


//Breakfast
        MainCategory breakfast = new MainCategory("Breakfast");
        categories.addCategory(breakfast);
//Milk Sub Category
        SubCategory milk = new SubCategory("Breakfast", "Milk");
        breakfast.addSubCategory(milk);

//Milk Products
        Product fullFat = new Product("Breakfast", "Milk", "Full-fat", "Tam Yağlı içim süt", 5);
        milk.addProduct(fullFat);

        Product lowFat = new Product("Breakfast", "Milk", "Low-fat", "Az yağlı içim süt", 6 );
        milk.addProduct(lowFat);

        Product lactoFree = new Product("Breakfast", "Milk", "lacto-free", "laktozsuz içim süt", 7 );
        milk.addProduct(lactoFree);

//Delicatessen Sub Category
        SubCategory delicatessen = new SubCategory("Breakfast", "Delicatessen");
        breakfast.addSubCategory(delicatessen);

//Delicatessen Products
        Product cheddar = new Product("Breakfast", "Delicatessen", "Cheddar", "Çedar Peynir", 4);
        delicatessen.addProduct(cheddar);

        Product cheese = new Product("Breakfast", "Delicatessen", "Cheese", "Halis mulis Peynir", 4);
        delicatessen.addProduct(cheese);

        Product salami = new Product("Breakfast", "Delicatessen", "Salami", "Sadece Salam", 5);
        delicatessen.addProduct(salami);

        Product susage = new Product("Breakfast", "Delicatessen", "Susage", "Sosis", 6);
        delicatessen.addProduct(susage);

        Product olive = new Product("Breakfast", "Delicatessen", "Olive", "Zeytin", 7);
        delicatessen.addProduct(olive);


        



/*test part
        System.out.println("These Are Main Categories");
        for(MainCategory i: categories.getMainCategoryList()){ // TODO: 11.10.2021 add optional choice to list the main categories
            System.out.println(i.getMainCategoryName());
        }

        System.out.println("These Are Sub Categories of Fruit And Vegetable");
        for(SubCategory i: fruitAndVegetable.getSubCategoryList()){  // TODO: 11.10.2021 add optional choice to list the sub categories 
            System.out.println(i.getSubCategoryName());
        }

        System.out.println("These Are Products of Fruit");
        for(Product i: fruit.getProductList()){  // TODO: 11.10.2021 add optional choice to list the sub categories
            System.out.println(i.getName());
        }

        System.out.println(grape.toString());
*/


            
    }
}
