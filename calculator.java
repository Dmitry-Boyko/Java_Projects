package calculator;
import java.util.Scanner;
public class calculator {
 
  public static void main(String[] args) {
		// TODO Auto-generated method stub
int pick;
String enter = "\nEnter Number: ";
String ans = "Answer: ";
do {
	Scanner input = new Scanner(System.in);
	double fnum, snum, answer;
	System.out.println("\n1 | Addition");
	System.out.println("2 | Substraction");
	System.out.println("3 | Multiplication");
	System.out.println("4 | Division");
	System.out.println("5 | Exit\n");
	System.out.println("Choice: ");
	pick = input.nextInt();
	switch (pick) {
	case 1:
		System.out.print(enter);
		fnum = input.nextDouble();
		System.out.print(enter);
		snum = input.nextDouble();
		answer = fnum + snum;
		System.out.println(ans + answer);
	case 2:
		System.out.print(enter);
		fnum = input.nextDouble();
		System.out.print(enter);
		snum = input.nextDouble();
		answer = fnum - snum;
		System.out.println(ans + answer);
	case 3:
		System.out.print(enter);
		fnum = input.nextDouble();
		System.out.print(enter);
		snum = input.nextDouble();
		answer = fnum * snum;
		System.out.println(ans + answer);
	case 4:
		System.out.print(enter);
		fnum = input.nextDouble();
		System.out.print(enter);
		snum = input.nextDouble();
		answer = fnum / snum;
		System.out.println(ans + answer);
		input.close();	
			} 
		}  while(true); 
	}
}
