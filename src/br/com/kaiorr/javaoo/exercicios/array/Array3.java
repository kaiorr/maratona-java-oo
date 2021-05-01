package br.com.kaiorr.javaoo.exercicios.array;

/*
* 3. Write a Java program to print the following grid.
* */

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d -", a[i][j]);
            }
            System.out.println();
        }
    }
}
