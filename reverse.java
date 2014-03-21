package reverse;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
//
public class Reverse {
  public static void main(String[] args) {
	//public static void reverse(Object[] arr) {
		//List<Object> list = Arrays.asList(arr);
		// Collections.reverse(list);
		// return list.toArray();
		// }
		//
		// }
		List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
