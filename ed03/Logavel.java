/**
 * Interface que define o contrato para objetos que podem registrar logs de operações.
 */
interface Logavel {
    /**
     * Simula a gravação de um log de auditoria para uma operação específica.
     * @param operacao A descrição da operação a ser registrada no log.
     */
    void registrarLog(String operacao);
}
