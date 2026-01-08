package lista11.vetores11;
import java.util.Scanner;

import utils.MostrarVetores;

public class listaex26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []v = new int[3];

        double soma = 0;
 

        for(int i = 0 ; i < v.length;i++){

            int numero = sc.nextInt();
            v[i] = numero;

            soma += v[i];
         
        }

        double media = soma / v.length;
        double quadrado = 0;
        for(int i=0;i < v.length;i++){
            
            double diferença = v[i] - media;

            quadrado += diferença * diferença;

        }

         double variancia = quadrado / v.length;
        double desvioPadrao = Math.sqrt(variancia);

        System.out.println("Média: " + media);
        System.out.println("Desvio padrão: " + desvioPadrao);

        sc.close();

     

    

 



    }
    
}
/*
Fac¸a um programa que calcule o desvio padr ˜ao de um vetor v contendo n = 10 n ´umeros,
onde m ´e a media do vetor.

*/
