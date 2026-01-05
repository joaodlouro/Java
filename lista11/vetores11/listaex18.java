package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex18 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int v1[] = new int [4];

        System.out.println("De valores para posições do vetor v1: ");

        MostrarVetores.PrencherVetorInt(v1);

        System.out.println("De valor de x");

        int numeroX= sc.nextInt();
        int contatorX=0;

        for(int i =0; i < v1.length;i++){

            if(v1[i] % numeroX ==0){

                System.out.println("Numero " + v1[i] + " e multiplo de x");
                contatorX++;

           }
       

        }
        System.out.println("Numeros total que são multiplos de x == "+ contatorX );

    
        sc.close();
    }
    
}

/*
Fac¸a um programa que leia um vetor de 10 n ´umeros. Leia um n ´umero x. Conte os
m ´ultiplos de um n ´umero inteiro x num vetor e mostre-os na tela.
*/
