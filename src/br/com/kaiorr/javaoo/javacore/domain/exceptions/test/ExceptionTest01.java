package br.com.kaiorr.javaoo.javacore.domain.exceptions.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarArquivo();
    }

    private static void criarArquivo() {
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
