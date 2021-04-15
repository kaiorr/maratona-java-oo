package br.com.kaiorr.javaoo.metodos.domain;

public class Calculadora01 {
    public void Soma() {
        System.out.println(10 + 25);
    }

    public void Subtrai() {
        System.out.println(5 -2);
    }

    public void MultiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double DividirDoisNumeros(double num1, double num2) {
        if ( num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1/num2;
    }
}
