// Faça um programa que leia dois números inteiros positivos: lin e col. Desenhe um
// retângulo usando o valor de lin e col.
// Exemplo: lin=5 e col =10
// -----------
// |         |
// |         |
// |         |
// |         |
// |         |
// -----------


package loops;
import java.util.Scanner;
public class retangulo {
    public static void main(String[]args) {
   Scanner sc= new Scanner(System.in);
  System.out.println("quantidade de linhas");
   int lin = sc.nextInt();
   System.out.println("quantidade de colunas");
   int col = sc.nextInt();

   for(int i= 0; i < lin +2; i++){
    for(int j= 0; j< col +2;j++){
        if(i== 0 || i == lin +1){
        System.out.print("-");

        }else if(j== 0 || j == col+1){
                  System.out.print("|");
        }else{ 
            System.out.print(" ");
        }


    }
    System.out.println();
   }
   sc.close();
   
    }
}

















    

