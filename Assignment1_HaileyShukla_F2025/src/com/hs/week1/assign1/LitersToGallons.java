package com.hs.week1.assign1;
import java.util.Scanner;

public class LitersToGallons {

	private static final double GALLONS_PER_LITER = 0.264172; // US gallons

    public void run(Scanner sc) {
        System.out.println("\n-- Liters to Gallons --");
        System.out.print("Enter liters: ");
        double liters = readDouble(sc);
        double gallons = liters * GALLONS_PER_LITER;
        System.out.printf("%.4f liters = %.4f gallons%n", liters, gallons);
    }

    private double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) { sc.next(); System.out.print("Enter a number: "); }
        return sc.nextDouble();
    }
}
