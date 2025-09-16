package com.hs.week1.assign1;
import java.util.Scanner;

public class MilesToKilometers {

	private static final double KM_PER_MILE = 1.609344;

    public void run(Scanner sc) {
        System.out.println("\n-- Miles to Kilometers --");
        System.out.print("Enter miles: ");
        double miles = readDouble(sc);
        double km = miles * KM_PER_MILE;
        System.out.printf("%.4f miles = %.4f km%n", miles, km);
    }

    private double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) { sc.next(); System.out.print("Enter a number: "); }
        return sc.nextDouble();
    }
}
