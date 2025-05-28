/**
 * Representa um funcionário contratado sob o regime CLT.
 * Este tipo de funcionário recebe um adicional fixo ao seu salário base.
 */
class FuncionarioCLT extends Funcionario {
    /**
     * Construtor para a classe FuncionarioCLT.
     * @param nome O nome do funcionário CLT.
     * @param salarioBase O salário base do funcionário CLT.
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário CLT.
     * O cálculo é o salário base mais um adicional de R$ 300,00.
     * @return O salário final do funcionário CLT.
     */
    @Override
    public double calcularSalario() {
        return this.salarioBase + 300.0;
    }
}