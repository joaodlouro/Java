
package Exercícios;
import java.util.Scanner;

class JogoDaVelha {
    public static void main (String[]args){

 Scanner sc = new Scanner(System.in);

 System.out.println("quantos digite um numero maior que 10");
 int numero = sc.nextInt();


 if(numero > 10){

     System.out.println("Sucesso, acesso liberado");
 }else{

     System.out.println("acesso negado!");
 }

sc.close();


    }

    
}