package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex2 {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
   int []v1 = new int[6];

   System.out.println("De valor para cada posição do vetor 1: ");
    

    for(int i =0;i < v1.length;i++){
      
      v1[i]= sc.nextInt();

    } 
    System.out.println("-----------");

    MostrarVetores.mostraVetor(v1);
    
    sc.close();

 }

}

// 2 .Crie um programa que l ˆe 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
