package Classes;


public class ProgramaCaneta {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        System.out.println("Caneta 1:");
        c1.ponta = 0.7f;
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.carga = 100;
        c1.tampada = true;
       
        c1.status();
        c1.rabiscar();
        
        System.out.println("------------------------");
        
        System.out.println("Caneta 2:");
        Caneta c2 = new Caneta();
        c2.ponta = 0.5f;
        c2.cor = "Preta";
        c2.modelo = "Chique";
        c2.carga = 50;
        c2.tampada = false;
        
        c2.status();
        c2.rabiscar();
        
    }
    
}
