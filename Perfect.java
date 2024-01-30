/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int N = Integer.parseInt(args[0]); // 6
		String res = N + " is a perfect number since " + N + " = 1";
		int div = 2;
		int finale = 1;
		
		for (int i=0;i<N;i++) {
			if ( N%div==0&&div!=N ) {
				res += " + " + div;
				finale += div;
			}
			div++;
		 }
		if ( N==finale ) {
			System.out.println(res);
		} else {
			System.out.println(N + " is not a perfect number");
		}
	}
}

