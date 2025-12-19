package lista11.vetores11;
import java.util.Scanner;
import utils.MostrarVetores;

public class listaex4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);

        int [] v1 = new int [8];

         System.out.println("De valor para cada posição do vetor 1: ");

          for(int i =0;i < v1.length;i++){
              v1[i]= sc.nextInt();
        }

        
        System.out.println("Qual posição deseja que x seja? ");
        int x = sc.nextInt();

        System.out.println("Qual posição deseja que y seja? ");
        int y = sc.nextInt();


        int soma =0;

       soma = v1[x] + v1[y];

      
       System.out.println("----------------");

       System.out.println("soma de x e y == " + soma);


      sc.close();

    

    }
    
}

/*
Fac¸a um programa que leia um vetor de 8 posic¸ ˜oes e, em seguida, leia tamb ´em dois va-
lores X e Y quaisquer correspondentes a duas posic¸ ˜oes no vetor. Ao final seu programa
dever ´a escrever a soma dos valores encontrados nas respectivas posic¸ ˜oes X e Y .

*/
