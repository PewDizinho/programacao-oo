/**
 * Classe principal para demonstrar o sistema de folha de pagamento.
 * Cria instâncias de diferentes tipos de funcionários e exibe seus dados e salários calculados.
 */
public class ProgramaFolha {
    /**
     * Método principal que executa o programa de folha de pagamento.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);

        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println();
        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}