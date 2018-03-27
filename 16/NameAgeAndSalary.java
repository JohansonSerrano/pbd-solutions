import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Hello.  What is your name?\n");
        String name = input.next();
		System.out.print("Hi, " + name + "!  How old are you?\n");
		int age = input.nextInt();
		System.out.print("So you're " + age + ", eh?  That's not old at all!" + "\nHow much do you make, " + name + "?\n");
        double salary = input.nextDouble();
		System.out.print(salary + "!  I hope that's per hour and not per year! LOL!");
	}
}