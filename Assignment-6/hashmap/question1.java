import java.util.HashMap;
import java.util.Map;

public class question1 {
    public static void main(String[] args) {
  
        Map<String, Integer> hashMap = new HashMap<>();

        // Put some key-value pairs i
        hashMap.put("One", 1); hashMap.put("Two", 2); 
        hashMap.put("Three", 3);

        // Check if the HashMap is empty and get the size 
        System.out.println("Is HashMap empty? " + hashMap.isEmpty());
        System.out.println("HashMap size: " + hashMap.size());

        //contains method 
        System.out.println("Does HashMap contain key 'Two'? " + hashMap.containsKey("Two"));
        System.out.println("Does HashMap contain value 3? " + hashMap.containsValue(3));

        // Get the value
        System.out.println("Value for key 'One': " + hashMap.get("One"));

        // Remove a key-value pair from the HashMap
        System.out.println("Removed value for key 'Two': " + hashMap.remove("Two"));

        // Replace 
        hashMap.replace("Three", 33);
         System.out.println("Replaced value for key 'Three': " + hashMap.get("Three"));

        // Put a key-value pair only 
        hashMap.putIfAbsent("Four", 4); 
        System.out.println("Value for key 'Four' after putIfAbsent: " + hashMap.get("Four"));

        // Iterate 
        System.out.println("Iterating over HashMap entries:"); 
        hashMap.forEach((key, value) -> System.out.println(key + " = " + value));

        // Get all the keys, values, and entries
        System.out.println("HashMap keys: " + hashMap.keySet());
        System.out.println("HashMap values: " + hashMap.values());
        System.out.println("HashMap entries: " + hashMap.entrySet());

        //putAll
        Map<String, Integer> anotherMap = new HashMap<>();
         anotherMap.put("Five", 5); 
         anotherMap.put("Six", 6);
        hashMap.putAll(anotherMap);
         System.out.println("HashMap after putAll: " + hashMap);

        // Replace all values in the HashMap
        hashMap.replaceAll((key, value) -> value * 2); System.out.println("HashMap after replaceAll:"); hashMap.forEach((key, value) -> System.out.println(key + " = " + value));

        // Clone the HashMap
        HashMap<String, Integer> clonedMap = new HashMap<>(hashMap); System.out.println("Cloned HashMap: " + clonedMap);

        // Clear the HashMap
        hashMap.clear(); System.out.println("Is HashMap empty after clear? " + hashMap.isEmpty());
    }
}
