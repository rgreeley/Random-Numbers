import java.util.Random;
import java.util.Scanner;

	public class OneShotHiLow
	{
		public static void main( String[] args )
		{
			Random r = new Random();
			Scanner keyboard = new Scanner(System.in);

			System.out.println( "I'm thinking of a number between 1-100. Try to guess it." );
			int guess = keyboard.nextInt();

			System.out.println();
		
			int number = 1 + r.nextInt(100);

			if ( number == guess )
				System.out.println( "You guessed it! What are the odds!?" );
			else if ( guess < number )
				System.out.println( "Sorry, you are too low. I was thinking of " + number );
			else if ( guess > number )
				System.out.println( "Sorry, you are too high. I was thinking of " + number );

		}
}




