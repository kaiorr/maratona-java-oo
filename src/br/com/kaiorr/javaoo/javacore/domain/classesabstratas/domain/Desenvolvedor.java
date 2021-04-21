package br.com.kaiorr.javaoo.javacore.domain.classesabstratas.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Cargo: Desenvolvedor, " +
                "nome: '" + nome + '\'' +
                ", salario: R$" + salario;
    }
}
