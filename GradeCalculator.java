import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.0");
        df.setRoundingMode(RoundingMode.HALF_UP);
        
        System.out.println("This program is a grade calculator.");
        System.out.println("It will use the test scores entered to calculate the average and give a grade.");
        
        System.out.println("Name:");
        String name = scanner.nextLine();
        
        System.out.println("Score 1:");
        double score1 = Double.valueOf(scanner.nextLine());
        System.out.println("Score 2:");
        double score2 = Double.valueOf(scanner.nextLine());
        System.out.println("Score 3:");
        double score3 = Double.valueOf(scanner.nextLine());
        
        if (score1 > 100 || score1 < 0 || score2 > 100 || score2 < 0 || score3 > 100 || score3 < 0) {
            System.out.println("Error, score outside of range");
        }   else {
            
            double average = (score1 + score2 + score3) / 3;
        
            String grade;

            if (average >= 90) {
                grade = "A";
            }   else if (average >= 80) {
                grade = "B";
            }   else if (average >= 70) {
                grade = "C";
            }   else if (average >= 60) {
                grade = "D";
            }   else {
                grade = "F";
            }

            String msg;

            if (grade.equals("A")) {
                msg = "Congrats on getting an A!";
            }   else if ( grade.equals("B")) {
                msg = "Congrats on getting a B!";
            }   else if ( grade.equals("C")) {
                msg = "You can do better than a C next time!";
            }   else if ( grade.equals("D")) {
                msg = "You can do better than a D next time!";
            }   else {
                msg = "You should be doing better than an F!";
            }

            System.out.println("--- Report for " + name + " ---");
            System.out.println("Scores: " + score1 + ", " + score2 + ", " + score3);
            System.out.println("Average: " + df.format(average));
            System.out.println("Grade: " + grade);
            System.out.println(msg);
            
            String result = (grade.equals("F")) ? "Fail." : "Pass.";
            System.out.println("Result: " + result);
        }
    }
}