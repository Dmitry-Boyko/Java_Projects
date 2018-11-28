public class ORConditionalExpression {
    public static void main(String args[]) {
        double account_balance = 050600.8;
        int age = 55;
        if(account_balance >= 100000 || age >= 65){
            System.out.println("You can retire now, Good Luck!");
        } else {
            System.out.println("You still need to safe money for retirement");
        }
    }
}
