package exercicioherancas;

public class Aluno extends Pessoa {
    //Atributos
    private boolean matriculado;
    private String curso;
    
    //Métodos Especiais

    public Aluno(String nome, int idade, String sexo, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matriculado = true;
        this.curso = curso;
    }
    
    
    
    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //Métodos
    
    public void cancelarMatricula(){
        this.setMatriculado(false);
    }
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
    
}
