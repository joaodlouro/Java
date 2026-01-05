package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []v1 = new int [10];
        int v2[] = new int [10]; //deve ter outra forma;
            
        
        for(int i =0; i < v1.length;){

            int valor = sc.nextInt();

            if(valor >=0 && valor <=50){

                v1[i]= valor;
                i++;

            }else{
                System.out.println("valores devem estar entre 0 e 50");
                
            }

            
        }

        int quatidadeImpares= 0;

        for(int i=0 ;i < v1.length;i++){
            if(v1[i]% 2 !=0){

                v2[quatidadeImpares] = v1[i];
                quatidadeImpares++;
            }

        }


      
        MostrarVetores.mostraVetor(v1);
        System.out.println("----------------");
       for(int i =0;i < quatidadeImpares;i++){
        System.out.print(v2[i]+ " ");

       

       }

    
    }
    //fazer novamente
    
}


/*
Escreva um programa que leia n ´umeros inteiros no intervalo [0,50] e os armazene em um
vetor com 10 posic¸ ˜oes. Preencha um segundo vetor apenas com os n ´umeros ´ımpares
do primeiro vetor. Imprima os dois vetores, 2 elementos por linha.
*/