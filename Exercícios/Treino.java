package Exercícios;

import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de início do intervalo:");
        int inicio = sc.nextInt();

        System.out.println("Fim do intervalo:");
        int fim = sc.nextInt();

        int totalPrimos = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i < 2) continue; 
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i + " é primo!");
                totalPrimos++;
            }
        }

        if (totalPrimos == 0) {
            System.out.println("Nenhum número primo encontrado.");
        } else {
            System.out.println("Total de primos: " + totalPrimos);
        }

        sc.close();
    }
}
