package br.com.kaiorr.javaoo.javacore.domain.associacao.domain;

public class Jogador {
    private String nome;

    public Jogador(String nome){
        this.nome = nome;
    }
    public void imprime() {
        System.out.println(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}

