package br.com.kaiorr.javaoo.javacore.domain.associacao.domain;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome){
        this.nome = nome;
    }
    public void imprime() {
        System.out.println(this.nome);
        if(time != null) {
            System.out.println(time.getNome());
        }
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}


