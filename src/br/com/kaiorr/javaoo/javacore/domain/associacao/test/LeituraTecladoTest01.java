package br.com.kaiorr.javaoo.javacore.domain.associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Programa Adivinhador");
        System.out.println("Faça sua pergunta e respondo Sim ou Não");
        if (input.nextLine().charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        };
    }
}
