package course_java;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
// fazer um programa que diga se o numero é positivo ou negativo
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número : \n");
        num = sc.nextInt();

        if (num != 0){
            if(num < 0){
                System.out.println("Negativo , seu número é o : " + num);
            }
            else{
                System.out.println("Positivo , seu número é o : " + num);
            }
        }

        else {
            System.out.println("Neutro , seu número é o : " + num);
        }
    }
}
