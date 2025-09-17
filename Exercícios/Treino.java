package Exercícios;
import java.util.Scanner;


public class Treino{
public static void main (String[]formula){
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Digite valor em  graus Fahrenheit para converção para Celsius. ");
    Double F =  sc.nextDouble();


    Double C =  (5.0 / 9.0)  * (F - 32);
    
    System.out.printf("Valor da conversão:%.2f\n", C );


  sc.close();

}




}