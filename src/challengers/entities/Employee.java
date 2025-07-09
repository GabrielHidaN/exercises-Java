package challengers.entities;

public abstract class Employee implements EmployeeInterface{
    private String nome;
    private String cpf;
    private double baseSalary;


    //constructor

    public Employee(String nome, String cpf, double baseSalary) {
        this.nome = nome;
        this.cpf = cpf;
        this.baseSalary = baseSalary;
    }


    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void calcularSalario() {
        System.out.println("O Salario sem Bonificalção é: ");

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("oi");
    }
}
