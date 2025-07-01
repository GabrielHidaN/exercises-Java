package challengers.entities;

public class Manager extends Employee{
    double bonificacao = 0.10;
    public Manager(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double managerSalary = getBaseSalary() + ( getBaseSalary() * bonificacao);
    }

    @Override
    public void exibirDetalhes() {

    }

}
