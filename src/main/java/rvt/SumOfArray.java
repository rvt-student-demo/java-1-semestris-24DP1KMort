package rvt;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
