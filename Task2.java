import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter marks of subject 1:");
        int marks1 = s.nextInt();

        System.out.println("Enter marks of subject 2:");
        int marks2 = s.nextInt();

        System.out.println("Enter marks of subject 3:");
        int marks3 = s.nextInt();

        System.out.println("Enter marks of subject 4:");
        int marks4 = s.nextInt();

        System.out.println("Enter marks of subject 5:");
        int marks5 = s.nextInt();

        int Total = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("The total marks are: " + Total);

        double per = (Total / 5.0);
        System.out.println("The percentage is: " + per + "%");

        char grade;
        if (per >= 90) {
            grade = 'A';
        } else if (per >= 80) {
            grade = 'B';
        } else if (per >= 70) {
            grade = 'C';
        } else if (per >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The grade is: " + grade);
        
    }
}
