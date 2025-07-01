package course.aplication;
import course.entities.AreaClass;

import java.util.Locale;
import java.util.Scanner;

public class AreaApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AreaClass rectangle = new AreaClass();


        System.out.println("Digite o Tamanho da Altura:\n");
        rectangle.height = sc.nextDouble();
        System.out.println("Digite o Tamanho da Largura:\n");
        rectangle.width = sc.nextDouble();

        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());
        System.out.println("Diagonal = " + rectangle.diagonal());

        sc.close();
    }
}
