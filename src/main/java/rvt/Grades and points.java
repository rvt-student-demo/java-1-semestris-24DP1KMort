package rvt;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the grade: ");
        int grade = scanner.nextInt();
        if (grade < 0) {
            System.out.println("Impossible!");
        } else if (grade <= 49) {
            System.out.println("Failed");
        } else if (grade <= 59) {
            System.out.println("Very weak");
        } else if (grade <= 69) {
            System.out.println("Weak");
        } else if (grade <= 79) {
            System.out.println("Satisfactory");
        } else if (grade <= 89) {
            System.out.println("Good");
        } else {
            System.out.println("Excellent");
        }
    }
}