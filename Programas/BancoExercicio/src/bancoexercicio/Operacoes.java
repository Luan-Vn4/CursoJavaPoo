package bancoexercicio;

import java.util.Scanner;


public class Operacoes {
    Scanner leia = new Scanner(System.in);
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Construtor
    Operacoes(){
        numConta = 0000;
        saldo = 0.00f;
        status = false;
    }




    
    //Métodos:
    //Abrir conta
    public void abrirConta(){
        this.numConta = this.numConta + 1;
        numConta = this.numConta;
        System.out.println("Informe o nome do usuario:");
        this.dono = leia.nextLine();
        System.out.println("Informe o tipo da conta: [cp] ou [cc]");
        this.tipo = leia.nextLine();
            if (this.tipo.equals("cp")){
                this.saldo += 150.00;
            }else{
                this.saldo += 50.00;
            }
        this.status = true;
        System.out.println("Conta aberta com sucesso!!");
    }
    
    //Fechar conta
    public void fecharConta(){
        if (this.saldo == 0 && this.status == true){
            this.numConta = 0;
            this.dono = "";
            this.tipo = "";
            this.status = false;
            System.out.println("Conta encerrada :( ");
        }else{
            System.out.println("Para fechar a conta, e necessario sacar todo o dinheiro antes ou estar aberta!!!");
        } 
    }
    
    //Depositar
    public void depositar(){
        System.out.println("Quanto você deseja depositar?");
        this.saldo += Float.parseFloat(leia.nextLine());
        System.out.println("Saldo total atual: " + this.saldo);
    }
    //Sacar 
    public void sacar(){
        System.out.println("Quanto você deseja sacar?");
        float saque = Float.parseFloat(leia.nextLine());
        if (saque <= this.saldo){
            this.saldo -= saque;
        }else{
            System.out.println("Não é possível essa quantia!!");
        }
        System.out.println("Saldo total atual: " + this.saldo);
    }
    
    //Pagar mensalidade
    public void pagarMensalidade(){
        if (this.tipo.equals("cp") && this.saldo >= 8.00f){
            this.saldo -= 8.00f;
            System.out.println("Mensalidade paga com sucesso!!!");
            System.out.println("Saldo total atual: " + this.saldo);
        }else if (this.saldo >= 15.00f){
            this.saldo -= 15.00f;
            System.out.println("Mensalidade paga com sucesso!!!");
            System.out.println("Saldo total atual: " + this.saldo);
        }else{
            System.out.println("Não é possível pagar a mensalidade!!!");
            System.out.println("Saldo total atual: " + this.saldo);
        }
    }
    
    //Status da conta
    public void dadosConta(){
        System.out.println("Numero da conta: " + getnumConta());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Aberto? " + getStatus());
    }
    
    
    
    
    
    
    
    //Métodos Especiais
    public int getnumConta(){
        return this.numConta;
    }
    public void setnumConta(int n){
        this.numConta = n;   
        }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatuts(boolean b){
        this.status = b;
    }
    }
    


