package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex11 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double [] v1 = new double [10];
        double negativos =0;
        double somaPositivos =0;

        for(int i = 0 ;i < v1.length;i++ ){

            double numero = sc.nextDouble();
              
            if(numero > 0){
                somaPositivos += numero;
            } else if (numero < 0) {
                negativos++;
                
            }

            v1[i] = numero;

        }

        System.out.println("-----------------");

        System.out.println("Soma dos positivos nesse vetor == " + somaPositivos);

        System.out.println("-----------------");

        System.out.println("Qunatidade de numeros negativos nesse vetor == " + negativos);

        sc.close();



    }
    
}

/*
Fac¸a um programa que preencha um vetor com 10 n ´umeros reais, calcule e mostre a
quantidade de n ´umeros negativos e a soma dos n ´umeros positivos desse vetor.
*/
