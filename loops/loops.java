package loops;

public class loops {
    public static void main(String[] args) {
         

        int valor1 = 0;
        int valor2= 10; //vai executar pelo menos uma vez
        
        
        
        //exemplo do while

        while(valor1 <=10){
            System.out.println("valor: " + valor1);
            valor1 +=1;
             // || valor = valor +1 || valor++



        }
        System.out.println("//////////");
        //exemplo do while

        do {
            System.out.println("demostração do do while");
            System.out.println("valor:" + valor2);
            valor2 +=1;
        } while (valor2 <= 10);
        System.out.println("//////////");

        //exemplo for

        for(int i= 0;i <=10; i++){
            System.out.println("repetição: "  + i);

        }
        System.out.println("//////////");



    }
           


    
}
