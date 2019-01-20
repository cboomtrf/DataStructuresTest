package complex;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class Complexity {
	
	public Complexity() {
		super();
	}
	
	/*
	 * Main method.
	 * 	Example where #n = approx 4.29x as much calculation time needed.. 120/28. n=16/n=8 == n becomes double as large. 
	 * 	You could also look at what happens with n=8/n=2 = 28/1 = 28... With small values of n it isn't correct.
	 * 	You could also look at what happens with n=18/n=6 = 153/15 = ~10,... x as much calculation time needed.
	 * 	Withn=300/n=100 = ~9. approx 9x as much calculation time.
	 * 
	 *  Assignment example "the number of stars for a given number = x"
	 * 	"What is the complexity in Big-Oh notation? 3x as many stars = 9x as much calculation time."
	 * 	"Show that the analysis is correct if it gives n*(n-1) / 2".
	 *  "O-notation of that == O (n^2 / 2)"
	 */
	public static void main(String[] args) {
		Complexity stars = new Complexity();
//		stars.stars(5);  		 //Example base-method
//		stars.printStars1();	 //Example further worked out example.
//		stars.printStars2(); 	 //Quadratic example.
//		stars.printStars3();	 //Quadratic but small change
		stars.printStars4();	 //Still quadratic, but with 3 for-loops! not to the third power! 
	}
	
	public void printStars4() {
		for (int n = 1; n < 20 ; n++) {
			int count = this.stars4(n);
			System.out.println("for N = " + n + " we printed " + count + " stars.\n"
					+ "The output is " + (double)count/n + " times as large as N."); // printing for private check.
			System.out.println("Expected: " + (5 * n * (n-1)/2) + ". ");
		}
	}
	
	/** Stars are still printed in n^2 with another for-loop. */
	public int stars4(int n) {
		int count = 0;
		for (int i = 0 ; i < n ; i++) { // n lineair
			for (int j = 0 ; j < i ; j++) { // n^2
				for (int k = 0 ; k < 5 ; k++ ) { // is not n^3, because independent from i and j. always 5. so: biggest power is n^2.
//					System.out.print("*");
					count++;
				}
			}
		}
//		System.out.println();
		return count;
	}
	
	public void printStars3() {
		for (int n = 1; n < 20 ; n++) {
			int count = this.stars3(n);
			System.out.println("for N = " + n + " we printed " + count + " stars.\n"
					+ "De uitvoer is " + (double)count/n + " keer zo groot als N.");
			System.out.println("Expected: " + (n*(n-1)/2) + ". ");
		}
	}
	
	/** Stars are now printed in n^2 and not linear with a small change.
	 * Subtle change: j < i */
	public int stars3(int n) {
		int k = 0;
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < i ; j++) {
//				System.out.print("*");
				k++;
			}
		}
//		System.out.println();
		return k;
	}
	
	public void printStars2() {
		for (int n = 1; n < 20 ; n++) {
			int count = this.stars2(n);
			System.out.println("for N = " + n + " we printed " + count + " stars.\n"
					+ "De invoer is " + (double)count/n + " keer zo groot.");
		}
	}
	
	/** Stars are now printed in n^2 and not linear.
	 * j < n. */
	public int stars2(int n) {
		int k = 0;
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n ; j++) {
//				System.out.print("*");
				k++;
			}
		}
//		System.out.println();
		return k;
	}

	/**
	 * Count printed stars.
	 */
	public void printStars1() {
		for (int n = 1; n < 20 ; n++) {
			int count = this.stars1(n);
			System.out.println("for N = " + n + " we printed " + count + " stars.");
		}
	}
	
	/**
	 * Stars are printed linear. Base-method.
	 * @param n
	 * @return
	 */
	public int stars1(int n) {
		int count = 0;
		for (int i = 0 ; i < n ; i++) {
			System.out.print("*");
			count++;
		}
		System.out.println();
		return count;
	}
	
	/**
	 * Assignment
	 * Given this base-method that prints stars linear....
	 * Make it count the stars
	 * And return back how many stars.
	 * @param n
	 * @return
	 */
	public void stars(int n) {
		for (int i = 0 ; i < n ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
