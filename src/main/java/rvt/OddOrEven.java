package rvt;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skaitli:");
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("Skaitlis ir pāra.");
        } else {
            System.out.println("Skaitlis ir nepāra.");
        }
    }
}
