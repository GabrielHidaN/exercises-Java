package aplication;

import entities.Products;


import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        String options;
        String menu = " \n Menu\n [1]Registrar Produto \n [2]Adicionar Produto \n [3]Remover Produto \n [4]Mostrar Estoque \n [0]Sair \n";
        Products product = new Products();
        while (true){
            System.out.print(menu);
            options = sc.next();

            if(options.equals("1")){
                System.out.println("Nome do Produto: ");
                product.name = sc.next();
                System.out.println("Preço do Produto: ");
                product.price = sc.nextDouble();
                System.out.println("Quantidade adicionada do Produto: ");
                product.quantity = sc.nextInt();
                double valueStock = product.totalValueInStock();
            }
            else if(options.equals("2")){
                System.out.println("Digite a Quantidade que deseja adicionar no Estoque : ");
                product.addedProduct(sc.nextInt());
                System.out.printf("Updated : Sua Quantidade de itens no estoque é : %d "  , product.quantity );
            }
            else if(options.equals("3")){
                System.out.println("Digite a Quantidade que deseja Remover no Estoque : ");
                product.removedProduct(sc.nextInt());
                System.out.printf("Updated : Sua Quantidade de itens no estoque é : %d  , Seu preço de estoque é %.2f%n" , product.quantity);
            } else if (options.equals("4")) {
                System.out.println(product.name != null ? "Products DATA: " + product : "Sem produto Registrado!");




            } else if (options.equals("0")) {
                break;
            }
            else{
                System.out.println("Opção Não encontrada!");
            }
        }
        sc.close();
    };
};
