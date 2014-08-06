import java.util.Random;

	public class FortuneCookie
	{
		public static void main( String[] args )
		{
			Random r = new Random();

			int fortune = 1 + r.nextInt(6), a, b, c, d, e, f;
			String response = " ";

			if ( fortune == 1 )
			response = "You will find happiness with a new love.";
			else if ( fortune == 2 )
			response = "Watch your back....";
			else if ( fortune == 3 )
			response = "Don't step on a crack....you know what will happen.....";
			else if ( fortune == 4 )
			response = "Today will not be your day....";
			else if ( fortune == 5 )
			response = "Soon you will know what its like to be happy.";
			else if ( fortune == 6 )
			response = "The tides of change are coming.";

			System.out.println( "Fortune cookie says: " + response );

			a = 1 + r.nextInt(54);
			b = 1 + r.nextInt(54);
			c = 1 + r.nextInt(54);
			d = 1 + r.nextInt(54);
			e = 1 + r.nextInt(54);
			f = 1 + r.nextInt(54);

			System.out.println( "Remember these numbers:" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f );
		}
}	



