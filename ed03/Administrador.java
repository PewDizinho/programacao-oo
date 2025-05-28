/**
 * Representa um usuário administrador do sistema.
 * Administradores podem autenticar, gerenciar suas senhas, ser bloqueados e registrar logs.
 */
class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {
    /**
     * Construtor para a classe Administrador.
     * @param login O nome de login do administrador.
     * @param senha A senha do administrador.
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o administrador verificando se a senha fornecida corresponde à senha armazenada.
     * @param senha A senha a ser verificada.
     * @return {@code true} se a senha for igual à armazenada, {@code false} caso contrário.
     */
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    /**
     * Altera a senha armazenada do administrador.
     * @param novaSenha A nova senha a ser definida.
     */
    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    /**
     * Bloqueia o administrador, exibindo uma mensagem de sucesso.
     */
    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    /**
     * Registra uma operação no log, imprimindo a operação formatada.
     * @param operacao A descrição da operação a ser registrada.
     */
    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}
