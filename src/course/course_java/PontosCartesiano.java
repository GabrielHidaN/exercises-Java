package course.course_java;

import java.util.Scanner;

public class PontosCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        boolean right;
        boolean up;

        boolean nulo = false;

        while (nulo == false){
            System.out.println("Digite o X :");
            x = sc.nextInt();
            System.out.println("Digite o Y :");
            y = sc.nextInt();

            if(x != 0 && y != 0){
                right = (x > 0);
                up = (y > 0);

                if(right && up){
                    System.out.println("Primeiro");
                }else if (right && (up == false)) {
                    System.out.println("Quarto");
                }else if (right == false && (up)) {
                    System.out.println("Segundo");
                }else {
                    System.out.println("Terceiro");
                }
            }else {
                nulo = true;
            }
        }
    }
}