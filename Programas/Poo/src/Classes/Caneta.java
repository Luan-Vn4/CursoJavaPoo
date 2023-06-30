package Classes;

import java.util.Scanner;


public class Caneta {
Scanner leia = new Scanner(System.in);    
//Atributos:   
float ponta;    
Boolean tampada;
String cor;
String modelo;
int carga;




//Métodos:
void status(){
    System.out.println("Ponta:" + this.ponta);
    System.out.println("Cor:" + this.cor);
    System.out.println("Modelo:" + this.modelo);
    System.out.println("Carga:" + this.carga);
    System.out.println("Aberta:" + !this.tampada);
    
}
//Açãõ de rabiscar
void rabiscar(){
    if (this.tampada == false){
        System.out.println("Rabisco");
    }else{
        System.out.println("Nao e possivel rabiscar, pois a caneta esta tampada");
    }
}

void trocarTinta(){
    this.cor = leia.nextLine();
}


//Ação de tampar
void tampar(){
    this.tampada = true;
}
//Ação de destampar
void destampar(){
    this.tampada = false;
}

}
