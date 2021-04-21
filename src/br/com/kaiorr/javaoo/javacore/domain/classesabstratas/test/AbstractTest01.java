package br.com.kaiorr.javaoo.javacore.domain.classesabstratas.test;

import br.com.kaiorr.javaoo.javacore.domain.classesabstratas.domain.Desenvolvedor;
import br.com.kaiorr.javaoo.javacore.domain.classesabstratas.domain.Gerente;

public class AbstractTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ribeiro", 2500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Kaio Ribeiro", 8950);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
