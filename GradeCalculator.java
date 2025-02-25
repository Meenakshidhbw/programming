import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");  
        int mark = scanner.nextInt(); 
        String grade;

        if (mark >= 90) {
            grade = "A";
        } else if (mark >= 80) {
            grade = "B";
        } else if (mark >= 70) {
            grade = "C";
        } else if (mark >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("The grade for the mark " + mark + " is: " + grade);
    }
}

