package br.com.kaiorr.javaoo.javacore.domain.exceptions.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) throws IllegalAccessException {
        divisao(10, 0);
        System.out.println("Codigo Finalizado: ");
    }

    private static void divisao(int a, int b) throws IllegalAccessException {
        if(a == 0 || b ==0 ) {

            throw new IllegalAccessException("Não pode existir Zero em divisão");
        }
    }
}
