package aplication;


import entities.CurrencyConverter;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        /*
        Faca um programa para ler a cotacao do dolar
        pergunta quantos dolar quer comprar
        informar quantos reais a pessoa vai pagar pelos dolares considerando ainda 6% de IOF sobre o valor em dolar

         */

        var scanner = new Scanner(System.in);
        double priceOfDollar;
        double valueInDollar;

        System.out.println("What is the dollar price?");
        priceOfDollar = scanner.nextDouble();
        System.out.println("How many dollars will be bought?");
        valueInDollar = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f \n" , CurrencyConverter.converter(priceOfDollar , valueInDollar));

        scanner.close();
    }
}
