/**
 * Representa um documento de texto que pode ser impresso.
 * Contém um título e o conteúdo do texto.
 */
class DocumentoTexto implements Imprimivel {
    /**
     * O título do documento.
     */
    String titulo;
    /**
     * O conteúdo textual do documento.
     */
    String conteudo;

    /**
     * Construtor para a classe DocumentoTexto.
     * @param titulo O título do documento.
     * @param conteudo O conteúdo do documento.
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Imprime o documento exibindo o título em letras maiúsculas seguido pelo conteúdo.
     */
    @Override
    public void imprimir() {
        System.out.println(this.titulo.toUpperCase());
        System.out.println(this.conteudo);
    }
}