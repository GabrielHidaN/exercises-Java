package aplication;
import entities.ManageOfMemory;

import java.util.Scanner;


public class MemoryApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int memoriaParaAlocar;
        ManageOfMemory memoria = new ManageOfMemory();
        System.out.println("Digite a Quantidade de memoria que deseja alocar: ");
        memoriaParaAlocar = sc.nextInt();
        memoria.alocarMemoria(memoriaParaAlocar);
        System.out.println("O tamanho Livre da Memoria é de: " + memoria.getTamanhoLivre());
        System.out.println("Você ta Usando o Total de " + memoria.getTamanhoTotal() + " de memoria.");

        memoria.mostrarBlocos();
    }

}
