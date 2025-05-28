/**
 * Representa um usuário visitante do sistema.
 * Visitantes têm acesso restrito e não implementam interfaces de autenticação ou gerenciamento.
 */
class Visitante extends Usuario {
    /**
     * Construtor para a classe Visitante.
     * @param login O nome de login do visitante.
     * @param senha A senha do visitante (geralmente não utilizada para autenticação).
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    /**
     * Exibe uma mensagem indicando que o visitante tem acesso restrito ao sistema.
     * Sobrescreve o método {@code exibirLogin} da classe {@code Usuario}.
     */
    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
