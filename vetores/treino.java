package vetores;
import java.util.Arrays;
import java.util.Scanner;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
 
        int v1[] = {3,4,2,3,5,6,4};
        Arrays.sort(v1);
        for(int vetorlist:v1){

            System.out.println(vetorlist);

        }
        System.out.println("--------------");

        int p = Arrays.binarySearch(v1, 3); // “Java, procure o valor 2 no vetor e me diga a posição dele.”

        System.out.println(p);
       




    }
}
        
         
    



// Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na
// ordem inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será
// o segundo e assim por diante. Imprima os dois vetores no final.


//new == criar objeto


 // tamanho / largura do vetor
