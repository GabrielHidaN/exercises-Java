package course.aplication;

import course.entities.Rent;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {

        String nome;
        String email;
        var scanner = new Scanner(System.in);
        System.out.println("How many Rooms will be rented: ");
        int rentRooms = scanner.nextInt();
        Rent[] vect = new Rent[10];
        for (int i = 0; i < rentRooms; i++) {
            System.out.println("#Rent " + i + 1 + ":");
            System.out.println("nome: ");
            nome = scanner.next();
            System.out.println("email: ");
            email = scanner.next();
            System.out.println("Room: ");
            int room = scanner.nextInt();

            vect[room] = new Rent(nome, email);
        }
        System.out.println("Busy Rooms: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        scanner.close();
    }
}
