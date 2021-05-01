package br.com.kaiorr.javaoo.exercicios.array;

/*
* 4. Write a Java program to calculate the average value of array elements.
* */

public class Array4 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int sum = 0;

        for (int i: array) {
            sum+= i;
        }
        System.out.println("Média dos valores do array é: " + (sum / array.length));
    }
}
