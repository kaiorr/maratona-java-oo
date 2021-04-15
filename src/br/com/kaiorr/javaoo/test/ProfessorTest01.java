package br.com.kaiorr.javaoo.test;

import br.com.kaiorr.javaoo.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Heinsenberg";
        professor.age = 78;
        professor.gender = 'M';

        System.out.println("Nome: "+professor.name+", com idade "+professor.age+" anos e sexo: "+professor.gender);
    }
}
