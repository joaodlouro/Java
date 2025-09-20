package Exercícios;
import java.util.Scanner;


public class Treino{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);


        System.out.println("qual o valor do ingresso?");
        double valori = sc.nextDouble();

         System.out.println("quantos socios?");
         int socios = sc.nextInt();

         System.out.println("quantas crianças?");
         int crianças = sc.nextInt();

         System.out.println("pessoasm sem desconto");
         int semdesconto = sc.nextInt();

       
        double Vcrinaças= crianças * valori;

        double VDesconto = socios * (valori * 0.30);

       double vsemd = semdesconto * valori;

       Double criançasV = crianças * valori;

       double valorS = socios * (valori * 0.70);

       double narrecadado = VDesconto + criançasV;

        double rendaT = vsemd + valorS;

        int totalP =  socios+ crianças + semdesconto;




         System.out.println("publico total"+ totalP);


         System.out.printf("renda total: %.2f.\n", rendaT) ;

          System.out.printf("nao arrecadado: %.2f.\n", narrecadado) ;
                               
                               
 
          sc.close();

                    

    }
}