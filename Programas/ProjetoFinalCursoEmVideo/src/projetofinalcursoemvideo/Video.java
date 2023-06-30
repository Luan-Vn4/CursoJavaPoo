package projetofinalcursoemvideo;

public class Video implements AcoesVideo {
    //Atributos
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Métodos Especiais
    
    Video(String titulo){
        this.setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        float nova;
        nova = (float) (this.avaliacao + avaliacao)/ this.getViews();
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    //Métodos

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    
    public void status() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Titulo: %s | Avaliacao: %f | Views: %d | Curtidas: %d | Reproduzindo %s \n", this.getTitulo(), this.getAvaliacao(), this.getViews(), this.getCurtidas(), this.getReproduzindo());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
     
}
