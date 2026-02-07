 package poo.classes;
 

public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;
    public boolean tampada;
    public int carga;
    
    public void status (){
        System.out.println("uma caneta " + this.cor);
        System.out.println("tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);

    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro ");

        }else{
            System.out.println("Pode rabiscar! ");
        }
        
    }

    public void tampar(){
        this.tampada = true;

    }

    public void destampar(){
        this.tampada = false;
        
    }


     
}