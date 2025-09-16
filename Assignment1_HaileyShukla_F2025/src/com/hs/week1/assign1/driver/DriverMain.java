package com.hs.week1.assign1.driver;
import java.util.Scanner;
import com.hs.week1.assign1.GradeCalculation;
import com.hs.week1.assign1.MilesToKilometers;
import com.hs.week1.assign1.LitersToGallons;
import com.hs.week1.assign1.CadToUsd;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeCalculation gradeCalc = new GradeCalculation();
        MilesToKilometers milesConv = new MilesToKilometers();
        LitersToGallons litersConv = new LitersToGallons();
        CadToUsd cadConv = new CadToUsd();

        try (Scanner sc = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("\n==== COMP228 - Assignment 1 Menu ====");
                System.out.println("1) Calculate Course Grade (A/B/C/D/F)");
                System.out.println("2) Convert Miles to Kilometers");
                System.out.println("3) Convert Liters to Gallons");
                System.out.println("4) Convert CAD to USD (enter today's rate)");
                System.out.println("0) Exit");
                System.out.print("Enter your choice: ");

                while (!sc.hasNextInt()) { sc.next(); System.out.print("Enter a number: "); }
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> gradeCalc.run(sc);
                    case 2 -> milesConv.run(sc);
                    case 3 -> litersConv.run(sc);
                    case 4 -> cadConv.run(sc);
                    case 0 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid option. Try again.");
                }

            } while (choice != 0);
        }

	}

}
