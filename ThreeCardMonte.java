import java.util.Random;
import java.util.Scanner;

	public class ThreeCardMonte
	{
		public static void main( String[] args )
		{
				Random r = new Random();
				
				Scanner keyboard = new Scanner(System.in);
				
				int card = 1 + r.nextInt(3);

					System.out.println( "Time to play some Three Card Monte!" );

					System.out.println( "Where is the Ace?" );
					System.out.println();

					System.out.println( "\t\t## ## ##" );
					System.out.println( "\t\t## ## ##" );
					System.out.println( "\t\t1 2 3 " );

				System.out.print("\n> ");
				
				int guess = keyboard.nextInt();

					System.out.println();

				if ( guess == card )
					System.out.println( "How amazing!!!!!");
				else
					System.out.println( "Not this time. I believe you were looking for " + card );

				System.out.println();

				if ( card == 1 )
				{
					System.out.println( "\t\tAA ## ##" );
					System.out.println( "\t\tAA ## ##" );
					System.out.println( "\t\t1 2 3 " );
				}
				else if ( card == 2 )
				{
					System.out.println( "\t\t## AA ##" );
					System.out.println( "\t\t## AA ##" );
					System.out.println( "\t\t1 2 3 " );
				}
				else
				{
					System.out.println( "\t\t## ## AA" );
					System.out.println( "\t\t## ## AA" );
					System.out.println( "\t\t1 2 3 " );
				}
		}
}










