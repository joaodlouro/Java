
package Exercícios;
import java.util.Scanner;
public class Treino{
    public static void main (String[]args){

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite um valor numerico valido");

      if(sc.hasNextInt()){

        int valor = sc.nextInt();
        int Quadarado = valor * valor;

        System.out.println("Valor quadrado é:" + Quadarado);
 
      } else{
        System.out.println (" Isso não e um valor valido!!!");
      }
      sc.nextInt();

    }

}