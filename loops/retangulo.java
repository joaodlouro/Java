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


for(int lin = 0; lin < 5; lin++){
    for(int col = 0; col < 10; col++){
        if(lin == 0 || lin == 
        4 || col == 0 || col == 9){
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();

}
}
}












    

