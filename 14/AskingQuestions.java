import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        System.out.print("How many feet tall are you? ");
        String heightFeet = input.next();

        System.out.print("And how many inches? ");
        String heightInches = input.next();
        
        System.out.print("How much do you weigh? ");
        double weight = input.nextDouble();
        
        System.out.println("So you're " + age + " old, " + heightFeet + "'" + heightInches + '"' + " tall and " + weight + " heavy.");
    }
}