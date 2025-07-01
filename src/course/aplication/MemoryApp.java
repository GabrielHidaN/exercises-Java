package course.aplication;
import course.entities.ManageOfMemory;

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
            if (options.equals("0")){
                break;
            }
            switch (options){
                case "1":
                    System.out.println("Memoria Utilizada : "+ memoria.getTamanhoTotal());
                    System.out.println("Memoria Livre : " + memoria.getMemoriaTemp());
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
                    try {
                       memoria.removerBloco(indiceRemover);
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(
                                "================================== \n" +
                                "ERROR:" + e.getMessage() + "\n" +
                                "Você deve indicar um índice válido (0 a " +
                                        (memoria.getBlocoDeMemoria().length - 1) + ").\n" +
                                "=================================="
                        );
                    }
                    break;
                default:
                    System.out.println(" @@@ Opção Invalida! @@@");
            }
        }
        sc.close();
    }
}

// Resolver Exceptions