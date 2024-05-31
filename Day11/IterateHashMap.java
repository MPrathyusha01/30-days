package Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // For-each loop for entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // For-each loop for keys
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        // For-each loop for values
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Using an iterator
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
