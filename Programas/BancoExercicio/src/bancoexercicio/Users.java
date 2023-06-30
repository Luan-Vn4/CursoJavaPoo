package bancoexercicio;

import java.util.Scanner;

public class Users {
    //Usuário 1
    public void user1(){
        Operacoes c1 = new Operacoes();
        Scanner leia = new Scanner(System.in);
        String r = "s";
        while (r.equals("s")){
            System.out.println("Que operacao deseja realizar?");
            System.out.println(" [1] Abrir conta \n [2] Fechar conta \n [3] Depositar\n [4] Sacar \n [5] Pagar mensalidade \n [6] Verificar dados");
            String op = leia.nextLine();
            
            switch (op){
                case "1" -> c1.abrirConta();
                case "2" -> c1.fecharConta();
                case "3" -> c1.depositar();
                case "4" -> c1.sacar();
                case "5" -> c1.pagarMensalidade();
                case "6" -> c1.dadosConta();
                default -> {}
            }
            System.out.println("Deseja realizar outra operacao? [s] [n]");
            r = leia.nextLine();
        }
    }
    
    //Usuário 2
    public void user2(){
        Operacoes c2 = new Operacoes();
        Scanner leia = new Scanner(System.in);
        String r = "s";
        while (r.equals("s")){
            System.out.println("Que operacao deseja realizar?");
            System.out.println(" [1] Abrir conta \n [2] Fechar conta \n [3] Depositar\n [4] Sacar \n [5] Pagar mensalidade \n [6] Verificar dados");
            String op = leia.nextLine();
            
            switch (op) {
                case "1" -> c2.abrirConta();
                case "2" -> c2.fecharConta();
                case "3" -> c2.depositar();
                case "4" -> c2.sacar();
                case "5" -> c2.pagarMensalidade();
                case "6" -> c2.dadosConta();
                default -> {
                }
            }
            
            System.out.println("Deseja realizar outra operacao? [s] [n]");
            r = leia.nextLine();
        }
    }
}
