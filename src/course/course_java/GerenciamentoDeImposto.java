package course.course_java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GerenciamentoDeImposto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado;
        double salarioAnual;
        double imposto;
        double salarioComImposto;


        System.out.println("Digite aqui o  seu Salario Anual : ");
        salarioAnual = sc.nextDouble();

        if((salarioAnual > 0) && (salarioAnual <= 34712.00)){
            imposto = 9.70;
            imposto = ( imposto * salarioAnual) / 100;
            salarioComImposto = salarioAnual - imposto;
            valorFormatado = formato.format(salarioComImposto);
            System.out.println("Seu Salario anual com imposto é de :" + valorFormatado);
        }
        else if((salarioAnual > 34712.00) && (salarioAnual <= 68507.00)){
            imposto = 37.35;
            imposto = ( imposto * salarioAnual) / 100;
            salarioComImposto = salarioAnual - imposto;
            valorFormatado = formato.format(salarioComImposto);
            System.out.println("Seu Salario anual com imposto é de :" + valorFormatado);
        }
        else{
            imposto = 49.50;
            imposto = ( imposto * salarioAnual) / 100;
            salarioComImposto = salarioAnual - imposto;
            valorFormatado = formato.format(salarioComImposto);
            System.out.println("Seu Salario anual com imposto é de :" + valorFormatado);
        }
        sc.close();
    }
}
