package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex16 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double [] v1 = new double [5];

    System.out.println("escolhas o valor de cada posição do vetor");

    MostrarVetores.PrencherVetorDouble(v1);

    
    while(true){

     System.out.println("Escolha entre 1 ,2 e 0 para sair do loop");
     
     int Escolha = sc.nextInt();

        if(Escolha == 0){
            break;

        } else if(Escolha == 1){
            MostrarVetores.MostrarVetoresDouble(v1);

        } else if(Escolha == 2){
            for(int i = v1.length -1;i >= 0;i-- ){
                System.out.println(v1[i]);

            }

            }else{
                System.out.println("valores devem ser entre 0 e 2!");
            }

        }

     
          sc.close();

    }

    }



/*
   Fac¸a um programa que leia um vetor de 5 posic¸ ˜oes para n ´umeros reais e, depois, um
c ´odigo inteiro. Se o c ´odigo for zero, finalize o programa; se for 1, mostre o vetor na ordem
direta; se for 2, mostre o vetor na ordem inversa. Caso, o c ´odigo for diferente de 1 e 2
escreva uma mensagem informando que o c ´odigo ´e inv ´alido\
*/
