package aplicativo.de.leitura;

import java.util.Scanner;

public class Livro implements Publicacao {
    Scanner leia = new Scanner(System.in);

    //Atributos
    private String livro;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Usuario leitor;
    
    //Métodos Especiais

    public Livro(String titulo, String autor, int totPaginas, Usuario leitor) {
        this.livro = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    Livro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor.getNome();
    }

    public void setLeitor(Usuario leitor) {
        this.leitor = leitor;
    }
    
    
    
    //Métodos
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        System.out.println("Ate qual pagina deseja folhear?");
        int f = Integer.parseInt(leia.nextLine());
        if (f > totPaginas || f < 0){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(f);
        }
    }

    @Override
    public void avancar() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltar() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
    public void detalhes(){
        System.out.println("----------------------------------------");
        System.out.printf("%s | %s | %d \n", this.getLivro(), this.getAutor(), this.getTotPaginas());
        System.out.printf("Leitor: %s | Pagina atual: %d | %s \n", this.leitor.getNome(), this.getPagAtual(), this.getAberto());
        System.out.println("----------------------------------------");
    }
}
