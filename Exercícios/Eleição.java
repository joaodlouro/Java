// Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
// A entrada de dados será:
// ● Número total de eleitores;
// ● Número de votos válidos;
// ● Número de votos brancos;
// ● Número de votos nulos.
// O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
// relação ao total de eleitores):
// ● Percentual de votos válidos;
// ● Percentual de votos brancos;
// ● Percentual de votos nulos;

 package Exercícios;

import java.util.Scanner;

public class Eleição{
    public static void main (String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Numero total de Eleitores?");
    int NumeroTotalEleitores = sc.nextInt();

    System.out.println("quantos eleitores validos??");
    int VotosValidos = sc.nextInt();

    System.out.println("quantos eleitores com votos em branco??");
    int VotosBrancos = sc.nextInt();

    System.out.println("quantos eleitores com votos nulos??");
    int VotosNulos = sc.nextInt();

    if (VotosValidos + VotosBrancos + VotosNulos > NumeroTotalEleitores){
        System.out.println("Erro: A soma de votos excede o total");

    }else{
        double PercentualValidos = (VotosValidos * 100.0) / NumeroTotalEleitores;
        double PercentualBrancos = (VotosBrancos * 100.0) / NumeroTotalEleitores;
        double PercentualNulos = (VotosNulos * 100.0) / NumeroTotalEleitores;
           
        System.out.printf("Percentual Validos: %.2f%%\n  ", PercentualValidos);
        System.out.printf("Percentual Branco: %.2f%%\n ", PercentualBrancos);
        System.out.printf("Percentual Nulos: %.2f%%\n", PercentualNulos);

    }

    sc.close();

    }

    };







