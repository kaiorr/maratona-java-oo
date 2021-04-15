package br.com.kaiorr.javaoo.test;

import br.com.kaiorr.javaoo.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Kaiorr";
        estudante.age = 32;
        estudante.gender = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
