package br.com.kaiorr.javaoo.javacore.domain.associacao.domain;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
