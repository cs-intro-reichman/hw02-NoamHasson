/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
		String word = args[0]; // abcde
		int length = word.length(); // 5 
		String res = "";
		int end = length - 1;
		int mid = length%2;

		for (int i=0;i<length;i++) {
			char x =word.charAt(end);
			res += x;
			end--;
		}
		System.out.println(res);
	
		if ( mid == 0 ) {

			System.out.println("The middle character is " + word.charAt((length/2)-1));
		} else {
			System.out.println("The middle character is " + word.charAt((length/2)) );
		}

   }
}