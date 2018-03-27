import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Hello.  What is your name?");
        String name = input.next();
		System.out.println("Hi, " + name + "!  How old are you?");
		int age = input.nextInt();
		System.out.println("So you're " + age + ", eh?  That's not old at all!" + "\nHow much do you make, " + name + "?");
        double salary = input.nextDouble();
		System.out.println(salary + "!  I hope that's per hour and not per year! LOL!");
	}
}