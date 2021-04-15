package br.com.kaiorr.javaoo.metodos.test;

import br.com.kaiorr.javaoo.metodos.domain.Estudante;
import br.com.kaiorr.javaoo.metodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante1.nome = "Kaio";
        estudante1.idade = 32;
        estudante1.sexo = 'M';

        estudante2.nome = "Ribeiro";
        estudante2.idade = 32;
        estudante2.sexo = 'M';

        impressoraEstudante.imprime(estudante1);
        System.out.println("-----------------");
        impressoraEstudante.imprime(estudante2);

    }
}
