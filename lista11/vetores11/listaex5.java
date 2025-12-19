package lista11.vetores11;
import java.util.Scanner;

import utils.MostrarVetores;

public class listaex5 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int [] v1 = new int [10];
    int quantosPares = 0;

    System.out.println("De valor para cada posição do vetor 1: ");


    for(int i =0;i < v1.length;i++){
       v1[i] = sc.nextInt();

       if(v1[i] % 2 == 0){
        quantosPares++;
       } 

    }
     MostrarVetores.mostraVetor(v1);

    System.out.println("------------------s");

    System.out.println("Quantidade de pares encontrados no vetor == " + quantosPares);
    }
}

/*

Leia um vetor de 10 posic¸ ˜oes. Contar e escrever quantos valores pares ele possui.

*/
