import java.util.LinkedHashMap;
import java.util.Map;

public class question1 {
    public static void main(String[] args) {
      
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Put key-value pairs into the LinkedHashMap
        linkedHashMap.put("One", 1); linkedHashMap.put("Two", 2); linkedHashMap.put("Three", 3);

        // empty and get the size of the LinkedHashMap
        System.out.println("Is LinkedHashMap empty? " + linkedHashMap.isEmpty());
        System.out.println("LinkedHashMap size: " + linkedHashMap.size());

        //contains method
        System.out.println("Contains key 'Two'? " + linkedHashMap.containsKey("Two"));
        System.out.println("Contains value 3? " + linkedHashMap.containsValue(3));

        // Get method
        System.out.println("Value for key 'One': " + linkedHashMap.get("One"));

        // Remove a key-value 
        System.out.println("Removed value for key 'Two': " + linkedHashMap.remove("Two"));

        // Replace method
        linkedHashMap.replace("Three", 33);
        System.out.println("Replaced value for key 'Three': " + linkedHashMap.get("Three"));

        // Get all the keys, values, and entries
        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());
        System.out.println("Entries: " + linkedHashMap.entrySet());

        // Use putAll to copy all mappings from another LinkedHashMap
        Map<String, Integer> anotherMap = new LinkedHashMap<>();
        anotherMap.put("Five", 5); anotherMap.put("Six", 6);
        linkedHashMap.putAll(anotherMap);
        System.out.println("After putAll: " + linkedHashMap);

        // Replace all values in the LinkedHashMap
        linkedHashMap.replaceAll((key, value) -> value * 2);
        System.out.println("After replaceAll:");
        linkedHashMap.forEach((key, value) -> System.out.println(key + " = " + value));

        // Clone the LinkedHashMap (using the copy constructor)
        Map<String, Integer> clonedMap = new LinkedHashMap<>(linkedHashMap);
        System.out.println("Cloned LinkedHashMap: " + clonedMap);

        // Clear the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("Is LinkedHashMap empty after clear? " + linkedHashMap.isEmpty());
    }
}
