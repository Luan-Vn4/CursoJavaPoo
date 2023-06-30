package emojicombat;

import java.util.Random;


public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        this.desafiado = l1;
        this.desafiante = l2;
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante){
            System.out.println("Luta aprovada!");
            this.aprovada = true;
        }else{
            System.out.println("Luta não aprovada, categorias diferentes!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            Random aleatorio = new Random();
            System.out.println("------Desafiado------");
            this.desafiado.apresentar();
            System.out.println("---------------------");
            System.out.println("------Desafiante-----");
            this.desafiante.apresentar();
            System.out.println("---------------------");
            
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("---------------------------------");
                    System.out.println("A luta empatou!!");
                    System.out.println("---------------------------------");
                    break;
                case 1:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("---------------------------------");
                    System.out.println("Vitória do: " + this.getDesafiado().getNome());
                    System.out.println(this.getDesafiante().getNome() + " perdeu");
                    System.out.println("---------------------------------");
                    break;
                case 2:
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("---------------------------------");
                    System.out.println("Vitória do: " + this.getDesafiante().getNome());
                    System.out.println(this.getDesafiado().getNome() + " perdeu");
                    System.out.println("---------------------------------");
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
}
