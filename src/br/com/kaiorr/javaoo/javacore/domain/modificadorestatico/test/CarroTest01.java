package br.com.kaiorr.javaoo.javacore.domain.modificadorestatico.test;

import br.com.kaiorr.javaoo.javacore.domain.modificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 250);
        Carro c2 = new Carro("Mercedes", 357);
        Carro c3 = new Carro("Audi", 480);
        Carro.velocidadeLimite = 150;
        c1.imprime();
        c2.imprime();
        c3.imprime();
//modificador static para alterar todos objetos de uma mesma classe


    }
}
