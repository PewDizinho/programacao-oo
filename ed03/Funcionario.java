/**
 * Representa um funcionário genérico com nome e salário base.
 * Esta é uma classe abstrata que define a estrutura comum para diferentes tipos de funcionários.
 */
abstract class Funcionario {
    /**
     * Nome do funcionário.
     */
    String nome;
    /**
     * Salário base do funcionário.
     */
    double salarioBase;

    /**
     * Construtor para a classe Funcionario.
     *
     * @param nome        O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe o nome e o salário base do funcionário.
     */
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário Base: " + this.salarioBase);
    }

    /**
     * Calcula o salário final do funcionário.
     * Este método deve ser implementado pelas subclasses para definir a lógica específica de cálculo.
     *
     * @return O salário final calculado.
     */
    public abstract double calcularSalario();
}
