package br.com.kaiorr.javaoo.javacore.domain.heranca.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public void imprime() {
        System.out.println(this.nome + " " + this.idade);
        System.out.println(this.endereco.getRua() + "  " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
