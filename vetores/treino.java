package vetores;
import java.util.Scanner;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
 
           int [] v1 = new int [10];
           int [] v2 = new int[10];


           for(int i=0;i < 10; i++){
            System.out.println("Digite o valor da posiçao " + i);
            v1[i] = sc.nextInt();

           }

           for(int i = 0; i < 10; i++){
            v2[i] = v1[9 - i];

           }



               System.out.println("primeiro vetor: ");
               for(int i = 0 ; i < 10; i++){
                System.out.println(v1[i] + "");

               }


               System.out.println("segundo vetor: ");
               for(int i = 0;i < 10; i++){
                System.out.println(v2[i] + "");

               }

       


    }


    
}


// Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na
// ordem inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será
// o segundo e assim por diante. Imprima os dois vetores no final.