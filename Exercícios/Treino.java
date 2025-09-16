package Exercícios;
import java.util.Scanner;

public class Treino{
public static void main (String[]PouN){
    Scanner sc = new Scanner( System.in);


System.out.println("declare um valor!");
int Valor = sc.nextInt();


if(Valor > 0){
    System.out.println("Valor positivo!");
} else if(Valor < 0 ){
    System.out.print("Valor negativo!");

} else{
    System.out.println("valor e 0");
}



sc.close();


}


}