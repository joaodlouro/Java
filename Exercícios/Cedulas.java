package Exercícios;
import java.util.Scanner;

public class Cedulas { 
    public static void main (String[]cedula){
  
   Scanner teclado = new Scanner(System.in);
    

    System.out.println("Digite o valor que deseja sacar: ");
    int valor = teclado.nextInt();

    int[] notas = {100, 50, 10};
    int resto = valor;

        for(int nota : notas){
        int quantidade = resto / nota;
        resto = resto % nota;
        System.out.println(quantidade + " nota(s) de R$ " + nota);
    }

    if (resto != 0){
        System.out.println("Valor indisponível para saque");
    }

    teclado.close();

}
}


// import java.util.Scanner;


// public class Cedulas {
//     public static void main (String[] args){

//         Scanner in;
//         in= new Scanner (System.in);
//         int valor, n100, n50, n10;

//         System.out.println ("Informar quanto deseja sacar'");
//         valor = in.nextInt();

//         n100 = valor / 100;
//         int falta = valor % 100;
//         n50 = falta / 50;
//         falta = (falta % 50) / 10;

//         System.out.println(n100 + "x 100");
//         System.out.println(n50 + "x 50");
//         System.out.println(falta + "x 10");

//         in.close();
//     }
    
// }



