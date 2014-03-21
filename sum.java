package Sum;
import java.util.Scanner;
public class sum {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		// Prompt the user to enter 10 numbers
			System.out.println("Enter ten numbers: ");
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Enter number " + (i + 1));
				sum += input.nextInt();
			}
				// Display result
				System.out.println("The sum of ten numbers is " + sum);
				input.close();
	}
}
