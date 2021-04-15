package br.com.kaiorr.javaoo.javacore.domain.test;

import br.com.kaiorr.javaoo.javacore.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.name = "Kaio Ribeiro";

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
