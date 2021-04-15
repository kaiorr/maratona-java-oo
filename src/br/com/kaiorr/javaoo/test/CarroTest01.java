package br.com.kaiorr.javaoo.test;

import br.com.kaiorr.javaoo.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Corolla";
        carro.modelo = "Sedan";
        carro.ano = 2021;

        carro1.nome = "Civic";
        carro1.ano = 2021;
        carro1.modelo = "Sedan";


        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("----------------");

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
    }
}
