package vetores;
import java.util.Scanner;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
       
         int [] v1 = new int [10];
         int i = 0;

         System.out.println("Digite 10 numeros diferentes");

         while(i < 10){
           
          System.out.println("Numero" + ( i + 1));
          int numeros = sc.nextInt();

          boolean repetido = false;

          for(int j = 0;j < i; j++){
            if(v1[j] == numeros){
              repetido = true;
              break;

            }

          }

          if(repetido){
            System.out.println("Numero devem ser diferentes!");
          } else {
            v1[i] = numeros;
            i++;

          }


         }

          int []  v2 = new int [10];

          for(int k = 0 ;k < v1.length; k++){
            v2[k]= v1[v1.length - 1 - k]; 

          }


         System.out.println("vetor original");
         for(int k=0; k < v1.length;k++ ){
          System.out.print(v1[k] + " ");

         }

          System.out.println(" Vetor invertido");
          for(int k = 0; k < v2.length; k++ ){

            System.out.println(v2[k] + " ");
          }

          sc.close();

        

    }
}
        
         
// Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na
// ordem inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será
// o segundo e assim por diante. Imprima os dois vetores no final.


//new == criar objeto


 // tamanho / largura do vetor
