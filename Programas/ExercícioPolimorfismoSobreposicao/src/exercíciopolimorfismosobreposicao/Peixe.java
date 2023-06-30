package exercíciopolimorfismosobreposicao;

public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    

    //Métodos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolhas(){
        System.out.println("Soltou bolhas");
    }
    
}
