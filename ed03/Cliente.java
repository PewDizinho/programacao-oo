/**
 * Representa um usuário cliente do sistema.
 * Clientes podem se autenticar, com uma regra específica para a validação da senha.
 */
class Cliente extends Usuario implements Autenticavel {
    /**
     * Construtor para a classe Cliente.
     * @param login O nome de login do cliente.
     * @param senha A senha do cliente.
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o cliente.
     * A autenticação é bem-sucedida se a senha fornecida tiver mais de 6 caracteres
     * e corresponder exatamente à senha armazenada.
     * @param senha A senha a ser verificada.
     * @return {@code true} se a senha for válida, {@code false} caso contrário.
     */
    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}