package Exercícios;


public class Treino{
    public static void main(String[] args) {
        
     int quadrado= 15;


     for(int i=0;i < quadrado; i++){
        for(int j=0; j < quadrado; j++){
            
             if(i == 0 || i == quadrado -1 || j ==0 || j == quadrado -1){
                System.out.print("* ");
        } else if(i < quadrado && i > quadrado -10 && j < quadrado && j > quadrado -50){
                  System.out.print("  ");
        } else{
            System.out.print("* ");

        }
        }
        System.out.println();
        
     }
        
     


    }


}