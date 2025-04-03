package course_java;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class ContaCorrente {

        public double saldo = 1000.00;
        public String numeroConta = "1234";
        public String numeroAgencia = "1001.10";
        public String nomeCliente = "Gabriel";
        public String dataNascimento = "06/10/2003";



        public void sacar( double saldo) {
             this.saldo = saldo;
             double valorSaque;
             System.out.println("Digite o valor que deseja sacar: ");
             Scanner sc = new Scanner(System.in);
             valorSaque = sc.nextDouble();

             if(valorSaque <= saldo){
                 saldo -= valorSaque;
                 System.out.println("Saque Concluído com Sucesso!\n Seu Saldo atual é : " + saldo);
             }
             else{
                 System.out.println("Saldo insuficiente para completar o saque!\n" + "Seu Saldo é de : " + saldo);
             }

        }

        //traferir um valor cancelar cconta com justiuficativa consultar extratos e datas consultar saldo atual

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.sacar(contaCorrente.saldo);
    }



}



