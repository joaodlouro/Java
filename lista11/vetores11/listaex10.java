package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex10 {
    public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
        
      int [] notaAlunos = new int [15];
      
      int i = 0;
      int somaNotas =0;

       System.out.println("De a nota para os 15 alunos de 0 até 10");

      while(i < notaAlunos.length){

       
        int nota = sc.nextInt();

        
        if(nota >= 0 && nota <=10){
            notaAlunos[i]= nota;
            somaNotas += nota;
            i++;
            

        }else{
             System.out.println("Nota deve estar entre 0 e 10");
        }

      }

     double  mediaAlunos = (double) somaNotas / notaAlunos.length; // da para usar o i tbm

    System.out.println("--------------------");

       System.out.print("[ ");
    for(int j =0;j < notaAlunos.length;j++){
       
        System.out.print( notaAlunos[j]);
         

        if(j < notaAlunos.length -1){
            System.out.print(", ");

        }

    }
     System.out.println(" ]");


    System.out.println("--------------------");
    
    System.out.println("Media dos alunos" + mediaAlunos);


      sc.close();

      }   
    }
    


/*

 Fac¸a um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
e imprima a m ´edia geral.

*/
