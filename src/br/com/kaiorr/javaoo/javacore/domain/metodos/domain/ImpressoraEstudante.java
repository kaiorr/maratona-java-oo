package br.com.kaiorr.javaoo.javacore.domain.metodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
