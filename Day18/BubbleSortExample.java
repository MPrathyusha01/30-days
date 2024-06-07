package Day18;
import java.util.ArrayList;

public class BubbleSortExample {
    // Method to perform Bubble Sort on an ArrayList
    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;
        // Outer loop to traverse through all elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap if elements are in the wrong order
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no elements were swapped, the list is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(34);
        list.add(25);
        list.add(12);
        list.add(22);
        list.add(11);
        list.add(90);

        System.out.println("Unsorted list: " + list);
        
        // Sorting the ArrayList using Bubble Sort
        bubbleSort(list);

        System.out.println("Sorted list: " + list);
    }
}
