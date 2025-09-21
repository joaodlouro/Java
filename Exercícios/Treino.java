package Exercícios;
import java.util.Scanner;


public class Treino{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);


double[] valoresc = {1.0, 0.50, 0.25, 0.10, 0.05};

int[] quantidade = new int [valoresc.length];


String [] tipos = {"1 real", "50 centavos", "25 centavos", "10 centavos", " 5 centavos"};




 System.out.println("qual o preço?");
      double preço = sc.nextDouble();


     for (int i = 0; i < quantidade.length; i++) {
            System.out.print("Quantidade de moedas de " + tipos[i] + ": ");
            quantidade[i] = sc.nextInt();
        }

        double totalC = 0;

        for (int i = 0; i < quantidade.length; i++) {
            totalC += quantidade[i] * valoresc[i];
        }

 
        System.out.printf("Total no cofrinho: R$ %.2f%n", totalC);

         if (totalC >= preço) {
            System.out.println("Você pode comprar o produto!");
        } else {
            System.out.println("Saldo insuficiente para comprar o produto.");
        }















                                    
     


       




          sc.close();

                    

    }
}