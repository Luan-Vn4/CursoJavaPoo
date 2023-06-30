package exercíciopolimorfismosobreposicao;

public class ExercicioPolimorfismoSobreposicao {

    public static void main(String[] args) {
        Canguru c1 = new Canguru();
        Cachorro c2 = new Cachorro();
        
        c1.locomover();
        c1.emitirSom();
        c2.emitirSom();
    }
    
}
