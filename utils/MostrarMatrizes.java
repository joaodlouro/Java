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

public static void  RandomMatriz  (int [][] m){
    Random rm = new Random();
    
    for(int i = 0;i< m.length;i++){
        for(int j=0;j < m[i].length;j++){
          m[i][j]= rm.nextInt (50);
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
 }