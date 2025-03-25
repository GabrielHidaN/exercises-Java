package course_java;

import java.util.Scanner;

public class ChallengerOfWhile {
    public static void main(String[] args) {
        // Fazer um programa que lê números inteiros é que um zero seja lido.
        // Ao final mostra a soma dos números lidos.
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sendNumber;
        int sumOfNumbers = 0;

        while(true){
            System.out.println("Digite um Número: ");
            sendNumber = sc.nextInt();
            if(sendNumber != number){
                sumOfNumbers += sendNumber;
            }
            else {
                System.out.printf("Parabéns Você encontrou o Número.\n");
                break;
            }
        }
        System.out.printf("A soma dos números é : " + sumOfNumbers);
    }
}
