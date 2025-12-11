package rvt;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) break;
            sum += number;
            count++;
            if (number % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
