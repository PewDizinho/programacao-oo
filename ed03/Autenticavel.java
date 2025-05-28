/**
 * Interface que define o contrato para objetos que podem ser autenticados.
 * Qualquer classe que implementa esta interface deve fornecer um método para verificar uma senha.
 */
interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida de acordo com as regras de autenticação do objeto.
     * @param senha A senha a ser verificada.
     * @return {@code true} se a senha for válida, {@code false} caso contrário.
     */
    boolean autenticar(String senha);
}
