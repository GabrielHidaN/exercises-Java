package course.course_java;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ninja = new String[4];
        String ninjaInput;


        for (int i = 0 ; i < ninja.length ; i ++){
            System.out.println("Escreva o nome do Ninja");
            ninjaInput = sc.next();
            ninja[i] = ninjaInput;
            System.out.println("Ninja Atual " + ninja[i]);
        }
        sc.close();
    }

    // Fazer um programinha com os ninjas
}
