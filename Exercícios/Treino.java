package Exercícios;
import java.util.Scanner;;

public class Treino {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in); 
      System.out.println(" numero inteiro positivo: ");
      int n = sc.nextInt();

      int o = n;
      int intervalo = 0;

      while(n > 0 ){
        int digito = n % 10;
       
        intervalo = intervalo * 10  + digito;

        n = n / 10;

      }
       
      if(o == intervalo){
        System.out.println(" é palindromo ");
      } else {
        System.out.println(" não é palindromo ");

      }
      sc.close();
      
      
    }
}