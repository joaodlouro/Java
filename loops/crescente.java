package loops;
import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        
         for(int i = 100;i <= 999; i++){

            int centenas = i /100;  // primeiro dígito 
            int dezena= (i / 10) % 10; // segundo
            int unidade = i % 10; // terceiro
             int produto = centenas * dezena * unidade;

            if(centenas < dezena && dezena < unidade){
               System.out.println("crescente: " + i );
               System.out.println("produto: "+produto);
            } 

            if(centenas > dezena && dezena > unidade){
               System.out.println("decrescente: " + i );
               System.out.println("prduto: "+produto);

            }

         }


    



       
}
}
