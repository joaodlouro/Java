package Exercícios;
import java.util.Scanner;


public class Treino{

  public static void main(String[]Notas){
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Valor da nota 1");
    Double n1 = sc.nextDouble();

     System.out.println("Valor da nota 2");
    Double n2 = sc.nextDouble();

     System.out.println("Valor da nota 3");
    Double n3 = sc.nextDouble();

    Double Media = (n1 + n2 + n3) / 3.0;

    if(Media >= 9.0){
      System.out.println("Conceito A");

    } else if(Media >= 7.5){
       System.out.println("Conceito B");

    } else if (Media >= 6.0){
       System.out.println("Conceito C");
    } else {
       System.out.println("Conceito D");
    }

    System.out.printf("A media foi: %.2f\n", Media);
        
    sc.close();

  }
}