package br.com.kaiorr.javaoo.javacore.domain.metodos.domain;

public class Pessoa {
    public String nome;
    public int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }
}
