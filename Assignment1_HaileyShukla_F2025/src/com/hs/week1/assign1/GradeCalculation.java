package com.hs.week1.assign1;
import java.util.Scanner;

public class GradeCalculation {

	public void run(Scanner sc) {
        final int SUBJECTS = 6;
        int[] marks = new int[SUBJECTS];
        float total = 0;

        System.out.println("\n-- Grade Calculation --");
        for (int i = 0; i < SUBJECTS; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + " (0-100): ");
            marks[i] = readIntInRange(sc, 0, 100);
            total += marks[i];
        }

        float avg = total / SUBJECTS;
        char grade = letterGrade(avg);

        System.out.printf("Average: %.2f%% -> Grade: %c%n", avg, grade);
    }

    private int readIntInRange(Scanner sc, int min, int max) {
        while (!sc.hasNextInt()) { sc.next(); System.out.print("Enter a valid integer: "); }
        int v = sc.nextInt();
        while (v < min || v > max) {
            System.out.print("Out of range. Enter " + min + "-" + max + ": ");
            while (!sc.hasNextInt()) { sc.next(); System.out.print("Enter a valid integer: "); }
            v = sc.nextInt();
        }
        return v;
    }

    private char letterGrade(float avg) {
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }
}
