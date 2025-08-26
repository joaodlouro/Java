import java.util.Scanner;


public class CedulasDocs {
    public static void main (String[] args){

        Scanner in;
        in= new Scanner (System.in);
        int valor, n100, n50, n10;

        System.out.println ("Informar quanto deseja sacar'");
        valor = in.nextInt();

        n100 = valor / 100;
        int falta = valor % 100;
        n50 = falta / 50;
        falta = (falta % 50) / 10;

        System.out.println(n100 + "x 100");
        System.out.println(n50 + "x 50");
        System.out.println(falta + "x 10");

        in.close();
    }
    
}





