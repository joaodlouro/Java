package Exercícios;
import java.util.Scanner;

public  class Treino{
    public static void main(String[]algo){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite graus em Fahrenheit");
    Double F = sc.nextDouble();

    Double C = (5.0 / 9.0) * (F - 32);

    System.out.printf("O valor é %.2f\n", C);

   sc.close();


    }



}
