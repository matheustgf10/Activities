package com.company;

public class Cash extends Purchase{


    public Cash(String product, String buyer, double value){
        super(product, buyer, value);
    }

    public double discountCompany(double value){

        value -= 10;

        return value;
    }

    public double discountConsumer(double value){

        value -= 5;

        return value;
    }

}
