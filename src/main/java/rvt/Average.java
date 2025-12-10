package rvt;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Give the first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Give the second number: ");
            int num2 = scanner.nextInt();
            System.out.println("The average is " + ((num1 + num2) / 2.0));
        }
    }
}
