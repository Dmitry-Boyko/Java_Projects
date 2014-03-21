package cube;
import java.util.Scanner;
public class cube {
 
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Print size of edge");
			double a = input.nextInt();
			double surfArea = 6 * Math.pow ( a, 2);
			double volume = Math.pow (a, 3);
				System.out.format("Surface area is %.2f and Volume is %.2f", surfArea, volume);
				input.close();
	}
}
