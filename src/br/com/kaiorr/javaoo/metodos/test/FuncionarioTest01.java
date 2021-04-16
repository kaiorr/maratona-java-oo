package br.com.kaiorr.javaoo.metodos.test;

import br.com.kaiorr.javaoo.metodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Kaio";
        funcionario.idade = 32;
        funcionario.salarios = new double[]{12557, 55598};

        funcionario.imprimeFuncionario();
    }
}
