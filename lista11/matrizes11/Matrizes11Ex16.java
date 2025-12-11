package lista11.matrizes11;
import java.util.Scanner;

public class Matrizes11Ex16 {
    public static void main(String[] args) {
          
         Scanner sc = new Scanner(System.in);

         char [] gabarito = new char[10];
         char [][] respostas = new char [3][10];
         int []matriculas = new int [3];
         int [] notas = new int [3];
         
         System.out.println("Digite o Gabarito!");

         for(int i = 0;i < 10;i++){

            char abcde;

            do{
               abcde = sc.next().toLowerCase().charAt(0);
            }while(abcde < 'a' || abcde > 'e');

          gabarito[i] = abcde;

        }

        System.out.println("Respostas do aluno: ");

        for(int i = 0;i < 3;i++){
            System.out.println("Aluno " + (i +1));
            System.out.println("Matricula: ");
            matriculas[i] = sc.nextInt();
             
            System.out.println("Digite as 10 respostas do aluno: ");

            for(int j= 0; j < 10;j++){
                char abcde;
                do{
                    abcde= sc.next().toLowerCase().charAt(0);

                }while(abcde < 'a' || abcde > 'e');
               
                respostas[i][j]= abcde;

            }

        }

        int aprovados = 0;

        System.out.println("Resultado final");

        for(int i = 0;i < 3;i++){
            
            int nota=0;

            for(int j = 0;j < 10;j++){
                if(respostas[i][j] == gabarito[j]){
                   nota++;
                }
            }
        

            notas[i] = nota;
            if (nota >= 7) aprovados++;

            System.out.println("Aluno matrícula: " + matriculas[i]);

            System.out.print("Respostas: ");

            for (int j = 0; j < 10; j++) {

                System.out.print(respostas[i][j] +  " ");
            }

            System.out.println("\nNota: " + nota);
        }

        double percentual = (aprovados / 3.0) * 100;
        
        System.out.println("Percentual de aprovação: " + percentual + "%");
    }
}
    
/*
. Fac¸a um programa para corrigir uma prova com 10 quest ˜oes de m ´ultipla escolha (a, b,
c, d ou e), em uma turma com 3 alunos. Cada quest ˜ao vale 1 ponto. Leia o gabarito, e
para cada aluno leia sua matricula (n ´umero inteiro) e suas respostas. Calcule e escreva:
Para cada aluno, escreva sua matr´ıcula, suas respostas, e sua nota. O percentual de
aprovac¸ ˜ao, assumindo m ´edia 7.0.
*/