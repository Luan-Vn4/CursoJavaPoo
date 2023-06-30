package exercíciopolimorfismosobreposicao;

public class Reptil extends Animal {
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
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendos vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
}
