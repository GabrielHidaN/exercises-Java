package course_java;

import java.util.Scanner;

public class SenhaComWhile {
    public static void main(String[] args) {
        // Ex 3  Curso Nélio

        String senha = "2002";
        Scanner sc = new Scanner(System.in);
        String mensagem;
        String sendSenha = "";
        while(senha.equals(sendSenha) == false){
            System.out.println("Digite a senha : \n");
            sendSenha = sc.next();

            mensagem = (senha.equals(sendSenha)) ? "Acesso Permitido" : "Acesso Negado";
            System.out.println(mensagem);

        }
        sc.close();
        }

    }

