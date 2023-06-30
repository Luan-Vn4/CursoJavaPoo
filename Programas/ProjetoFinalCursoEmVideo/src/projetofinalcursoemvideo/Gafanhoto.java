package projetofinalcursoemvideo;

public class Gafanhoto extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Métodos Especiais

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //Métodos
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public void status(){
        System.out.println("---------------------------------------------------------------");
        System.out.printf("Nome: %s | Idade: %d | Genero: %s | Login: %s \n", this.getNome(), this.getIdade(), this.getSexo(), this.getLogin());
        System.out.println("---------------------------------------------------------------");
    }
    
    
}
