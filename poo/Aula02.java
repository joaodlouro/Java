package poo;
import poo.classes.Caneta;
import vetores.v2;


public class Aula02 {
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
 
        //chamando os metodos
        c1.status();
        c1.tampar();
        c1.rabiscar();

        System.out.println("------------------------");

        Caneta c2 = new Caneta();

        c2.modelo = "novo modelo2";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 2;

        c2.status();    
        c2.destampar();
        c2.rabiscar();





    }
    
}
