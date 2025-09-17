package Exercícios;
import java.util.Scanner;

public class Treino{
    public static void main(String[]Notas){
        Scanner sc= new Scanner(System.in);

      System.out.println("Digite a nota do aluno A");
      Double n1= sc.nextDouble(); 


      System.out.println("Digite a nota aluno B");
        Double n2= sc.nextDouble(); 


      System.out.println("Digite a nota  aluno C");
        Double n3= sc.nextDouble(); 

    

        Double Media = (n1 + n2 + n3) / 3.0;

        if(Media >= 9.0){
            System.out.println("Centeito A");
           
        } else if(Media >= 7.5){
             System.out.println("Centeito B");
            

        } else if(Media >= 6.0){
             System.out.println("Centeito C");
          
        } else{
             System.out.println("Centeito D");       
        }
          System.out.printf("Media: %.2f\n", Media);

        sc.close();


       
    }
}