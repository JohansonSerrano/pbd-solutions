import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Give me a word!");
        input.next();
		System.out.print("Give me a second word!");
        input.next();
		System.out.print("Great, now your favorite number?");
        input.next();
		System.out.print("And your second-favorite number...");
        input.next();
		System.out.print("Whew!  Wasn't that fun?");
	}
}