package rvt;

import java.util.Scanner;

public class DelikatesuVeikals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String item = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Ekspress piegāde (0==nē, 1==jā): ");
        int express = Integer.parseInt(scanner.nextLine());

        double delivery = 0;

        if (price < 10.0) {
            delivery = 2.00;
        }

        if (express == 1) {
            delivery += 3.00;
        }

        double total = price + delivery;

        System.out.println();
        System.out.println("Rēķins:");
        System.out.println("    " + item + "    " + String.format("%.2f", price));
        System.out.println("    piegāde    " + String.format("%.2f", delivery));
        System.out.println("    kopā    " + String.format("%.2f", total));
    }
}
