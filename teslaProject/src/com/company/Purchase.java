package com.company;

public abstract class Purchase {

    private String product;
    private String buyer;
    private double value;


    public Purchase(final String product, final String buyer, final double value){
        this.product = product;
        this.buyer = buyer;
        this.value = value;

    }
}
