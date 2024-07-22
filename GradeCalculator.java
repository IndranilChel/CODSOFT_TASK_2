package com.codsoft;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of subject: ");
        int number_of_subjects = s1.nextInt();

        int[] marks = new int[number_of_subjects];
        int total_marks = 0;

        for (int k = 0; k < number_of_subjects; k++) {
            System.out.println("Enter marks for subjects " + (k + 1) + "(out of 100): ");
            marks[k] = s1.nextInt();
             total_marks += marks[k];
        }
        double average_Percentage = (double) total_marks / number_of_subjects;

            String Grade;
            if(average_Percentage >= 90){
                    Grade = "A";
                } else if (average_Percentage >= 70) {
                    Grade ="B";
                } else if (average_Percentage >= 60) {
                    Grade = "C";
                } else if (average_Percentage >= 50) {
                    Grade = "D";
                } else {
                    Grade = "F";
                }

        System.out.println("Total Marks: " + total_marks);
        System.out.println("Average Percentage: " + average_Percentage);
        System.out.println("Grade: " + Grade );

    }
}
