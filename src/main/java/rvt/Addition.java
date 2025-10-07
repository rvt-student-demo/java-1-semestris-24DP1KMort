package rvt;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}
