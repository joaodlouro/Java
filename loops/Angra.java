//  Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material
// radioativo. Sabendo-se que este perde 25% de sua massa a cada 30 segundos.
// Escrever um algoritmo em Java que calcule iterativamente e imprima o tempo
// necessário para que a massa deste material se torne menor que 0,10 grama


package loops;

public class Angra  {
    public static void main(String[] args) {

        double massa = 100.0;

        double tempo= 0.0;

        while(massa >=0.10){
            massa= massa * 0.75;
            tempo= tempo +30;
            System.out.printf("Massa: %.2f g, Tempo: %.0f segundos%n", massa, tempo);

        }


     
}

}
