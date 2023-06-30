package exercicioherancas;

import java.util.Scanner;

public class ExercicioHerancas {


    public static void main(String[] args) {
        Aluno a1 = new Aluno ("João", 18, "Feminino", "Pedreiro");
        Professor p1 = new Professor();
        p1.setNome("Maria");
        p1.setIdade(21);
        p1.setSexo("F");
        p1.setEspecialidade("Matemática");

        Informar.getInformação(a1);
        Informar.getInformação(p1);
        
        
    }
    
}
