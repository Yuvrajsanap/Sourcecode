// boolean add method 

import java.util.LinkedHashSet;

public class question1 {

  public static void main(String[] args) {
   
    LinkedHashSet<String> names = new LinkedHashSet<>();

    // Add elements
    names.add("Yuvraj");
    names.add("Shubham");
    names.add("om");

    boolean duplicateAdded = names.add("Yuvraj");

    System.out.println("Elements in the LinkedHashSet : " + names);
    System.out.println("Duplicate added: " + duplicateAdded);
  }
}
