package Day16;

import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create and initialize a HashSet
        HashSet<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C", "D", "E"));

        // 1. Add elements to a HashSet and print them
        System.out.println("Original HashSet: " + set1);

        // 2. Remove elements from a HashSet
        set1.remove("C");
        System.out.println("After removing 'C': " + set1);

        // 3. Check if a HashSet contains a specific element
        System.out.println("Contains 'A': " + set1.contains("A"));
        System.out.println("Contains 'C': " + set1.contains("C"));

        // 4. Find the size of a HashSet
        System.out.println("Size of the HashSet: " + set1.size());

        // 5. Iterate through a HashSet using different methods
        // Using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String element : set1) {
            System.out.println(element);
        }

        // Using iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Create another HashSet for set operations
        HashSet<String> set2 = new HashSet<>(Arrays.asList("D", "E", "F", "G"));

        // 6. Find the union of two HashSets
        HashSet<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of set1 and set2: " + unionSet);

        // 7. Find the intersection of two HashSets
        HashSet<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersectionSet);

        // 8. Find the difference of two HashSets
        HashSet<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference of set1 and set2: " + differenceSet);

        // 9. Convert a HashSet to an ArrayList
        ArrayList<String> arrayList = new ArrayList<>(set1);
        System.out.println("HashSet converted to ArrayList: " + arrayList);

        // 10. Find the frequency of each element in a HashSet
        // Note: Frequency in a HashSet is always 1 since HashSet does not allow duplicates
        System.out.println("Frequency of each element in the HashSet:");
        for (String element : set1) {
            System.out.println(element + ": " + Collections.frequency(set1, element));
        }
    }
}

