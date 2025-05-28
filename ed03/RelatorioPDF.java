/**
 * Representa um relatório em formato PDF que pode ser impresso.
 * Contém o nome do autor e o número total de páginas.
 */
class RelatorioPDF implements Imprimivel {
    /**
     * O nome do autor do relatório.
     */
    String autor;
    /**
     * O número total de páginas do relatório.
     */
    int numeroPaginas;

    /**
     * Construtor para a classe RelatorioPDF.
     * @param autor O nome do autor do relatório.
     * @param numeroPaginas O número total de páginas do relatório.
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Imprime os dados do relatório exibindo o nome do autor e o número total de páginas.
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.numeroPaginas);
    }
}