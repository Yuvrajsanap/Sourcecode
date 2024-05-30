import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class question1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Clear the map
        treeMap.clear();

        // Clone the map
        TreeMap<Integer, String> cloneMap = new TreeMap<>(treeMap);

        // Check if map contains a value
        boolean containsValue = treeMap.containsValue("value");

        //first entry method
        Map.Entry<Integer, String> firstEntry = treeMap.firstEntry();

        // Get the value for a specific key
        String value = treeMap.get(1);

        //last entry method
        Map.Entry<Integer, String> lastEntry = treeMap.lastEntry();

        //entry set method
        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();

        // Put a key-value pair
        treeMap.put(1, "value1");
        treeMap.put(2, "value2");
        treeMap.put(3, "value3");

        // Put all entries from another map
        treeMap.putAll(cloneMap);

        // Remove a key-value pair
        String removedValue = treeMap.remove(2);

        // Get the size of the map
        int size = treeMap.size();

        // Check if the map is empty
        boolean isEmpty = treeMap.isEmpty();

        // Head Map
        Map<Integer, String> headMap = treeMap.headMap(3);
        System.out.println("Head Map: " + headMap);

        // Sub Map
        Map<Integer, String> subMap = treeMap.subMap(1, 3);
        System.out.println("Sub Map: " + subMap);

        // Tail Map
        Map<Integer, String> tailMap = treeMap.tailMap(2);
        System.out.println("Tail Map: " + tailMap);

        // Last Key
        Integer lastKey = treeMap.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Demonstration
        System.out.println("TreeMap: " + entrySet);
        System.out.println("Contains Value 'value': " + containsValue);
        System.out.println("First Entry: " + firstEntry);
        System.out.println("Value for Key 1: " + value);
        System.out.println("Last Entry: " + lastEntry);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
    }
}
