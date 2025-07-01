package course.course_java;

import java.util.Scanner;

public class ControleDePosto {
    public static void main(String[] args) {
        // Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 0 Para iniciar o Programa");
        int sendOption = sc.nextInt();
        boolean flag = true;
        String mensagem;
        String menu = "Posto de Gasolina \n [1] Álcool \n [2] Gasolina \n [3] Diesel \n [4] Sair.";



        while(flag){

            System.out.println(menu);
            sendOption = sc.nextInt();
            switch (sendOption){
                case 1 :
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    System.out.println("Muito Obrigado");
                    flag = false;
                    break;
            }
        }
        mensagem = String.format(" %s Álcool \n %s Gasolina \n %s Diesel \n " , alcool , gasolina , diesel);
        System.out.println(mensagem);
    }
}
