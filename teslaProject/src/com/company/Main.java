package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Cash cash;
        Parcel parcel;

        String product, buyer, typeBuyer, payment;
        double value, finalValue;

        product   = String.valueOf(JOptionPane.showInputDialog(null,"Informe o produto comprado: "));
        buyer     = String.valueOf(JOptionPane.showInputDialog(null, "Informe seu nome/nome da empresa: "));
        typeBuyer = String.valueOf(JOptionPane.showInputDialog(null,"Comprar como pessoa física ou jurídica? Informe com F/J (QUALQUER VALOR DIFERENTE NÃO SERÁ ACEITO)"));
        payment   = String.valueOf(JOptionPane.showInputDialog(null,"Informe a forma de pagamento: (INFORME COM A/P)"));
        value     = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto: "));

        if(typeBuyer.equals("f") || typeBuyer.equals("F")){
            if(payment.equals("a") || payment.equals("A")){
                cash = new Cash(product, buyer, value);
                finalValue = cash.discountConsumer(value);
                System.out.println("O(A) " +buyer+ " está comprando um " +product+ " no valor de R$" +value+ " avista. O valor final do "+product+" avista será:R$"+finalValue);

            }else if(payment.equals("p") || payment.equals("P")){
                int totalParcel = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o total de parcelas: "));
                parcel = new Parcel(product, buyer, value, totalParcel);
                finalValue = parcel.additionConsumer(value, totalParcel);
                System.out.println("O(A) " +buyer+ " está comprando um " +product+ " no valor de R$" +value+ " em "+totalParcel+"x. O valor final do "+product+" a prazo será:R$"+finalValue);

            }else{
                System.out.println("ERROR");
            }

        }else if(typeBuyer.equals("j") || typeBuyer.equals("J")){
            if(payment.equals("a") || payment.equals("A")){
                cash = new Cash(product, buyer, value);
                finalValue = cash.discountCompany(value);
                System.out.println("A empresa " +buyer+ " está comprando um " +product+ " no valor de R$" +value+ " avista. O valor final do "+product+" avista será:R$"+finalValue);

            }else if(payment.equals("p") || payment.equals("P")){
                int totalParcel = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o total de parcelas: "));
                parcel = new Parcel(product, buyer, value, totalParcel);
                finalValue = parcel.additionCompany(value, totalParcel);
                System.out.println("A empresa " +buyer+ " está comprando um " +product+ " no valor de R$" +value+ " em "+totalParcel+"x. O valor final do "+product+" a prazo será:R$"+finalValue);

            }else{
                System.out.println("ERROR");
            }


        }else{
            System.out.println("ERROR");
        }


    }
}
