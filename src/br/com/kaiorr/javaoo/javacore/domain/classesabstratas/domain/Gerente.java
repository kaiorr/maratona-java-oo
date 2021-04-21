package br.com.kaiorr.javaoo.javacore.domain.classesabstratas.domain;

//como está utilizando herança é obrigatorio extender da super classe Funcionario
public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Cargo: Gerente, " +
                "nome: '" + nome + '\'' +
                ", salario: R$" + salario;
    }
}
