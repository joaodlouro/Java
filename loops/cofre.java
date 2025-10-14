 
// Faça um programa que leia o valor de um produto X e leia a quantidade de reais de
// um cofrinho que contenha:
// ♦ N moedas de 1 real;
// ♦ N moedas de 50 centavos;
// ♦ N moedas de 25 centavos;
// ♦ N moedas de 10 centavos;
// ♦ N moedas de 5 centavos;
// O programa deverá verificar se o total de reais que contém no cofrinho é o bastante
// para a compra o produto X.

///////////////////////////


package loops;
import java.util.Scanner;


public class cofre{
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