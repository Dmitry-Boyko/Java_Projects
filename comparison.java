package scan10int;
import java.util.Scanner;
public class comparison {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int anum;
int large = Integer.MIN_VALUE; //Largest #
int small = Integer.MAX_VALUE; //Smallest #
for (int j = 1; j < 10; j++) {
System.out.print("Enter the " + j + " integer: ");
anum = input.nextInt();
if (anum < small) {
small = anum;
}
if (anum > large) {
large = anum;
}
}
System.out.println(large + " is the largest number you have given.");
System.out.println(small + " is the smallest number you have given.");
input.close();
}
}
