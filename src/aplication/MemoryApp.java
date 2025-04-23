package aplication;
import entities.ManageOfMemory;

import java.util.Scanner;


public class MemoryApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String options;
        String menu = "\nMenu Manage Of Memory\n[1]Mostrar Memoria Utilizada\n[2]Mostrar Blocos\n[3]Alocar Bloco de Memoria\n[4]Remover Bloco de  Memoria\n[0]Sair\n";

        int memoriaParaAlocar;
        int indiceRemover;
        ManageOfMemory memoria = new ManageOfMemory();

        while(true){
            System.out.println(menu);
            options = sc.next();
            switch (options){
                case "0":
                    break;
                case "1":
                    System.out.println(memoria.getTamanhoTotal());
                    break;
                case "2":
                    memoria.mostrarBlocos();
                    break;
                case "3":
                    System.out.println("Digite a Quantidade de memoria que deseja alocar: ");
                    memoriaParaAlocar = sc.nextInt();
                    memoria.alocarMemoria(memoriaParaAlocar);
                    break;
                case "4":
                    memoria.mostrarBlocos();
                    System.out.println("\nDigite o Bloco que Deseja remover: ");
                    indiceRemover = sc.nextInt();
                    memoria.removerBloco(indiceRemover);
                    break;
                default:
                    System.out.println(" @@@ Opção Invalida! @@@");
            }
        }
    }
}
