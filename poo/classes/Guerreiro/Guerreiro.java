package poo.classes.Guerreiro;

public class Guerreiro {

    public int hp;
    public int ca;
    public String nome;
    public boolean escudo;
    public  boolean duasEspadas;


    public void status(){

        System.out.println("Hp atual: " + hp);
        System.out.println("ca total: " + ca);
        System.out.println("nome do guerreiro: " + nome);
        System.out.println("está usando escudo? " + escudo);
        System.out.println("usando 2 espadas? " + duasEspadas);

    }


    public void usandoE(){ 
      this.escudo = true;
    }

    public void nãoUsandoE(){
        this.escudo = false;
    }

    public void usando2Espadas(){
        if(escudo == true){
            this.duasEspadas = false;

        } else{
            this.duasEspadas = true;
        }
    }

    
}
