//How to Use Enumeration to Display Elements of Hashtable in Java?
package Yuvraj.ys;

import java.util.Enumeration;
import java.util.Hashtable;

public class question15 {
	public static void main(String[] args) {

		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("India", "Delhi");
		hashtable.put("Japan", "Tokyo");
		hashtable.put("France", "Paris");

		Enumeration<String> keys = hashtable.keys();

		System.out.println("Countries and their Capitals:");
		while (keys.hasMoreElements()) {
			String country = keys.nextElement();
			String capital = hashtable.get(country);
			System.out.println(country + " -> " + capital);
		}
	}
}
