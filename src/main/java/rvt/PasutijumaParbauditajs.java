package rvt;

import java.util.Scanner;

public class PasutijumaParbauditajs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int boltPrice = 5;     
        final int nutPrice = 3;      
        final int washerPrice = 1;   

        System.out.println("Skrūvju skaits:");
        int bolts = Integer.parseInt(scanner.nextLine());

        System.out.println("Uzgriežņu skaits:");
        int nuts = Integer.parseInt(scanner.nextLine());

        System.out.println("Paplāksņu skaits:");
        int washers = Integer.parseInt(scanner.nextLine());

        boolean errorNuts = false;
        boolean errorWashers = false;

        
        if (nuts < bolts) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
            errorNuts = true;
        }

        
        if (washers < bolts * 2) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
            errorWashers = true;
        }

        
        if (!errorNuts && !errorWashers) {
            System.out.println("Pasūtījums ir kārtībā.");
        }

        
        int total = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;

        System.out.println("Kopējā cena: " + total);
    }
}
