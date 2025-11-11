package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero= 1;
        
    while(true){

       System.out.println("Digite um número (0 para sair): ");
         numero= sc.nextInt();

         if(numero <= 0){
            break;

         }
         boolean ehquadrado = false;
         


         for(int i = 1;i * i <= numero; i++){
            
          if( i* i == numero){
            ehquadrado = true;
            break;
        
    }

               
}

 if(ehquadrado ==true){
        System.out.println("O número " + numero + " é um quadrado perfeito.");
     } else {
        System.out.println("O número " + numero + " não é um quadrado perfeito.");

     }
    

 
    }
     sc.close();
}
}
