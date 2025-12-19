package lista11.vetores11;
import java.util.Scanner;
import utils.MostrarVetores;

public class listaex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] v1 = new double[10];
        double [] v2 = new double[10];

        System.out.println("De valor para cada posição do vetor 1: ");


         for(int i =0 ;i < v1.length;i++ ){

            v1[i]= sc.nextInt();
            v2[i]= v1[i] * v1[i];

         }

         MostrarVetores.MostrarVetoresDouble(v1);

         System.out.println("--------------------");

         MostrarVetores.MostrarVetoresDouble(v2);

    }
    
}

/*
Ler um conjunto de n ´umeros reais, armazenando-o em vetor e calcular o quadrado das
componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos t ˆem
10 elementos cada. Imprimir todos os conjuntos.

*/
