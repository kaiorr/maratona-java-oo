package br.com.kaiorr.javaoo.javacore.domain.exercicioassociacao.test;

import br.com.kaiorr.javaoo.javacore.domain.exercicioassociacao.domain.Aluno;
import br.com.kaiorr.javaoo.javacore.domain.exercicioassociacao.domain.Local;
import br.com.kaiorr.javaoo.javacore.domain.exercicioassociacao.domain.Professor;
import br.com.kaiorr.javaoo.javacore.domain.exercicioassociacao.domain.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Angelo Pucci");
        Aluno aluno = new Aluno("Kaio", 32);
        Professor professor = new Professor("Mestre dos Magos", "modo furtivo");

        Aluno[] alunosParaSeminarios = {aluno};

        Seminario seminario = new Seminario("Fugindo em meio ao caos", alunosParaSeminarios, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
