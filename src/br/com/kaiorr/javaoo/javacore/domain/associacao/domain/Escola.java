package br.com.kaiorr.javaoo.javacore.domain.associacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime() {
        System.out.println(this.nome);
        if(professores == null) {
            return;
        };
        for(Professor professor: professores) {
            System.out.println(professor.getNome());
        }
    }

    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
