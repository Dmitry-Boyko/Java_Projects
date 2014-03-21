package reversString;
 
public class ReversHelloWorld {
 
  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "Good Morning";
 
		for (String part : source.split(" ")) {
		    System.out.print(new StringBuilder(part).reverse().toString());
		    System.out.print(" ");
		}
 
	}
 
}
