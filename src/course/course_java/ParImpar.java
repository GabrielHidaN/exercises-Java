package course.course_java;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número : \n");
        num = sc.nextInt();

        if ((num % 2) == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}