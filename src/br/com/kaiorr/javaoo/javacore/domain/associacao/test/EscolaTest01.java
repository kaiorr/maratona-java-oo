package br.com.kaiorr.javaoo.javacore.domain.associacao.test;

import br.com.kaiorr.javaoo.javacore.domain.associacao.domain.Escola;
import br.com.kaiorr.javaoo.javacore.domain.associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        //passando primeiro o professor para ficar disponível para escola
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Jaspion Sensei");
        Professor[] professores = { professor1, professor2 };
        Escola escola = new Escola("Escola", professores);

        escola.imprime();
    }
}
