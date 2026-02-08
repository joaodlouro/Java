package poo.classes.Guerreiro;

public class ClassGuerreiro {

    private int hp;
    private int ca;
    private String nome;
    private boolean escudo;
    private boolean duasEspadas;

    public ClassGuerreiro(String nome, int hp, int ca) {
        this.nome = nome;
        this.hp = hp;
        this.ca = ca;
        this.escudo = false;
        this.duasEspadas = false;
    }

    public void status() {
        System.out.println("Hp atual: " + hp);
        System.out.println("ca total: " + ca);
        System.out.println("nome do guerreiro: " + nome);
        System.out.println("está usando escudo? " + escudo);
        System.out.println("usando 2 espadas? " + duasEspadas);
        System.out.println("--------------");
    }

    public void usandoE() {
        escudo = true;
        duasEspadas = false;
    }

    public void nãoUsandoE() {
        escudo = false;
    }

    public void usando2Espadas() {
        if (!escudo) {
            duasEspadas = true;
        }
    }
}
