/**
 * Representa uma imagem digital que pode ser impressa.
 * Contém o nome do arquivo e sua resolução.
 */
class ImagemDigital implements Imprimivel {
    /**
     * O nome do arquivo da imagem.
     */
    String nomeArquivo;
    /**
     * A resolução da imagem (ex: "1920x1080").
     */
    String resolucao;

    /**
     * Construtor para a classe ImagemDigital.
     * @param nomeArquivo O nome do arquivo da imagem.
     * @param resolucao A resolução da imagem.
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Imprime os dados da imagem exibindo o nome do arquivo e sua resolução.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + this.nomeArquivo);
        System.out.println("Resolução: " + this.resolucao);
    }
}