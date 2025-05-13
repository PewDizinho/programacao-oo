/**
 * Classe Main. Teste do nosso sistema bancário raiz.
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaPaulo = new ContaCorrente("Paulo", 1000);
        ContaPoupanca contaAudrey = new ContaPoupanca("Audrey", 1500);
        ContaSalario contaJoao = new ContaSalario("Joao", 1200);

        contaPaulo.depositar(200); // Paulo ficou mais rica
        contaAudrey.sacar(100);     // Audrey comprou um lanche
        contaJoao.transferir(contaPaulo, 300); // Joao transferiu dinheiro para o Paulo

        contaPaulo.aplicarJurosDiarios();
        contaAudrey.aplicarJurosDiarios();
        contaJoao.aplicarJurosDiarios();

        contaPaulo.imprimirExtrato();
        contaAudrey.imprimirExtrato();
        contaJoao.imprimirExtrato();
    }
}
