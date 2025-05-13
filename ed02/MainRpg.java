/**
 * Classe MainRpg - Aqui rola a luta
 */
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro icarus = new Guerreiro("Ícarus");
        Mago harry = new Mago("Harry");
        Arqueiro apollo = new Arqueiro("Apollo");

        icarus.status();
        harry.status();
        apollo.status();

        icarus.atacar(harry);
        harry.usarHabilidadeEspecial();
        apollo.usarHabilidadeEspecial();

        icarus.status();
        harry.status();
        apollo.status();
    }
}
