public class Switch {
    public static void main(String[] args) {
        String grade = "B-"; // Student's grade
        switch (grade) {
            case "A+": case "A": case "A-":
                System.out.println("Great Student");
                break;
            case "B+": case "B": case "B-":
                 System.out.println("Good Student");
                 break;
            case "C+": case "C": case "C-":
                System.out.println("Poor Student");
                break;
            case "D+": case "D": case "D-":
                System.out.println("Very Poor Student");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
