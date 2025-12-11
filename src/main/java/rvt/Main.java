package rvt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        if (count > 0) {
            System.out.println("Average: " + (1.0 * sum / count));
        } else {
            System.out.println("Average: 0");
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
