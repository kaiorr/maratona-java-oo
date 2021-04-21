package br.com.kaiorr.javaoo.javacore.domain.classesabstratas.domain;

//com abstract a classe não pode ser instânciada, pois se tornou uma super classe,
// somente as classes que estendem de Funcionário podem ser instanciadas.
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
