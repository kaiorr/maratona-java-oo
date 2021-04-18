package br.com.kaiorr.javaoo.javacore.domain.heranca.test;

import br.com.kaiorr.javaoo.javacore.domain.heranca.domain.Endereco;
import br.com.kaiorr.javaoo.javacore.domain.heranca.domain.Funcionario;
import br.com.kaiorr.javaoo.javacore.domain.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Dois");
        endereco.setCep(12345-124);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kaio");
        pessoa.setIdade(20);
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("*******-----*******");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ribeiro");
        funcionario.setIdade(32);
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
