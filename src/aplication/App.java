package aplication;

import entities.Products;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        Products tv = new Products();
        System.out.println("Nome do Produto: ");
        tv.name = sc.next();
        System.out.println("Preço do Produto: ");
        tv.price = sc.nextDouble();
        System.out.println("Quantidade adicionada do Produto: ");
        tv.quantity = sc.nextInt();

        double valueStock = tv.TotalValueInStock();
        System.out.printf("Seu valor de Stock é : %.2f%n" , valueStock);
    }
}

/*
 * Terminar o projeto
 *
 * */