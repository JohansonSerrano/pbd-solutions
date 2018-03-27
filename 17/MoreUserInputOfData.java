import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.print("First name: ");
		String firstName = input.next();
		System.out.print("Last name: ");
		String lastName = input.next();
		System.out.print("Grade (9-12): ");
		int grade = input.nextInt();
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		System.out.print("Login: ");
		String login = input.next();
		System.out.print("Average: ");
		double average = input.nextDouble();
			
		System.out.print("Your information:\n Login: " + login + "\nID:    " + studentId + "\nName:  " + lastName + ", " + firstName + "\nAvg:   " + average + "\nGrade: " + grade );
	}
}