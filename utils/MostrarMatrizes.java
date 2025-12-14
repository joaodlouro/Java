package utils;
import java.util.Random;
import java.util.Scanner;

public class MostrarMatrizes {
    

public static void mostraMatriz(int [][] m){
    
    for(int i = 0 ; i < m.length;i++){
        for(int j=0;j < m[i].length;j++){
            System.out.print(m[i][j]+ " ");
        }
        System.out.println();
    }
}

public static void mostraMatrizDouble(double[][] m) {

    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            System.out.printf("%.2f ", m[i][j]); // 
        }
        System.out.println();
    }
}

public static void  RandomMatrizInt  (int [][] m){
    Random rm = new Random();
    
    for(int i = 0;i< m.length;i++){
        for(int j=0;j < m[i].length;j++){
          m[i][j]= rm.nextInt (50);
        }
    }
   
}


public static void RandomMatrizDouble(double[][] m) {
    Random rm = new Random();

    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            m[i][j] = rm.nextDouble() * 50;
        }
    }
}


public static void IntNumerosMatriz(int [][]m){

    Scanner sc= new Scanner(System.in);

    for(int i = 0 ; i < m.length;i++){
        for(int j=0;j < m[i].length;j++){
            m[i][j]= sc.nextInt();
        }    
    }
}


public static void DoubleNumerosMatriz(double [][]m){

    Scanner sc= new Scanner(System.in);

    for(int i = 0 ; i < m.length;i++){
        for(int j=0;j < m[i].length;j++){
            m[i][j]= sc.nextDouble();
        }    
    }
}

 }
