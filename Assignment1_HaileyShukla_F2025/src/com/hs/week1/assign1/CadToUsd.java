package com.hs.week1.assign1;
import java.util.Scanner;

public class CadToUsd {
	
	public void run(Scanner sc) {
        System.out.println("\n-- CAD to USD --");
        System.out.print("Enter amount in CAD: ");
        double cad = readDouble(sc);

        //Exchange rate for 16/09/2025
        System.out.print("Enter today's CAD->USD rate (1 CAD = ? USD, e.g., 0.73): ");
        double rate = readPositiveDouble(sc);

        double usd = cad * rate;
        System.out.printf("CAD %.2f @ rate %.6f = USD %.2f%n", cad, rate, usd);
    }

    private double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) { sc.next(); System.out.print("Enter a number: "); }
        return sc.nextDouble();
    }

    private double readPositiveDouble(Scanner sc) {
        double v = readDouble(sc);
        while (v <= 0) {
            System.out.print("Enter a positive number: ");
            v = readDouble(sc);
        }
        return v;
    }

}
