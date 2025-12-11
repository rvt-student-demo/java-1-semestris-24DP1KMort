package rvt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 8};

        swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
