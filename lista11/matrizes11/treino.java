package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;
import utils.MostrarVetores;


public class treino {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

            char [][] ra = new char [5][10];
            char [] gabarito = new char[10];
            int []resultados = new int [5];


            for(int i = 0; i < 10;i++){
                char abcd;

                System.out.println("De o Gabarito(a, b, c ou d): ");

                do{
                    abcd = sc.next().toLowerCase().charAt(0);

                }while(abcd < 'a' || abcd > 'd');

                gabarito[i] = abcd;

            }
            System.out.println("--------------");


            for(int i =0;i < 5;i++){
                for(int j = 0;j < 10; j++){
;
                      char abcd;

                      System.out.println("escolha as respostas entre a e d");

                      do{
                         abcd = sc.next().toLowerCase().charAt(0);
                      }while(abcd < 'a' || abcd > 'd');

                    ra[i][j] = abcd;

                }

            }
             System.out.println("--------------");


            for(int i=0;i < 5;i++){
                int pontos=0;
                for(int j = 0; j < 10;j++){

                  if(ra[i][j] == gabarito[j]){
                    pontos++;

                  }
                }
                   resultados[i] = pontos;

            }
             System.out.println("--------------");

            System.out.println("pontuação dos alunos == ");

          

for (int i = 0; i < resultados.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + resultados[i]);
        }



           
           
           


            



        

    }
    
}
