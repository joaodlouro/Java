package Exercícios;
import java.util.Scanner;



public class Treino{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

    System.out.println("Total eleitores");
    int eleitores = sc.nextInt();

    System.out.println("votos validos?");
    int VotosV = sc.nextInt();

    System.out.println("Votos em branco:");
    int Branco = sc.nextInt();


    System.out.println("Votos nulos:");
    int Nulos = sc.nextInt();
     
    Double PVotosV = (VotosV *100.0) / eleitores; 
    Double PBrancos = (Branco * 100.0) / eleitores;
    Double PNulos =  (Nulos * 100.0) / eleitores;


    System.out.printf("Percentual de votos válidos: %2f\n", PVotosV);

    System.out.printf("Percentual de votos Brancos: %2f\n", PBrancos);

    System.out.printf("Percentual de votos Nulos: %2f\n", PNulos );

    sc.close();
  


        

      
    }

}