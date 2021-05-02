package br.com.kaiorr.javaoo.exercicios.array;


public class Array5 {
    public static boolean contains(int[] arr, int item) {
        for(int n: arr) {
            if(item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int my_array[] = {1,2,3,4,5,6,7,8};
        System.out.println(contains(my_array, 5));
    }
}
