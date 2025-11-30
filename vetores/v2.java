package vetores;
import java.util.Scanner;

public class v2 {
    public static void main(String[] args) {
    
        Scanner sc= new Scanner (System.in);

        System.out.println("informe um valor inteiro: ");
        int n= sc.nextInt(); //tamnho

        int v1 [] = new int [50];

        v1[0] = 1;


        for(int i = 0; i < n;i++ ) {
          
           int aux1= 0, aux2;  //auxiliar
          for(int j = 0;j <= i; j ++ ){
            aux2 = aux1 + v1[j];
            aux1= v1[j];
            v1[j] = aux2; 
            System.out.printf("%3d", v1[j]);


          }
          System.out.println();

        }



        


    
        

    }
    
}




// Escreva um programa que leia um número inteiro positivo N e em seguida imprima N linhas do
// chamado Triângulo de Pascal. Obs: será necessário criar vetores dinamicamente.
// Considere que N > 2
// A próxima linha do triângulo é obtida a partir da soma dos elementos da linha
// anterior, por exemplo a linha 1 4 6 4 1 tem os valores 4 = 1 + 3; 6 = 3 + 3; 4 = 3 +
// 1; e então são adicionados dois valores 1, no início e no final do vetor.








