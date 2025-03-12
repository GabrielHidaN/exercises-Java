package course_java;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double altura;
        int idade;
        String nome;
        String s1,s2,s3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println(MessageFormat.format(" Nome {0} Idade : {1} Altura : {2}", nome, idade, altura));
        sc.close();
    }

}