/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioherancas;

/**
 *
 * @author Notebook
 */
public class Informar {
    
    public static void getInformação(Pessoa obj){
        if (obj instanceof Aluno){
            System.out.println("E aluno");
            System.out.println(((Aluno) obj).getCurso());
        }
        if (obj instanceof Professor){
            System.out.println("E professor");
            System.out.println(((Professor) obj).getEspecialidade());
        }
    }
}
