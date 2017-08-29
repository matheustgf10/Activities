package com.company;

public class Parcel extends Purchase {

        int totalParcel;

        public Parcel(String product, String buyer, double value, int totalParcel){
            super(product, buyer, value);
        }

        public double additionCompany(double value, int totalParcel){

            value += 5 * totalParcel;

            return value;
        }

        public double additionConsumer(double value, int totalParcel){

            value += 3 * totalParcel;

            return value;
        }
}
