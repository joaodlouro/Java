package Exercícios;

public class Treino {
    public static void main(String[] args) {

     int  quadarado= 15;
     int furo = 5;

     int inicio = (quadarado - furo) / 2;
     int fim =  inicio  + furo - 1;

     for(int i =0;i < quadarado; i ++){
          for(int j = 0;j < quadarado ; j++){
             if(i == 0 || i == quadarado -1 || j ==0|| j == quadarado -1) {
                System.out.print("* ");
           
            } else if(i >= inicio && i <= fim && j >= inicio && j <= fim){
                System.out.print("  ");

            }
            else {
                System.out.print("* ");
            }
            

          }
        System.out.println();
     }
     


    }
}
