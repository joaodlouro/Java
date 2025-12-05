package lista11.matrizes11;
import utils.MostrarVetores;
import java.util.Random;

public class Matrizes11Ex1 {
    public static void main(String[] args) {

      Random rm =  new Random();  
      int [][] m1 =  new int [4][4];
      int maior= 0;
      
      for(int i = 0;i < m1.length;i++){
        for(int j = 0 ; j < m1[i].length;j++){
          m1[i][j]= rm.nextInt(55);
          
          if(m1 [i][j]> 10){
           maior++;
          }

          System.out.print(m1[i][j] + " ");

        }
        System.out.println();
        }

        System.out.println("possui " + maior + " maiores que 10");

      }

    }


    // 1 : Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui
