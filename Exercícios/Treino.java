package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você está ai?");
        String resposta = sc.nextLine(); 

        if(resposta.equalsIgnoreCase("sim")) {
            System.out.println("oi, você deve");
        } else if(resposta.equalsIgnoreCase("não")) {
            System.out.println("não faça isso...");
        } else {
            System.out.println("Você não existe!");
        }

        sc.close();
    }
}
