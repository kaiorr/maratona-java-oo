package br.com.kaiorr.javaoo.javacore.domain.modificadorfinal.test;

import br.com.kaiorr.javaoo.javacore.domain.modificadorfinal.domain.Carro;
import br.com.kaiorr.javaoo.javacore.domain.modificadorfinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        Comprador comprador = new Comprador();
        carro.COMPRADOR.setNome("Kaio");
        System.out.println(carro.COMPRADOR);
    }
}
