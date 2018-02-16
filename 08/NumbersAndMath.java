public class NumbersAndMath
{
	public static void main( String[] args )
	{
		// Outputs message of what the program is going to do
		System.out.println("I will now count my chickens:");

		// Counts the number of chickens
		System.out.println("Hens " + (25.0 + 30 / 6));
		System.out.println("Roosters " + ( 100.0 - 25 * 3 % 4));

		// Outputs message of what the program is going to do
		System.out.println( "Now I will count the eggs:" );

		// Counts the number of eggs
		System.out.println( 3.0 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

		// Outputs message of what the program is going to do
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		// Solves equation
		System.out.println( 3.0 + 2 < 5 - 7 );

		// Ask random equation and solves equation
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7 ) );

		// Outputs message of what the program is going to do
		System.out.println( "Oh, that's why it's false." );

		// Outputs message of what the program is going to do
		System.out.println( "How about some more." );

		// Tells if it is greater or equal
		System.out.println( "Is it greater? " + ( 5.0 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2 ) );
	}
}