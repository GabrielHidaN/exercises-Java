package course.course_java;

import java.util.Locale;

public class Challenger {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 21;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s , With price is $ %.2f \n", product1 , price1);
        System.out.printf("%s , With price is $ %.2f \n", product2 , price2);
        System.out.printf("\nRecord:  %d years old,  code %d and gender: %c \n", age ,code ,gender );
        System.out.printf("Measure with eight decimal places %f", measure);
        System.out.printf("Rounded (three decimal places):  %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US Decimal pointe:  %.3f\n", measure);

    }

}