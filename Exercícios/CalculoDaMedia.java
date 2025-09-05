//Desenvolva o algoritmo de um programa para calcular a média de duas notas das
//avaliações de um aluno

package Exercícios;

import java.util.Scanner;

public class CalculoDaMedia {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota aqui: ");
        double nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = ( nota1 + nota2) / 2;

        System.out.println("Media do aluno é: " + media);

        if(media >= 7){

           System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }

         sc.close();


    }
    
}
