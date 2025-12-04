package lista11.vetores11;
import utils.MostrarMatrizes;
import java.util.Scanner;

public class listaex2 {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int []v1 = new int[6];
  
     for(int i = 0; i < v1.length; i++){
        System.out.println("Digite os valores das posiçẽs " + i  + ": ");
        v1[i] = sc.nextInt();
     }



  MostrarMatrizes.mostraVetor(v1);


 }

}

// 2 .Crie um programa que l ˆe 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
