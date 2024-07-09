//Convert an Array into Collection in Java
package Yuvraj.ys;

import java.util.Arrays;
import java.util.List;

public class question5 {
	public static void main(String[] args) {

		String[] array = { "Apple", "Banana", "Cherry" };

		List<String> list = Arrays.asList(array);

		System.out.println("List: " + list);
	}
}
