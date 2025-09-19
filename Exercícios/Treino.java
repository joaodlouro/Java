package Exercícios;
import java.util.Scanner;


public class Treino{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);


        System.out.println("Base");
        int B = sc.nextInt();

        System.out.println("Altura");
        int A = sc.nextInt();

        int T =  (B * A) / 2;

        System.out.println("área = " + T);

        sc.close();


        

                    

    }
}