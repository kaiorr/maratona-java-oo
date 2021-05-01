package br.com.kaiorr.javaoo.exercicios.array;

/*
* 2. Write a Java program to sum values of an array.
* */

public class Array2 {
    public static void main(String[] args) {
        int my_array[] = {1,3,4,5,6};
        int sum = 0;

        for(int i: my_array) {
            sum+= i;
        }
        System.out.println("Soma é: " + sum);
    }
}
