
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		//String b = "b";
		//String g = "g";
		//String sen1 = "";
		int p = 0;
		int f = 0;
		int count = 0;
		boolean term = true;

		while (term) {
			double child = Math.random();
			if ( child<0.5 ) {
				//sen1 += b + " ";
				System.out.print("b ");
				p++;
			} else  {
				//sen1 += g + " ";
				System.out.print("g ");
				f++;
			}
			count ++;
			if ( p!=0&&f!=0 ) {
				System.out.println();
				System.out.println("You made it... and you now have " + count + " children." );
				break;
			}
		}
	}
}
