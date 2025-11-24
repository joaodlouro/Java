package vetores;
import java.util.Scanner;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
 
    
         String meses [] = {"jan ", "fev ", "mar ", "abril ", "maio ", "junho ","julho ","agosto ","setembro ", "outubro ", "novembro ","dezembro "};

         int dias [] = {31, 28,31,30,31,31,30,31,30,31,30,31};
         

         for(int i= 0 ; i <= meses.length -1; i++){
            System.out.println("o mes de " + meses[i] + "tem " + dias[i] + " dias ao todo ");


         }

    }
}
        
         
    



// Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na
// ordem inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será
// o segundo e assim por diante. Imprima os dois vetores no final.


//new == criar objeto


 // tamanho / largura do vetor
