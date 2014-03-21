package testFunction;
import java.util.Scanner;
 
public class FuncA2i {
 
  public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter some data " + "\n");
		String a;
		a = input.next();
  
		double b = Double.parseDouble(a);
 
		System.out.println("\n" + "Your data was parsed: " + b);
		input.close();
	}
	
}
