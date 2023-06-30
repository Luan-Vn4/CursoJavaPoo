package aplicativo.de.leitura;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    Scanner leia = new Scanner(System.in);
    ArrayList <Usuario> user = new ArrayList <Usuario>();
    ArrayList <Livro> livro = new ArrayList <Livro>();

    public Registro() {
        //livro = new Livro("Memorias Postumas de Bras Cubas", "Machado de Assis", 400);
        //livro[1] = new Livro("O Mundo de Sofia", "Jostein Gaarder", 500);
    }
    
    public void register(){
                int q = Usuario.getQuantidade();
                    user.add(q, new Usuario("null", 0, "null"));
                    livro.add(q, new Livro ("Memorias Postumas de Bras Cubas", "Machado de Assis", 400, user.get(q)));
                    
                System.out.println("Nome de Usuario: ");
                user.get(q).setNome(leia.nextLine());
                System.out.println("Idade:");
                user.get(q).setIdade(Integer.parseInt(leia.nextLine()));
                System.out.println("Gênero: ");
                user.get(q).setSexo(leia.nextLine());
                
                System.out.println("Informacoes do usuario:");
                System.out.println("------------------");
                user.get(q).status();
                System.out.println("------------------");
                System.out.printf("Ola, %s sua conta foi criada com sucesso! \n", this.user.get(q).getNome());
    }
    
    public void login(){
        System.out.println("Usuario: ");
        String crUser = leia.nextLine();
        int i = -1;
        for (int c = 0; c<Usuario.getQuantidade(); c++){
            if (crUser.equals(user.get(c).getNome())){
                i = c;
            }
        }
        
        if (i==-1){
            System.out.println("Conta nao encontrada");
        }else{
            int r1 = 0;
            while (r1 != 6){
                System.out.println("Lendo o livro Machado de Assis");
                this.livro.get(i).detalhes();
                System.out.println("[1]Abrir livro [2]Fechar livro [3]Folhear [4]Avançar [5]Voltar [6]Sair");
                r1 = Integer.parseInt(leia.nextLine());
                switch (r1){
                    case 1:
                        this.livro.get(i).abrir();
                        break;
                    case 2:
                        this.livro.get(i).fechar();
                        break;
                    case 3:
                        if (this.livro.get(i).getAberto()){
                            this.livro.get(i).folhear();
                        }else{
                            System.out.println("Livro fechado!");
                        }
                        break;
                    case 4:
                        if (this.livro.get(i).getAberto()){
                            this.livro.get(i).avancar();
                        }else{
                            System.out.println("Livro fechado!");
                        }
                        break;
                    case 5:
                        if (this.livro.get(i).getAberto()){
                            this.livro.get(i).voltar();
                        }else{
                            System.out.println("Livro fechado!");
                        }
                        break;
                    default:
                        r1 = 6;
                        break;
                }
            }
        }

    }
    
    
    
}
