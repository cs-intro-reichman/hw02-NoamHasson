/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]); 
		int div = 1;

		for (int i=0;i<=num;i++) {
			if ( num%div==0 ) {
				System.out.println(div);
			}
			div++;
		}
	}
}
