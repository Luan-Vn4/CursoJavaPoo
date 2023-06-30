package bancoexercicio;

import java.util.Scanner;


public class BancoExercicio {


    public static void main(String[] args) {
      Users user = new Users();
      Scanner leia = new Scanner(System.in);
      String rf = "n";
      
     
      while (rf.equals("n")){  
      System.out.println("Informe qual o usuario: [1] [2]");
        int usuario = Integer.parseInt(leia.nextLine());
        if (usuario == 1){
            user.user1();
        }else if (usuario == 2){
            user.user2();
        }
        
        System.out.println("Encerrar programa? [s] [n]");
        rf = leia.nextLine();
      }
    }
    
}
