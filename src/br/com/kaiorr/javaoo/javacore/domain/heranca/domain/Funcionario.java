package br.com.kaiorr.javaoo.javacore.domain.heranca.domain;

public class Funcionario extends Pessoa {
    private int salario;

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
