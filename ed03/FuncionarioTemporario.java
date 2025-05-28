/**
 * Representa um funcionário temporário.
 * Este tipo de funcionário tem um desconto fixo aplicado ao seu salário base.
 */
class FuncionarioTemporario extends Funcionario {
    /**
     * Construtor para a classe FuncionarioTemporario.
     * @param nome O nome do funcionário temporário.
     * @param salarioBase O salário base do funcionário temporário.
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário temporário.
     * O cálculo é o salário base menos um desconto de R$ 100,00.
     * @return O salário final do funcionário temporário.
     */
    @Override
    public double calcularSalario() {
        return this.salarioBase - 100.0;
    }
}