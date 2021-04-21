package br.com.kaiorr.javaoo.javacore.domain.enumeracao.domain;

public class Cliente {
    private String nome;
    private int idade;
    private TipoCliente tipoCliente;

    public Cliente(String nome, int idade, TipoCliente tipoCliente) {
        this.nome = nome;
        this.idade = idade;
        this.tipoCliente = tipoCliente;
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

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}

