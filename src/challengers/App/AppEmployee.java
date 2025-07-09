package challengers.App;

import challengers.entities.Developer;
import challengers.entities.Employee;
import challengers.entities.Manager;

public class AppEmployee {
    public static void main(String[] args) {


        /*
         * Desafio 1: Sistema de Controle de Funcionários
         *
         * Problema: Crie um sistema para gerenciar diferentes tipos de funcionários em uma empresa.
         *
         * Requisitos:
         *
         * 1. Crie uma classe Funcionario (classe base abstrata) com os seguintes atributos:
         * - nome (String)
         * - cpf (String)
         * - salarioBase (double)
         *
         * 2. A classe Funcionario deve ter um construtor e um método abstrato calcularSalario()
         * que retorna o salário final do funcionário.
         *
         * 3. Implemente um método exibirDetalhes() que imprima o nome, CPF e o salário final do funcionário.
         *
         * 4. Crie as seguintes subclasses que estendam Funcionario:
         * - Gerente:
         * - Atributo adicional: bonificacao (double - porcentagem sobre o salário base, ex: 0.10 para 10%).
         * - O método calcularSalario() do Gerente deve retornar salarioBase + (salarioBase * bonificacao).
         *
         * - Desenvolvedor:
         * - Atributo adicional: linguagens (List<String> - lista de linguagens que o desenvolvedor domina).
         * - O método calcularSalario() do Desenvolvedor deve retornar apenas o salarioBase.
         * (Pense em como ele pode se diferenciar futuramente).
         *
         * - Estagiario:
         * - Atributo adicional: horasTrabalhadas (int).
         * - O método calcularSalario() do Estagiario deve retornar um valor fixo por hora, por exemplo, horasTrabalhadas * 15.0.
         *
         * 5. Crie uma classe Empresa que contenha uma lista (por exemplo, ArrayList) de objetos Funcionario.
         *
         * 6. A classe Empresa deve ter os seguintes métodos:
         * - adicionarFuncionario(Funcionario f): Adiciona um funcionário à lista da empresa.
         * - listarTodosFuncionarios(): Percorre a lista e chama o método exibirDetalhes() de cada funcionário.
         * - calcularFolhaSalarialTotal(): Retorna a soma dos salários de todos os funcionários.
         *
         * 7. No método main, crie instâncias de Gerente, Desenvolvedor e Estagiario.
         * Adicione-os à sua Empresa e então liste todos os funcionários e calcule a folha salarial total.
         *
         * Conceitos chave a serem aplicados: Herança, Polimorfismo, Classes Abstratas, ArrayList.
         */

        Manager manage = new Manager("Gabriel" , "121313" , 2000);

    }
}
