package aplicativo.de.leitura;

import java.util.Scanner;


public class AplicativoDeLeitura {

  
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Registro oprt = new Registro();
        String r1 = "s";
        
        while (r1.equals("s")){
            System.out.println("Logar[1] Registrar[2] Sair [3]");
            int r2 = Integer.parseInt(leia.nextLine());
            switch (r2){
                case 1:
                    oprt.login();
                    break;
                case 2:
                    oprt.register();
                    break;
                default:
                    break;
            }
            System.out.println("Deseja continuar? [s] [n]");
            r1 = leia.nextLine();
        }
    }
    
}
