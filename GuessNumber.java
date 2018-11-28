import java.util.Scanner;

public class GuessNumber {
//    int intMin = 1;
//    int intMax = 100;

    public static void main(String[] args) {
        int secretNumber;
        secretNumber = (int) (Math.random() * 99 + 1);
        //System.out.println("Secret number is " + secretNumber);
        Scanner keyboard = new Scanner(System.in);
        int guess;
        System.out.println("Enter a guess number:  ");
        guess = keyboard.nextInt();
        System.out.println("You guess is " + guess);
        if (guess == secretNumber) {
            System.out.println("Your guess number was equal to machine guess: Your number >" + guess + " and computers number > " + secretNumber + ".");
        } else if (guess < secretNumber) {
            System.out.println("Your number to low. Machine's number was: " + secretNumber);
        } else if (guess > secretNumber){
            System.out.println("You guess number to high. Machine's number was: " + secretNumber);
        } else {
            System.out.println("Your input was wrong " + guess);
        }

    }
}