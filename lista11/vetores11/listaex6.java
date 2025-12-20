package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex6 {
    public static void main(String[] args) {

        int []v1 = new int [10];

        System.out.println("De valores para o vetor 1: ");

        MostrarVetores.PrencherVetorInt(v1);

        int MaiorElementov1 = v1[0]; 
        int MenorElementov1= v1[0];

        for(int i =0;i < v1.length;i++){

            if(v1[i] > MaiorElementov1){
                MaiorElementov1 = v1[i];

            }

            if(v1[i] < MenorElementov1){
                MenorElementov1= v1[i];

            }
        }

        System.out.println("Maior elemento do vetor 1: "+MaiorElementov1);

        System.out.println("Menor elemento do vetor 1: "+MenorElementov1);

    }
    
}


/*

Fac¸a um programa que receba do usu ´ario um vetor com 10 posic¸ ˜oes. Em seguida dever ´a
ser impresso o maior e o menor elemento do vetor.

*/