package vetores;
import java.util.Arrays;
import java.util.Scanner;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
 
       int v1[] =  new int[5];

      Arrays.fill ( v1, 10);
   
      for(int colocandovalores : v1){
        System.out.println(colocandovalores);

      }

    }
}
        
         
// Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na
// ordem inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será
// o segundo e assim por diante. Imprima os dois vetores no final.


//new == criar objeto


 // tamanho / largura do vetor
