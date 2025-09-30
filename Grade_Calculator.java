import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter total number of subjects to calculate grade
        System.out.println("Enter total number of subjects: ");
        int numSubjects = sc.nextInt();
        int totalMarks = 0;

        for(int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject " + i + "(out of 100): ");
            int marks = sc.nextInt();

        // Input validation
        while(marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
            System.out.println("Enter marks for subject " + i + "(out of 100): ");
            marks = sc.nextInt();
        }
        totalMarks += marks;
    }

    System.out.println("Student Result...");
    System.out.println("Total  obtained in all subjects: " + totalMarks);

    // Calculate Average
    double average = (double) totalMarks / numSubjects;
    System.out.printf("Average: %.2f\n", average);

    // Grade Calculation
    if(average >= 90) {
        System.out.println(" Your Grade: A+");
    } else if(average >= 80) {
        System.out.println("Your Grade: B");
    } else if(average >= 70) {
        System.out.println("Your Grade: B+");
    } else if(average >= 60) {
        System.out.println("Your Grade: C+");
    } else if(average >= 50) {
        System.out.println("Your Grade: C");
    } else if(average >= 40) {
        System.out.println("Your Grade: D+");
    } else if(average >= 30) {
        System.out.println("Your Grade: D");
    } else {
        System.out.println("Your Grade: E");
   
    } 

    sc.close();
    }
}

