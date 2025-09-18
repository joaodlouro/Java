package Exercícios;
import java.util.Scanner;

public class Ninja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de ninjas: ");
        int ninjas = sc.nextInt();

        int execucoes = 0;
        int quantidade = 1; 

        while (quantidade < ninjas) {
            quantidade = quantidade * 2; 
            execucoes++;
        }

        if (quantidade == ninjas) {
            System.out.println(ninjas + " ninjas = " + execucoes + " execuções");
        } else {
            System.out.println("Número inválido! A quantidade precisa ser potência de 2.");
        }

        sc.close();
    }
}
