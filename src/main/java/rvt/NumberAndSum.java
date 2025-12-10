package rvt;

import java.util.Scanner;

public class NumberAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            count++;
            sum += number;
        }

        System.out.println("Skaitu: " + count);
        System.out.println("Summa: " + sum);
    }
}
