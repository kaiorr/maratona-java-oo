package br.com.kaiorr.javaoo.test;

import br.com.kaiorr.javaoo.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.name="Kaio Rocha";

        System.out.println("Oi "+ estudante.name);
        System.out.println("Oi "+ estudante.gender);
        System.out.println("Oi "+ estudante.age);
        System.out.println("--------------------");
        System.out.println("Oi "+ estudante1.name);
        System.out.println("Oi "+ estudante1.gender);
        System.out.println("Oi "+ estudante1.age);


    }
}
