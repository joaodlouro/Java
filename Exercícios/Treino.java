package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tipo de combustível? (A para Alcool e G para Gasolina)");
        String Tipo = sc.nextLine();

        System.out.println("Quantos litros deseja usar?");
        int Litros = sc.nextInt();

        double preco, desconto;

        if (Tipo.equalsIgnoreCase("A")) {
            preco = 3.90;
            desconto = (Litros <= 20) ? 0.03 : 0.05;
        } else if (Tipo.equalsIgnoreCase("G")) {
            preco = 4.30;
            desconto = (Litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Valor inválido!");
            return; 
        }

        double Total = Litros * preco * (1 - desconto);

     System.out.printf("valor a ser pao é:%.2f\n", Total);

        sc.close();
    }
}
