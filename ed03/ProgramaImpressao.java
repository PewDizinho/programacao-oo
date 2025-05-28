/**
 * Classe principal para demonstrar o sistema de impressão de diferentes tipos de conteúdo.
 * Cria instâncias de objetos imprimíveis e chama seus respectivos métodos de impressão.
 */
public class ProgramaImpressao {
    /**
     * Método principal que executa o programa de impressão.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        DocumentoTexto doc = new DocumentoTexto("DOCUMENTO DE APRESENTAÇÃO", "Este é o conteúdo do documento.");
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("DISTRIBUIÇÃO DE VENDAS", "Barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);

        doc.imprimir();
        System.out.println();
        img.imprimir();
        System.out.println();
        grafico.imprimir();
        System.out.println();
        relatorio.imprimir();
    }
}