/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinalcursoemvideo;

/**
 *
 * @author Notebook
 */
public class ProjetoFinalCursoEmVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video ("Aula 12 de PHP");
        v[2] = new Video ("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto ("Jubileu", 22, "Masculino", "juba");
        g[1] = new Gafanhoto ("Creuza", 12, "Feminino", "Creuzita");
        
        Vizualizacao vis = new Vizualizacao(g[0], v[1]);
        Vizualizacao vis2 = new Vizualizacao (g[0], v[1]);
        /*
        g[1].status();
        v[1].status();
        System.out.println(vis.toString());
        System.out.println(vis2.toString());
        vis.avaliar(90f);
        System.out.println(vis.getFilme().getAvaliacao());
        vis.getFilme().like();
        v[1].status();
        */
        
        System.out.println(vis.getEspectador().getIdade());
    }
    
}
