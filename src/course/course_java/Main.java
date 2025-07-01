import java.util.Locale;


public static void main(String[] args) {
    System.out.print("Olá Mundo!");
    System.out.println("Boa noite");

    int idade = 21;
    double altura = 1.72220424;


    String nome = "Gabriel";
    double salario = 3.000;
    String prof = "Desenvolvedor Back End";


    System.out.println(idade);


    System.out.println(altura);
    //Quebra de linha
    System.out.printf("%.2f\n", altura);

    //Config Localização

    Locale.setDefault(Locale.US);
    System.out.printf("%.4f\n", altura);

    System.out.printf("%s tem %d anos é %s e tem o salário de R$ %.2f reais%n" , nome , idade , prof , salario);
};
