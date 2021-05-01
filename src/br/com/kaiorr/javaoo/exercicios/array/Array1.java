package br.com.kaiorr.javaoo.exercicios.array;

/*
* 1. Write a Java program to sort a numeric array and a string array.
* */

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] Array1 = { 1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.sort(Array1);

        System.out.print("Array de números: " + Arrays.toString(Array1));

        System.out.println("\n--------------------------------------------");

        String[] Array2 = {"Java", "PHP", "JS", "Python"};
        Arrays.sort(Array2);

        System.out.print("Array de string: " + Arrays.toString(Array2));
    }
}
