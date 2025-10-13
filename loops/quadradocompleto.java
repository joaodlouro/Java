package loops;
import java.util.Scanner;
public class quadradocompleto {

public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

     System.out.println("De um valor para o quadrado!");
    int quadrado= sc.nextInt();
    
    for(int i =0 ;i < quadrado; i++){
        for(int j=0; j < quadrado; j++){ 
            System.out.print("* ");
        }
         System.out.println();

    }

   
    sc.close();


}
    
}
