package Exercícios;

import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros:");
        double litros = sc.nextDouble();

        System.out.println("Digite o tipo de combustível (A-álcool / G-gasolina):");
        String tipo = sc.next();

        double precoLitro = 0;
        double desconto = 0;

        if (tipo.equalsIgnoreCase("A")) {
            precoLitro = 3.90;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo.equalsIgnoreCase("G")) {
            precoLitro = 4.30;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            sc.close();
            return;
        }

        double valorBruto = litros * precoLitro;
        double valorDesconto = valorBruto * desconto;
        double valorFinal = valorBruto - valorDesconto;

        System.out.printf("Valor a ser pago: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
