package br.com.kaiorr.javaoo.javacore.domain.metodos.test;

import br.com.kaiorr.javaoo.javacore.domain.metodos.domain.Calculadora01;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora01 calculadora = new Calculadora01();
        double result = calculadora.DividirDoisNumeros(5, 0);
        System.out.println(result);

    }
}
