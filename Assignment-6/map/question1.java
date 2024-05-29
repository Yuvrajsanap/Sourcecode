import java.util.HashMap;
import java.util.Map;

public class question1 {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // empty and get the size of the map
        System.out.println("Is map empty? " + map.isEmpty());
        System.out.println("Map size: " + map.size());

        //contains 
        System.out.println("Does map contain key 'Two'? " + map.containsKey("Two"));
        System.out.println("Does map contain value 3? " + map.containsValue(3));

        // Get the value
        System.out.println("Value for key 'One': " + map.get("One"));

        // Remove a key-value pair
        Integer removedValue = map.remove("Two");
        if (removedValue != null) {
            System.out.println("Removed value for key 'Two': " + removedValue);
        } else {
            System.out.println("Key 'Two' not found");
        }

        // Replace
        map.replace("Three", 33);
        System.out.println("Replaced value for key 'Three': " + map.get("Three"));

        // Iterate
        System.out.println("Iterating over map entries:");
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        // Get all the keys and values
        System.out.println("Map keys: " + map.keySet());
        System.out.println("Map values: " + map.values());
        System.out.println("Map entries: " + map.entrySet());

        //putAll
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Four", 4);
        anotherMap.put("Five", 5);
        map.putAll(anotherMap);
        System.out.println("Map after putAll: " + map);

        // Get the hashCode 
        System.out.println("Map hashCode: " + map.hashCode());

        // Clear
        map.clear();
        System.out.println("Is map empty after clear? " + map.isEmpty());
    }
}
