package Exercícios;


public class Treino{
    public static void main(String[] args) {
        
     int quadrado= 15;
     int tamanhoFuro = 5;

     int inicio = (quadrado - tamanhoFuro) / 2;
     int fim = inicio + tamanhoFuro -1;


     for(int i=0;i < quadrado; i++){
        for(int j=0; j < quadrado; j++){
            
             if(i == 0 || i == quadrado -1 || j ==0 || j == quadrado -1){
                System.out.print("* ");
        } else if(i >= inicio && i<= fim && j >= inicio && j <= fim){
                  System.out.print("  ");
        } else{
            System.out.print("* ");

        }
        }
        System.out.println();
        
     }
        
     


    }


}