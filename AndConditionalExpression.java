public class AndConditionalExpression {
    public static void main(String args[]) {
        double grade = 4.0;

        if (grade == 4.0) {
            System.out.println("You are awesome student");
        } else if (grade >= 3.5 && grade < 4.0) {
            System.out.println("You are 'A' grade student");
        } else if (grade >= 3.0 && grade < 3.5) {
            System.out.println("You are 'B' grade student");
        } else if (grade >= 2.5 && grade < 3.0) {
            System.out.println("You are poor student");
        } else {
            System.out.println("You failed the class");
        }
    }


}
