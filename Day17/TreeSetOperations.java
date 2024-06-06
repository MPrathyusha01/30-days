package Day17;

import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {
        // Create and initialize a TreeSet
        TreeSet<String> treeSet1 = new TreeSet<>(Arrays.asList("A", "B", "C", "D", "E"));

        // 1. Add elements to a TreeSet and print them
        System.out.println("Original TreeSet: " + treeSet1);

        // 2. Remove elements from a TreeSet
        treeSet1.remove("C");
        System.out.println("After removing 'C': " + treeSet1);

        // 3. Check if a TreeSet contains a specific element
        System.out.println("Contains 'A': " + treeSet1.contains("A"));
        System.out.println("Contains 'C': " + treeSet1.contains("C"));

        // 4. Find the size of a TreeSet
        System.out.println("Size of the TreeSet: " + treeSet1.size());

        // 5. Iterate through a TreeSet using different methods
        // Using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String element : treeSet1) {
            System.out.println(element);
        }

        // Using iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = treeSet1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Create another TreeSet for set operations
        TreeSet<String> treeSet2 = new TreeSet<>(Arrays.asList("D", "E", "F", "G"));

        // 6. Find the union of two TreeSets
        TreeSet<String> unionSet = new TreeSet<>(treeSet1);
        unionSet.addAll(treeSet2);
        System.out.println("Union of treeSet1 and treeSet2: " + unionSet);

        // 7. Find the intersection of two TreeSets
        TreeSet<String> intersectionSet = new TreeSet<>(treeSet1);
        intersectionSet.retainAll(treeSet2);
        System.out.println("Intersection of treeSet1 and treeSet2: " + intersectionSet);

        // 8. Find the difference of two TreeSets
        TreeSet<String> differenceSet = new TreeSet<>(treeSet1);
        differenceSet.removeAll(treeSet2);
        System.out.println("Difference of treeSet1 and treeSet2: " + differenceSet);

        // 9. Convert a TreeSet to an ArrayList
        ArrayList<String> arrayList = new ArrayList<>(treeSet1);
        System.out.println("TreeSet converted to ArrayList: " + arrayList);

        // 10. Find the frequency of each element in a TreeSet
        // Note: Frequency in a TreeSet is always 1 since TreeSet does not allow duplicates
        System.out.println("Frequency of each element in the TreeSet:");
        for (String element : treeSet1) {
            System.out.println(element + ": " + Collections.frequency(treeSet1, element));
        }
    }
}
