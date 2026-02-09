package poo.classes.caneta;



public class classCaneta {
    public static void main(String[] args) {
        
      Caneta c1 = new Caneta();

      c1.modelo = "Novo modelo c1";

      c1.cor = "azul";
      
      c1.carga = 100;
      c1.tampar();
    

      //c1.tampada = true;
      c1.rabiscar();

      c1.status();



    }
    
}
