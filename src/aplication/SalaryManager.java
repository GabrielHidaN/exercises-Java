package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.SalaryClass;

public class SalaryManager {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SalaryClass salary = new SalaryClass();

        System.out.println("Name: ");
        salary.name = sc.nextLine();
        System.out.println("GrossSalary: ");
        salary.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        salary.tax = sc.nextDouble();

        System.out.println(salary);

        System.out.println("\nWhich Percentage to increase salary? ");
        salary.increaseSalary(sc.nextDouble());
        System.out.println("Update data: " + salary.name +", $ " + salary.salaryIncrease);
    }
}

