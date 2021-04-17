package br.com.kaiorr.javaoo.javacore.domain.modificadorestatico.domain;

import org.w3c.dom.ls.LSOutput;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("-----------");
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade Máxima "+ this.velocidadeMaxima);
        System.out.println("Velocidade Limite "+ Carro.velocidadeLimite);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

}
