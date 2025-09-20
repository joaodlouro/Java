package Exercícios;
import java.util.Scanner;


public class Treino{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Numero total de leitrores");
        int total= sc.nextInt();

        System.out.println("Numero de votos validos");
        int validos= sc.nextInt();

        System.out.println("Votos en brancos");
        int brancos= sc.nextInt();

        System.out.println("votos nulos");
        int nulos= sc.nextInt();

        double Pvalidos = (validos * 100.0) / total;

        double PBrancos = (brancos * 100.0) / total;

        double PNulos = (nulos * 100.0) / total;

      System.out.printf(
     "P válidos: %.2f%%\nP brancos: %.2f%%\nP nulos: %.2f%%\n",  Pvalidos, PBrancos, PNulos
);

        

          
 
          sc.close();

                    

    }
}