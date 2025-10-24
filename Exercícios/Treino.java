package Exercícios;

import java.util.Scanner;

public class Treino{
public static void main(String[] args) {

  Scanner sc= new Scanner(System.in);
  
  System.out.println("valor: ");
  int n = sc.nextInt();

  for(int i= 1;i <= n;i++){
    for(int j =1; j <= n; j++){
        System.out.print("  ");

    }

     for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

    System.out.println();




  }
  

}
}