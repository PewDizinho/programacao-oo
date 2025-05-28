/**
 * Classe principal para demonstrar o sistema de login.
 * Cria instâncias de diferentes tipos de usuários e testa suas funcionalidades de login,
 * autenticação e gerenciamento, quando aplicável.
 */
public class ProgramaLogin {
    /**
     * Método principal que executa o programa de login.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Administrador admin = new Administrador("admin", "admin123");
        Visitante guest = new Visitante("guest", "qualquer");
        Cliente joao = new Cliente("joao", "segredo123");

        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenhaAdmin");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");
        System.out.println();

        guest.exibirLogin();
        System.out.println();

        joao.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + joao.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + joao.autenticar("12345"));
    }
}