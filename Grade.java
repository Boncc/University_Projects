import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        int points;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Points Awarded: ");
        points = input.nextInt();

        double grade = getGrade(points);
        System.out.println("Your Grade Is: " + grade);


    }

    public static double getGrade(int points) {
        double grade;
        if (points < 50) {
            grade = 2;
        } else if (points <= 60) {
            grade = 3;
        } else if (points <= 70) {
            grade = 3.5;
        } else if (points <= 80) {
            grade = 4;
        } else if (points <= 90) {
            grade = 4.5;
        } else grade = 5;

        return grade;
    }
}