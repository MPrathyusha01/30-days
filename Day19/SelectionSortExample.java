package Day19;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSortExample {
    // Method to perform Selection Sort on an ArrayList
    public static int selectionSort(ArrayList<Integer> numbers) {
        int size = numbers.size();
        int swapCount = 0; // Counter to keep track of the number of swaps

        // Repeat (size - 1) times
        for (int currentIndex = 0; currentIndex < size - 1; currentIndex++) {
            // Set the first unsorted element as the minimum
            int minIndex = currentIndex;

            // For each of the unsorted elements
            for (int unsortedIndex = currentIndex + 1; unsortedIndex < size; unsortedIndex++) {
                // If element < currentMinimum, set element as new minimum
                if (numbers.get(unsortedIndex) < numbers.get(minIndex)) {
                    minIndex = unsortedIndex;
                }
            }

            // Swap minimum with first unsorted position
            if (minIndex != currentIndex) {
                Collections.swap(numbers, currentIndex, minIndex);
                swapCount++; // Increment swap counter
            }
        }

        return swapCount; // Return the number of swaps made
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(64);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(90);
        numbers.add(34);

        System.out.println("Unsorted list: " + numbers);

        // Sorting the ArrayList using Selection Sort
        int swapCount = selectionSort(numbers);

        System.out.println("Sorted list: " + numbers);
        System.out.println("Total number of swaps: " + swapCount);
    }
}
