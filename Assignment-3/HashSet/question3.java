//contain method

import java.util.HashSet;

public class question3 {

  public static void main(String[] args) {
  
    HashSet<String> countries = new HashSet<>();

    countries.add("India");
    countries.add("Germany");
    countries.add("Italy");

    // Check if elements exist
    boolean hasIndia = countries.contains("India");
    boolean hasSpain = countries.contains("Spain");

    System.out.println("France is present: " + hasIndia);
    System.out.println("Spain is present: " + hasSpain);
  }
}
