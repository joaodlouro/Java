package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;


public class listaex9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] v1 = new int [6];

        int i =0;

        while(i < v1.length){

            int numero = sc.nextInt();

            if(numero % 2 ==0){
                v1[i] = numero;
                i++;

            }else{
                System.out.println("Digite um numero par: ");
            }     
           
        }
          
        System.out.println("Vetor inverso");

        for(int j = v1.length -1 ; j >= 0; --j){
            System.out.println(v1[j]);

        }


    }
    
}

/*
Crie um programa que l ˆe 6 valores inteiros pares e, em seguida, mostre na tela os valores
lidos na ordem inversa.

*/