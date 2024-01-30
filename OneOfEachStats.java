import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed); 
		int p = 0;
		int f = 0;
		int count = 0;
		int sum = 0;
		int avr;
		int twos = 0;
		int threes = 0;
		int foursM = 0;
		int comNum;
		boolean term = true;

		for (int i=0;i<T;i++) {

			p = 0;
			f = 0;
			count = 0;
			while (term) {
				double child = generator.nextDouble();
				if ( child<0.5 ) {
					//System.out.print("b ");
					p++;
				} else  {
					//System.out.print("g ");
					f++;
				}
				count ++;
				if ( p!=0&&f!=0 ) {
					//System.out.println();
					//System.out.println("You made it... and you now have " + count + " children." );
					break;
				}
			}
			sum += count;
				if ( count==2 ) {
					twos++;
				} else if ( count==3 ) {
					threes++;
				} else {
					foursM++;
				}
       }		
	   		avr = sum/T; 
	   			if ( twos>threes&&twos>foursM ) {
					comNum=2;
				} else if ( threes>twos&&threes>foursM ) {
					comNum=3;
				} else { 
					comNum=4;
				}	
	   		System.out.println("Average: " + avr + " children to get at least one of each gender.");
	   		System.out.println("Number of families with 2 children: " + twos);
			System.out.println("Number of families with 3 children: " + threes);
			System.out.println("Number of families with 4 or more children: " + foursM);			
			System.out.println("The most common number of children is " +comNum );
		 
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
