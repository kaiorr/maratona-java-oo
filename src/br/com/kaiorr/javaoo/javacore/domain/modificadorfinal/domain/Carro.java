package br.com.kaiorr.javaoo.javacore.domain.modificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 258;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }
}
