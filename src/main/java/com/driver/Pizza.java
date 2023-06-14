package com.driver;

public class Pizza {

    public int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
        }
        else price = 400;
    }
//    public Pizza(boolean isVeg, boolean dp){
//        if(isVeg){
//            price = 300 + 80 + 70;
//        }
//        else price = 400 + 80 + 70;
//    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
            price += 70;
        else price += 120;
    }

    public void addTakeaway(){
        // your code goes here
        price += 20;
    }

    public String getBill(){
        // your code goes here
        bill = "" + price;
        return this.bill;
    }
}
