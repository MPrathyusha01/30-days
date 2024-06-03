package Day14;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Declaration and Initialization
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding Elements
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        System.out.println("Initial TreeMap: " + treeMap);

        // Accessing Elements
        System.out.println("Value for key 2: " + treeMap.get(2)); // Output: Two

        // Removing Elements
        treeMap.remove(3); // Removes the entry with key 3
        System.out.println("TreeMap after removal: " + treeMap);

        // Iterating through the TreeMap
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
