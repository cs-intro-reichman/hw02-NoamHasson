/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]); 
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
				double child = Math.random();
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

	}
}
