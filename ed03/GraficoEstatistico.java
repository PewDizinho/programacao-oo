/**
 * Representa um gráfico estatístico que pode ser impresso.
 * Contém um título e o tipo do gráfico (ex: "pizza", "barra").
 */
class GraficoEstatistico implements Imprimivel {
    /**
     * O título do gráfico.
     */
    String titulo;
    /**
     * O tipo do gráfico (ex: "pizza", "barra").
     */
    String tipoGrafico;

    /**
     * Construtor para a classe GraficoEstatistico.
     * @param titulo O título do gráfico.
     * @param tipoGrafico O tipo do gráfico.
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Imprime os dados do gráfico exibindo o tipo do gráfico seguido pelo título em caixa alta.
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + this.tipoGrafico.toUpperCase());
        System.out.println("Título: " + this.titulo.toUpperCase());
    }
}