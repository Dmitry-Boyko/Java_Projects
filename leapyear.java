package leapyear;
//Created by Dmitry Boyko
import java.util.Scanner;
public class LeapYear {
  public static void main(String[] args) {
	    int rem;
	    Scanner scan = new Scanner (System.in);
	    while(true){
	    System.out.println("\nPlease enter a year\n");
	     rem = scan.nextInt();
 
	    if (rem%400==0)	//if year is divisible by 400 then
	     {
	    	System.out.println("\nYour year is a leap year\n"); //is_leap_year
	     }
	     else if (rem%100==0)	//else if year is divisible by 100 then
	     {
	    	 System.out.println("\nYour year is not a leap year\n"); //not_leap_year
	     }
	     else if (rem%4 != 0)	//else if year is divisible by 4 then
	     {
	    	 System.out.println("\nYour year is a leap year"); //is_leap_year
	     }
	     else	// else
	    	 	     {
	     	System.out.println("\nYour year is not a leap year\n"); //not_leap_year
	     }
	    scan.close();
	   }
	}
}
