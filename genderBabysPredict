// Dmitry Boyko
package genderBabysPredict;
import java.util.Scanner;
public class GenderBabysPredict {
 
	/**
	 * @param args
	 * Predict Baby’s Gender
	* Mother’s age 32
	* Mother’s birth month 11 (November)
	* Month of conception 9 (September)
	* if result is odd it is a boy if it is even it is a girl.
	* 3 +2 +1 +1 +9 = 16 girl
	* 
	* int sum = 0;
	* int rem = a;
 
	* while(rem != 0)
	*{
	* sum += rem % 10;
	* rem = rem / 10;
	*}
 
	*System.out.println("sum = " + sum);
 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		double userInput_a = 0; // age
		double userInput_b = 0; // month of birth
		double userInput_c = 0; // conception
		
		double d = userInput_a + userInput_b;
		
		System.out.println("Method to Predict Baby’s Gender");
		System.out.println("Please enter your age below");
		
		userInput_a = stdin.nextDouble();
		
		System.out.println("Please enter your birth month (number)");
		
		userInput_b = stdin.nextInt();
		
		System.out.println("Please enter month of conception (normally 14 days after the first day of the menstrual period)");
		
		userInput_c = stdin.nextInt();
		//
		@SuppressWarnings("unused")
		int sum = 0;
		double rem = d;
 
		while(rem != 0)
		{
		sum += rem % 10;
		rem = rem / 10;
		}
		double e = d + userInput_c;
	 
		if ((e%2)==0) {
			//even
				System.out.println("You should expect a girl");
		}
		else
			// odd
			System.out.println("You should expect a boy");
		
		
		stdin.close();
 
	}
 
}
