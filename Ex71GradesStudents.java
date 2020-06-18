package be.vdab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex71GradesStudents {
    public static void main(String[] args) {
        int amountOfStudents = enterAmountOfStudents();
        int[] results = enterResults(amountOfStudents);
        String[] grades = calculateGrades(amountOfStudents, results);
        printResultsAndGrades(amountOfStudents, results, grades);
    }

    public static int enterAmountOfStudents()  {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students?");
        int amount = scan.nextInt();
        return amount;
    }

    public static int[] enterResults(int amountOfStudents) {
        Scanner scan = new Scanner(System.in);
        int[] results = new int[amountOfStudents];
        for (int i = 0; i < amountOfStudents; i++) {
            System.out.println("Enter result for student " + (i+1));
            results[i] = scan.nextInt();
        }
        return results;
    }

    public static String[] calculateGrades(int amountOfStudents, int[] results)  {
        String[] grades = new String[amountOfStudents];
        int best = 100;
        for (int i = 0; i < amountOfStudents; i++) {
            if (results[i] >= best-5)   grades[i] = "A";
            else if (results[i] >= best-10)   grades[i] = "B";
            else if (results[i] >= best-15)   grades[i] = "C";
            else if (results[i] >= best-20)   grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void printResultsAndGrades(int amountOfStudents, int[] results, String[] grades)    {
        for (int i = 0; i < amountOfStudents; i++) {
            System.out.println("Student " + (i+1) + " score is " + results[i] + " and grade is " + grades[i]);
        }
    }
}

/*
nummer student in enterResults blijft 1
*/