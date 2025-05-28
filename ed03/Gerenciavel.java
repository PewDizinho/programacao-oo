/**
 * Interface que define o contrato para objetos que podem ser gerenciados.
 * Isso inclui funcionalidades como alteração de senha e bloqueio de usuário.
 */
interface Gerenciavel {
    /**
     * Altera a senha do usuário para uma nova senha fornecida.
     * @param novaSenha A nova senha a ser definida.
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o usuário, impedindo seu acesso ao sistema.
     */
    void bloquearUsuario();
}