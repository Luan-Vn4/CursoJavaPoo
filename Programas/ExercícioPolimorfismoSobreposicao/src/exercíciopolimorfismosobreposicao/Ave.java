package exercíciopolimorfismosobreposicao;

public class Ave extends Animal {
    //Atributos
    private String corPena;
    
    //Métodos Especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhocas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Chilreado");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
}
