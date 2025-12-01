package vetores;

import java.util.Scanner;

public class matrizes {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
         
     int [] []  v1d2 = new int [4] [4];


     int somal= 0 ;
     int somacoluna1= 0;
     int somadiagonal1 = 0;
     int somatotal = 0;


     System.out.println("Digite 16 valores da matriz 4x4");

     for(int i = 0;i < 4; i++ ){

        for(int j = 0;j < 4;j++){
            System.out.println("Elemento " + (i + 1) + ", " + (j+1)+ ": " );
            int valor = sc.nextInt();

             v1d2[i][j] = valor;      

            somatotal = valor + somatotal;
            
             if(i == 1){
                somal = somal + valor;
             }
             if(j ==  0){
               somacoluna1 += valor;
             }
             if(i == j){
                somadiagonal1 += valor;

             }

        }

     }

     System.out.println("Matriz: ");

     for(int i = 0 ; i < 4; i++){
        for(int j = 0; j < 4; j++){
            System.out.println(v1d2[i][j] + "\t");

        }
        System.out.println();

     }


        System.out.println("\nSoma da linha 2: " + somal);
        System.out.println("Soma da coluna 1: " + somacoluna1);
        System.out.println("Soma da diagonal principal: " + somadiagonal1);
        System.out.println("Soma de toda a matriz: " + somatotal);



     

    }
    
}




// Escreva um algoritmo para ler uma matriz 4x4, calcular e escrever as seguintes somas dos elementos
// que estão armazenados:
// a. na linha 2 da matriz.
// b. na coluna 1 da matriz.
// c. na diagonal principal da matriz.
// d. em toda matriz
