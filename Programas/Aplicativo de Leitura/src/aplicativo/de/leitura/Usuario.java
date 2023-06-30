package aplicativo.de.leitura;

public class Usuario {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    private static int quantidade;
    
    //Métodos Especiais
    Usuario(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        quantidade++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public static int getQuantidade(){
        return quantidade;
    }
    
    public static void setQuantidade(int quant){
        quantidade = quant;
    }
    
    public void status(){
        System.out.println("Nome: " + this.getNome());
        if (this.idade > 0){
            System.out.println("Idade: " + this.getIdade());
        }else{
            System.out.println("Idade: null");
        }
        System.out.println("Genero: " + this.getSexo());
    }
    
    //Métodos
    
}
