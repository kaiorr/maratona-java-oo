package br.com.kaiorr.javaoo.javacore.domain.metodos.test;

import br.com.kaiorr.javaoo.javacore.domain.metodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Kaio");
        pessoa.setIdade(15);

//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
