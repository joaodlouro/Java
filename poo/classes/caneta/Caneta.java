 package poo.classes.caneta;
 

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;
    protected int carga;
    
    public void status (){
        System.out.println("uma caneta " + this.cor);
        System.out.println("tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("----------------");

    }

    //metodos

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