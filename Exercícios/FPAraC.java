package Exercícios;
import java.util.Scanner;

public class FPAraC {

public static void main (String[] ars){

Scanner sc = new Scanner(System.in);

System.out.println("Digite a temperatura em  Fahrenheit: ");

double F = sc.nextDouble();
double C = (F - 32 ) * 5/9;

System.out.println(" A temperatura em c é: " + C);

      sc.close();

   } 
}