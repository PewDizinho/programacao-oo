/**
 * Representa um usuário genérico do sistema com login e senha.
 * Esta é uma classe abstrata que fornece uma base para diferentes tipos de usuários.
 */
abstract class Usuario {
    /**
     * O nome de login do usuário.
     */
    String login;
    /**
     * A senha do usuário.
     */
    String senha;

    /**
     * Construtor para a classe Usuario.
     * @param login O nome de login do usuário.
     * @param senha A senha do usuário.
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o nome de login do usuário.
     */
    public void exibirLogin() {
        System.out.println("Login: " + this.login);
    }
}