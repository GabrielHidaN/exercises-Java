package course_java;

import java.util.Scanner;

public class UsoDoVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String aluno;
        double nota = 0;
        double media;
        String [] nomes = new String[2];
        double [] notas = new double[2];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o Nome do Aluno : "+ (i + 1));
            aluno = sc.next();
            nomes[i] = aluno;
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite as Nota do Aluno : "+ nomes[i]);
            for (int j = 0; j < 2; j++) {
                nota = sc.nextDouble();
                notas[i] += nota;
            }
        }

        for (int i = 0; i < nomes.length; i++) {
            media = notas[i] / 2;
            System.out.printf("Média do Aluno %s = %.1f \n" , nomes[i] , media);

        }
    }
}
