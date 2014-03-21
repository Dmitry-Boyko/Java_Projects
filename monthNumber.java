package MonthNumber;
import java.util.Scanner;
 
//done by Dmitry Boyko
 
public class monthnumber2 {
 
  public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
 
boolean askAgain = true;
String input = null;
 
while (askAgain)
{
askAgain = false;
input = null;
System.out.println("Pliase type a number between 1 and 12"); 
 
int choice = Keyboard.nextInt();
 
switch (choice) {
case 1: System.out.println("January");
	break;
case 2: System.out.println("February");
	break;
case 3: System.out.println("March");
	break;
case 4: System.out.println("April");
	break;
case 5: System.out.println("May");
	break;
case 6: System.out.println("June");
	break;
case 7: System.out.println("July");
	break;
case 8: System.out.println("August");
	break;
case 9: System.out.println("September");
	break;
case 10: System.out.println("October");
	break;
case 11: System.out.println("November");
	break;
case 12: System.out.println("Desember");
	break;
default: System.out.println("Sorry this number in invalid.\nWould you like to enter another number? [y/n]");
	input = Keyboard.next();
 
}
    if (input != null && input.equalsIgnoreCase("y"))
    {
        askAgain = true;
    }
    else
    {
        askAgain = false;
    }
}
	Keyboard.close();
 
	}
}
