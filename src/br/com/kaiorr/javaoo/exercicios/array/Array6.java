package br.com.kaiorr.javaoo.exercicios.array;

/*
* 6. Write a Java program to find the index of an array element.
* */

import java.util.Arrays;

public class Array6 {
    public static Object findIndex (int[] my_array, int t) {
        if(my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while(i < len) {
            if(my_array[i] == t) return -1;
            else i = i + 1;
        }
        return Arrays.toString(new String[]{"Inexistente"});
    }

    public static void main(String[] args) {
        int[] my_array = {79, 75, 88, 550, 1572, 66, 77, 280, 365};

        System.out.println("Meu Array: " + Arrays.toString(my_array));
        System.out.println("==============================================");
        System.out.println("O número 77 está em qual posição no array ? " + (findIndex(my_array, 77)));
        System.out.println("O número 280 está em qual posição no array ? " + (findIndex(my_array, 280)));
        System.out.println("O número 8889 está em qual posição no array ? " + (findIndex(my_array, 8889)));
    }
}
