package br.com.kaiorr.javaoo.javacore.domain.metodos.test;

import br.com.kaiorr.javaoo.javacore.domain.metodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Kaio");
        funcionario.setIdade(32);
        funcionario.setSalarios(new double[]{12557, 55598});

        funcionario.imprimeFuncionario();
        System.out.println("Media Salario é "+funcionario.getMedia());
    }
}
