package br.com.kaiorr.javaoo.javacore.domain.metodos.test;

import br.com.kaiorr.javaoo.javacore.domain.metodos.domain.Calculadora01;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora01 calculadora = new Calculadora01();

        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.arrayVarArgs(1,3,4,5,6,6,7,8);
    }
}
