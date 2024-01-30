/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	
		int x = 0;
		int lim;
		do {
			lim = x;
			x = (int)((Math.random()) * 10); 
			if (x>=lim){
			System.out.println(x);
			}
		} while (x>=lim); 

		 }

   }